grammar PL;

@header {
    import backend.*;
}


program returns [Expr expr]: 
    {List<Expr> statements = new ArrayList<>();}
    (statement { statements.add($statement.expr); })+ EOF
    {$expr = new Block(statements);};

statement returns [Expr expr]:
      assignment ';' {$expr = $assignment.expr;}
    | functionDeclaration {$expr = $functionDeclaration.expr;}
    | functionInvocation ';' {$expr = $functionInvocation.expr;}
    | printStatement ';' {$expr = $printStatement.expr;}
    | whileLoop {$expr = $whileLoop.expr;}
    | ifElseStatement {$expr = $ifElseStatement.expr;}
    | expression ';' {$expr = $expression.expr;};

assignment returns [Expr expr]
    : Identifier '=' expression {$expr = new Assign($Identifier.text, $expression.expr);};
    
printStatement returns [Expr expr]:
    'print' '(' e=expression ')' {$expr = new Print($e.expr);}
    ;

functionDeclaration returns [Expr expr]
    : 'function' Identifier '(' parameterList ')' '{' statement+ '}'
    {
        List<String> params = new ArrayList<>();
        for (Token param : $parameterList.tokens) {
            params.add(param.getText());
        }
        $expr = new Declare($Identifier.text, params, $statement.expr);
    };

parameterList returns [List<Token> tokens]
    : id=Identifier {$tokens = new ArrayList<>(); $tokens.add($id);}
    (',' id=Identifier {$tokens.add($id);})*;

functionInvocation returns [Expr expr]
    : Identifier '(' argumentList ')'
    {
        List<Expr> args = new ArrayList<>();
        for (Expr arg : $argumentList.exprs) {
            args.add(arg);
        }
        $expr = new Invoke($Identifier.text, args);
    };

argumentList returns [List<Expr> exprs]
    : e=expression {$exprs = new ArrayList<>(); $exprs.add($e.expr);}
    (',' e=expression {$exprs.add($e.expr);})*;


whileLoop returns [Expr expr]
    : 'while' '(' condition=expression ')' body=statement*
    {
        $expr = new While($condition.expr, $body.expr);
    }
    ;


ifElseStatement returns [Expr expr]
    : 'if' '(' condition=expression ')' trueBranch=statement* ('else' falseBranch=statement*)?
    {
        $expr = new IfElse($condition.expr, $trueBranch.expr, $falseBranch.expr);
    }
    ;


/*
array returns [Expr expr]
    : ('[' ( e=expression {$expr = e.expr;} ( ',' e=expression {$expr = e.expr;})* )? ']' ) 
    ;

*/

expression returns [Expr expr]
    : id=Identifier {$expr = new Deref($id.text);}
    | int1=Integer {$expr = new IntLiteral($int1.text);}
    | str=String {$expr = new StringLiteral($str.text);}
    | bool1=BOOLEAN {$expr = new BooleanLiteral($bool1.text);}    
    | '(' e=expression ')' {$expr = $e.expr;}
    | left=expression MUL right=expression { $expr = new Arithmetics(Operator.Mul, $left.expr, $right.expr);}
    | left=expression DIV right=expression { $expr = new Arithmetics(Operator.Div, $left.expr, $right.expr);}
    | left=expression ADD right=expression { $expr = new Arithmetics(Operator.Add, $left.expr, $right.expr);}
    | left=expression SUB right=expression { $expr = new Arithmetics(Operator.Sub, $left.expr, $right.expr);}
    
    | left=expression LT right=expression { $expr = new Compare(Comparator.LT, $left.expr, $right.expr);}
    | left=expression LE right=expression { $expr = new Compare(Comparator.LE, $left.expr, $right.expr);}
    | left=expression GT right=expression { $expr = new Compare(Comparator.GT, $left.expr, $right.expr);}
    | left=expression GE right=expression { $expr = new Compare(Comparator.GE, $left.expr, $right.expr);}
    | left=expression EQ right=expression { $expr = new Compare(Comparator.EQ, $left.expr, $right.expr);}
    | left=expression NE right=expression { $expr = new Compare(Comparator.NE, $left.expr, $right.expr);}
    
    | left=expression ADDTWICE right=expression { $expr = new Arithmetics(Operator.Addtwice, $left.expr, $right.expr);}
;


Identifier : [a-zA-Z]+ ;
Integer    : [0-9]+ ;
Boolean    : ('true' | 'false') ;
String     : '"' (~["\r\n"])* '"' ;



MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
ADDTWICE: '++';
RANGE: '..';

LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
EQ: '==';
NE: '!=';

LINE_COMMENT: '//' ~[\r\n]* -> skip;
WHITESPACE : [ \t\r\n] -> skip;





