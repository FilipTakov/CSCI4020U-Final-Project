// Generated from java-escape by ANTLR 4.11.1

    import backend.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Identifier=13, Integer=14, Boolean=15, String=16, 
		MUL=17, DIV=18, ADD=19, SUB=20, ADDTWICE=21, RANGE=22, LT=23, LE=24, GT=25, 
		GE=26, EQ=27, NE=28, LINE_COMMENT=29, WHITESPACE=30, BOOLEAN=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_printStatement = 3, 
		RULE_functionDeclaration = 4, RULE_parameterList = 5, RULE_functionInvocation = 6, 
		RULE_argumentList = 7, RULE_whileLoop = 8, RULE_ifElseStatement = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "printStatement", "functionDeclaration", 
			"parameterList", "functionInvocation", "argumentList", "whileLoop", "ifElseStatement", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'print'", "'('", "')'", "'function'", "'{'", "'}'", 
			"','", "'while'", "'if'", "'else'", null, null, null, null, "'*'", "'/'", 
			"'+'", "'-'", "'++'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Identifier", "Integer", "Boolean", "String", "MUL", "DIV", "ADD", 
			"SUB", "ADDTWICE", "RANGE", "LT", "LE", "GT", "GE", "EQ", "NE", "LINE_COMMENT", 
			"WHITESPACE", "BOOLEAN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expr expr;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> statements = new ArrayList<>();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				((ProgramContext)_localctx).statement = statement();
				 statements.add(((ProgramContext)_localctx).statement.expr); 
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147576920L) != 0 );
			setState(30);
			match(EOF);
			((ProgramContext)_localctx).expr =  new Block(statements);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr expr;
		public AssignmentContext assignment;
		public FunctionDeclarationContext functionDeclaration;
		public FunctionInvocationContext functionInvocation;
		public PrintStatementContext printStatement;
		public WhileLoopContext whileLoop;
		public IfElseStatementContext ifElseStatement;
		public ExpressionContext expression;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((StatementContext)_localctx).assignment = assignment();
				setState(34);
				match(T__0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).assignment.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).functionDeclaration.expr;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				((StatementContext)_localctx).functionInvocation = functionInvocation();
				setState(41);
				match(T__0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).functionInvocation.expr;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				((StatementContext)_localctx).printStatement = printStatement();
				setState(45);
				match(T__0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).printStatement.expr;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				((StatementContext)_localctx).whileLoop = whileLoop();
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).whileLoop.expr;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				((StatementContext)_localctx).ifElseStatement = ifElseStatement();
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).ifElseStatement.expr;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				((StatementContext)_localctx).expression = expression(0);
				setState(55);
				match(T__0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).expression.expr;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Expr expr;
		public Token Identifier;
		public ExpressionContext expression;
		public TerminalNode Identifier() { return getToken(PLParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			((AssignmentContext)_localctx).Identifier = match(Identifier);
			setState(61);
			match(T__1);
			setState(62);
			((AssignmentContext)_localctx).expression = expression(0);
			((AssignmentContext)_localctx).expr =  new Assign((((AssignmentContext)_localctx).Identifier!=null?((AssignmentContext)_localctx).Identifier.getText():null), ((AssignmentContext)_localctx).expression.expr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__2);
			setState(66);
			match(T__3);
			setState(67);
			((PrintStatementContext)_localctx).e = expression(0);
			setState(68);
			match(T__4);
			((PrintStatementContext)_localctx).expr =  new Print(((PrintStatementContext)_localctx).e.expr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public Expr expr;
		public Token Identifier;
		public ParameterListContext parameterList;
		public StatementContext statement;
		public TerminalNode Identifier() { return getToken(PLParser.Identifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			((FunctionDeclarationContext)_localctx).Identifier = match(Identifier);
			setState(73);
			match(T__3);
			setState(74);
			((FunctionDeclarationContext)_localctx).parameterList = parameterList();
			setState(75);
			match(T__4);
			setState(76);
			match(T__6);
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				((FunctionDeclarationContext)_localctx).statement = statement();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147576920L) != 0 );
			setState(82);
			match(T__7);

			        List<String> params = new ArrayList<>();
			        for (Token param : ((FunctionDeclarationContext)_localctx).parameterList.tokens) {
			            params.add(param.getText());
			        }
			        ((FunctionDeclarationContext)_localctx).expr =  new Declare((((FunctionDeclarationContext)_localctx).Identifier!=null?((FunctionDeclarationContext)_localctx).Identifier.getText():null), params, ((FunctionDeclarationContext)_localctx).statement.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<Token> tokens;
		public Token id;
		public List<TerminalNode> Identifier() { return getTokens(PLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PLParser.Identifier, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((ParameterListContext)_localctx).id = match(Identifier);
			((ParameterListContext)_localctx).tokens =  new ArrayList<>(); _localctx.tokens.add(((ParameterListContext)_localctx).id);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(87);
				match(T__8);
				setState(88);
				((ParameterListContext)_localctx).id = match(Identifier);
				_localctx.tokens.add(((ParameterListContext)_localctx).id);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionInvocationContext extends ParserRuleContext {
		public Expr expr;
		public Token Identifier;
		public ArgumentListContext argumentList;
		public TerminalNode Identifier() { return getToken(PLParser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((FunctionInvocationContext)_localctx).Identifier = match(Identifier);
			setState(96);
			match(T__3);
			setState(97);
			((FunctionInvocationContext)_localctx).argumentList = argumentList();
			setState(98);
			match(T__4);

			        List<Expr> args = new ArrayList<>();
			        for (Expr arg : ((FunctionInvocationContext)_localctx).argumentList.exprs) {
			            args.add(arg);
			        }
			        ((FunctionInvocationContext)_localctx).expr =  new Invoke((((FunctionInvocationContext)_localctx).Identifier!=null?((FunctionInvocationContext)_localctx).Identifier.getText():null), args);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<Expr> exprs;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((ArgumentListContext)_localctx).e = expression(0);
			((ArgumentListContext)_localctx).exprs =  new ArrayList<>(); _localctx.exprs.add(((ArgumentListContext)_localctx).e.expr);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(103);
				match(T__8);
				setState(104);
				((ArgumentListContext)_localctx).e = expression(0);
				_localctx.exprs.add(((ArgumentListContext)_localctx).e.expr);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext condition;
		public StatementContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileLoop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__9);
			setState(113);
			match(T__3);
			setState(114);
			((WhileLoopContext)_localctx).condition = expression(0);
			setState(115);
			match(T__4);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					((WhileLoopContext)_localctx).body = statement();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}

			        ((WhileLoopContext)_localctx).expr =  new While(((WhileLoopContext)_localctx).condition.expr, ((WhileLoopContext)_localctx).body.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatementContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext condition;
		public StatementContext trueBranch;
		public StatementContext falseBranch;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__10);
			setState(125);
			match(T__3);
			setState(126);
			((IfElseStatementContext)_localctx).condition = expression(0);
			setState(127);
			match(T__4);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					((IfElseStatementContext)_localctx).trueBranch = statement();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T__11);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						((IfElseStatementContext)_localctx).falseBranch = statement();
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}

			        ((IfElseStatementContext)_localctx).expr =  new IfElse(((IfElseStatementContext)_localctx).condition.expr, ((IfElseStatementContext)_localctx).trueBranch.expr, ((IfElseStatementContext)_localctx).falseBranch.expr);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext left;
		public Token id;
		public Token int1;
		public Token str;
		public Token bool1;
		public ExpressionContext e;
		public ExpressionContext right;
		public TerminalNode Identifier() { return getToken(PLParser.Identifier, 0); }
		public TerminalNode Integer() { return getToken(PLParser.Integer, 0); }
		public TerminalNode String() { return getToken(PLParser.String, 0); }
		public TerminalNode BOOLEAN() { return getToken(PLParser.BOOLEAN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PLParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(PLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PLParser.SUB, 0); }
		public TerminalNode LT() { return getToken(PLParser.LT, 0); }
		public TerminalNode LE() { return getToken(PLParser.LE, 0); }
		public TerminalNode GT() { return getToken(PLParser.GT, 0); }
		public TerminalNode GE() { return getToken(PLParser.GE, 0); }
		public TerminalNode EQ() { return getToken(PLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PLParser.NE, 0); }
		public TerminalNode ADDTWICE() { return getToken(PLParser.ADDTWICE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(146);
				((ExpressionContext)_localctx).id = match(Identifier);
				((ExpressionContext)_localctx).expr =  new Deref((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null));
				}
				break;
			case Integer:
				{
				setState(148);
				((ExpressionContext)_localctx).int1 = match(Integer);
				((ExpressionContext)_localctx).expr =  new IntLiteral((((ExpressionContext)_localctx).int1!=null?((ExpressionContext)_localctx).int1.getText():null));
				}
				break;
			case String:
				{
				setState(150);
				((ExpressionContext)_localctx).str = match(String);
				((ExpressionContext)_localctx).expr =  new StringLiteral((((ExpressionContext)_localctx).str!=null?((ExpressionContext)_localctx).str.getText():null));
				}
				break;
			case BOOLEAN:
				{
				setState(152);
				((ExpressionContext)_localctx).bool1 = match(BOOLEAN);
				((ExpressionContext)_localctx).expr =  new BooleanLiteral((((ExpressionContext)_localctx).bool1!=null?((ExpressionContext)_localctx).bool1.getText():null));
				}
				break;
			case T__3:
				{
				setState(154);
				match(T__3);
				setState(155);
				((ExpressionContext)_localctx).e = expression(0);
				setState(156);
				match(T__4);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).e.expr;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(162);
						match(MUL);
						setState(163);
						((ExpressionContext)_localctx).right = expression(12);
						 ((ExpressionContext)_localctx).expr =  new Arithmetics(Operator.Mul, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(167);
						match(DIV);
						setState(168);
						((ExpressionContext)_localctx).right = expression(11);
						 ((ExpressionContext)_localctx).expr =  new Arithmetics(Operator.Div, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						match(ADD);
						setState(173);
						((ExpressionContext)_localctx).right = expression(10);
						 ((ExpressionContext)_localctx).expr =  new Arithmetics(Operator.Add, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						match(SUB);
						setState(178);
						((ExpressionContext)_localctx).right = expression(9);
						 ((ExpressionContext)_localctx).expr =  new Arithmetics(Operator.Sub, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
						match(LT);
						setState(183);
						((ExpressionContext)_localctx).right = expression(8);
						 ((ExpressionContext)_localctx).expr =  new Compare(Comparator.LT, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
						match(LE);
						setState(188);
						((ExpressionContext)_localctx).right = expression(7);
						 ((ExpressionContext)_localctx).expr =  new Compare(Comparator.LE, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						match(GT);
						setState(193);
						((ExpressionContext)_localctx).right = expression(6);
						 ((ExpressionContext)_localctx).expr =  new Compare(Comparator.GT, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						match(GE);
						setState(198);
						((ExpressionContext)_localctx).right = expression(5);
						 ((ExpressionContext)_localctx).expr =  new Compare(Comparator.GE, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(EQ);
						setState(203);
						((ExpressionContext)_localctx).right = expression(4);
						 ((ExpressionContext)_localctx).expr =  new Compare(Comparator.EQ, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(NE);
						setState(208);
						((ExpressionContext)_localctx).right = expression(3);
						 ((ExpressionContext)_localctx).expr =  new Compare(Comparator.NE, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(212);
						match(ADDTWICE);
						setState(213);
						((ExpressionContext)_localctx).right = expression(2);
						 ((ExpressionContext)_localctx).expr =  new Arithmetics(Operator.Addtwice, ((ExpressionContext)_localctx).left.expr, ((ExpressionContext)_localctx).right.expr);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001;\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004O\b\u0004\u000b\u0004\f\u0004P\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007l\b\u0007"+
		"\n\u0007\f\u0007o\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\bv\b\b\n\b\f\by\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u0082\b\t\n\t\f\t\u0085\t\t\u0001\t\u0001\t\u0005\t\u0089\b"+
		"\t\n\t\f\t\u008c\t\t\u0003\t\u008e\b\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a0\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d9\b\n\n"+
		"\n\f\n\u00dc\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00ef\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000"+
		"\u0006A\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nU\u0001\u0000"+
		"\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000"+
		"\u0010p\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u009f"+
		"\u0001\u0000\u0000\u0000\u0016\u001a\u0006\u0000\uffff\uffff\u0000\u0017"+
		"\u0018\u0003\u0002\u0001\u0000\u0018\u0019\u0006\u0000\uffff\uffff\u0000"+
		"\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005\u0000\u0000\u0001\u001f \u0006\u0000\uffff\uffff\u0000"+
		" \u0001\u0001\u0000\u0000\u0000!\"\u0003\u0004\u0002\u0000\"#\u0005\u0001"+
		"\u0000\u0000#$\u0006\u0001\uffff\uffff\u0000$;\u0001\u0000\u0000\u0000"+
		"%&\u0003\b\u0004\u0000&\'\u0006\u0001\uffff\uffff\u0000\';\u0001\u0000"+
		"\u0000\u0000()\u0003\f\u0006\u0000)*\u0005\u0001\u0000\u0000*+\u0006\u0001"+
		"\uffff\uffff\u0000+;\u0001\u0000\u0000\u0000,-\u0003\u0006\u0003\u0000"+
		"-.\u0005\u0001\u0000\u0000./\u0006\u0001\uffff\uffff\u0000/;\u0001\u0000"+
		"\u0000\u000001\u0003\u0010\b\u000012\u0006\u0001\uffff\uffff\u00002;\u0001"+
		"\u0000\u0000\u000034\u0003\u0012\t\u000045\u0006\u0001\uffff\uffff\u0000"+
		"5;\u0001\u0000\u0000\u000067\u0003\u0014\n\u000078\u0005\u0001\u0000\u0000"+
		"89\u0006\u0001\uffff\uffff\u00009;\u0001\u0000\u0000\u0000:!\u0001\u0000"+
		"\u0000\u0000:%\u0001\u0000\u0000\u0000:(\u0001\u0000\u0000\u0000:,\u0001"+
		"\u0000\u0000\u0000:0\u0001\u0000\u0000\u0000:3\u0001\u0000\u0000\u0000"+
		":6\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\r\u0000"+
		"\u0000=>\u0005\u0002\u0000\u0000>?\u0003\u0014\n\u0000?@\u0006\u0002\uffff"+
		"\uffff\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000"+
		"BC\u0005\u0004\u0000\u0000CD\u0003\u0014\n\u0000DE\u0005\u0005\u0000\u0000"+
		"EF\u0006\u0003\uffff\uffff\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0006\u0000\u0000HI\u0005\r\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u0003"+
		"\n\u0005\u0000KL\u0005\u0005\u0000\u0000LN\u0005\u0007\u0000\u0000MO\u0003"+
		"\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005\b\u0000\u0000ST\u0006\u0004\uffff\uffff\u0000T\t\u0001"+
		"\u0000\u0000\u0000UV\u0005\r\u0000\u0000V\\\u0006\u0005\uffff\uffff\u0000"+
		"WX\u0005\t\u0000\u0000XY\u0005\r\u0000\u0000Y[\u0006\u0005\uffff\uffff"+
		"\u0000ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_`\u0005\r\u0000\u0000`a\u0005\u0004\u0000"+
		"\u0000ab\u0003\u000e\u0007\u0000bc\u0005\u0005\u0000\u0000cd\u0006\u0006"+
		"\uffff\uffff\u0000d\r\u0001\u0000\u0000\u0000ef\u0003\u0014\n\u0000fm"+
		"\u0006\u0007\uffff\uffff\u0000gh\u0005\t\u0000\u0000hi\u0003\u0014\n\u0000"+
		"ij\u0006\u0007\uffff\uffff\u0000jl\u0001\u0000\u0000\u0000kg\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\u000f\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000pq\u0005\n\u0000\u0000qr\u0005\u0004\u0000\u0000rs\u0003\u0014\n"+
		"\u0000sw\u0005\u0005\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"z{\u0006\b\uffff\uffff\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0005\u000b"+
		"\u0000\u0000}~\u0005\u0004\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f"+
		"\u0083\u0005\u0005\u0000\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u008d\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u008a\u0005\f\u0000\u0000\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008e"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0086"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0006\t\uffff\uffff\u0000\u0090\u0013"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0006\n\uffff\uffff\u0000\u0092\u0093"+
		"\u0005\r\u0000\u0000\u0093\u00a0\u0006\n\uffff\uffff\u0000\u0094\u0095"+
		"\u0005\u000e\u0000\u0000\u0095\u00a0\u0006\n\uffff\uffff\u0000\u0096\u0097"+
		"\u0005\u0010\u0000\u0000\u0097\u00a0\u0006\n\uffff\uffff\u0000\u0098\u0099"+
		"\u0005\u001f\u0000\u0000\u0099\u00a0\u0006\n\uffff\uffff\u0000\u009a\u009b"+
		"\u0005\u0004\u0000\u0000\u009b\u009c\u0003\u0014\n\u0000\u009c\u009d\u0005"+
		"\u0005\u0000\u0000\u009d\u009e\u0006\n\uffff\uffff\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u0091\u0001\u0000\u0000\u0000\u009f\u0094\u0001"+
		"\u0000\u0000\u0000\u009f\u0096\u0001\u0000\u0000\u0000\u009f\u0098\u0001"+
		"\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u00a0\u00da\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\n\u000b\u0000\u0000\u00a2\u00a3\u0005\u0011"+
		"\u0000\u0000\u00a3\u00a4\u0003\u0014\n\f\u00a4\u00a5\u0006\n\uffff\uffff"+
		"\u0000\u00a5\u00d9\u0001\u0000\u0000\u0000\u00a6\u00a7\n\n\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0012\u0000\u0000\u00a8\u00a9\u0003\u0014\n\u000b\u00a9"+
		"\u00aa\u0006\n\uffff\uffff\u0000\u00aa\u00d9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\n\t\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad\u00ae"+
		"\u0003\u0014\n\n\u00ae\u00af\u0006\n\uffff\uffff\u0000\u00af\u00d9\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\n\b\u0000\u0000\u00b1\u00b2\u0005\u0014"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0014\n\t\u00b3\u00b4\u0006\n\uffff\uffff"+
		"\u0000\u00b4\u00d9\u0001\u0000\u0000\u0000\u00b5\u00b6\n\u0007\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0017\u0000\u0000\u00b7\u00b8\u0003\u0014\n\b\u00b8"+
		"\u00b9\u0006\n\uffff\uffff\u0000\u00b9\u00d9\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\n\u0006\u0000\u0000\u00bb\u00bc\u0005\u0018\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0014\n\u0007\u00bd\u00be\u0006\n\uffff\uffff\u0000\u00be\u00d9"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0005\u0000\u0000\u00c0\u00c1\u0005"+
		"\u0019\u0000\u0000\u00c1\u00c2\u0003\u0014\n\u0006\u00c2\u00c3\u0006\n"+
		"\uffff\uffff\u0000\u00c3\u00d9\u0001\u0000\u0000\u0000\u00c4\u00c5\n\u0004"+
		"\u0000\u0000\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c7\u0003\u0014"+
		"\n\u0005\u00c7\u00c8\u0006\n\uffff\uffff\u0000\u00c8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\n\u0003\u0000\u0000\u00ca\u00cb\u0005\u001b\u0000"+
		"\u0000\u00cb\u00cc\u0003\u0014\n\u0004\u00cc\u00cd\u0006\n\uffff\uffff"+
		"\u0000\u00cd\u00d9\u0001\u0000\u0000\u0000\u00ce\u00cf\n\u0002\u0000\u0000"+
		"\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0003\u0014\n\u0003\u00d1"+
		"\u00d2\u0006\n\uffff\uffff\u0000\u00d2\u00d9\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\n\u0001\u0000\u0000\u00d4\u00d5\u0005\u0015\u0000\u0000\u00d5\u00d6"+
		"\u0003\u0014\n\u0002\u00d6\u00d7\u0006\n\uffff\uffff\u0000\u00d7\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d8\u00a1\u0001\u0000\u0000\u0000\u00d8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00ab\u0001\u0000\u0000\u0000\u00d8\u00b0"+
		"\u0001\u0000\u0000\u0000\u00d8\u00b5\u0001\u0000\u0000\u0000\u00d8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00d8\u00bf\u0001\u0000\u0000\u0000\u00d8\u00c4"+
		"\u0001\u0000\u0000\u0000\u00d8\u00c9\u0001\u0000\u0000\u0000\u00d8\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d9\u00dc"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\f\u001c:P\\mw\u0083\u008a\u008d\u009f\u00d8\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}