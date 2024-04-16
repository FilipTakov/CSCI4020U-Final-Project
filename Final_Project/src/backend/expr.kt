package backend

abstract class Expr {
    abstract fun eval(runtime:Runtime):Data
}

class NoneExpr(): Expr() {
    override fun eval(runtime:Runtime) = None
}

object NullExpr: Expr() {
    override fun eval(runtime:Runtime): Data = NullData
}

class IntLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = IntData(Integer.parseInt(lexeme))
}

class StringLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = StringData(lexeme)
}

class BooleanLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = BooleanData(lexeme.equals(true))
}


class ArrayExpr(val elements: List<Expr>): Expr() {
    override fun eval(runtime: Runtime): Data {
        // Evaluate each element in the array
        val evaluatedElements = elements.map { it.eval(runtime) }
        // Create an ArrayData object with the evaluated elements
        return ArrayData(evaluatedElements)
    }
}

class Print(val expr: Expr): Expr() {
    override fun eval(runtime: Runtime): Data {
        val data = expr.eval(runtime)
        println(data.toString()) // Print the evaluated expression
        return data // Return the evaluated data
    }
}



enum class Operator {
    Add,
    Sub,
    Mul,
    Div,
    Addtwice
}

class Arithmetics(
    val op: Operator,
    val left: Expr,
    val right: Expr
) : Expr() {
    override fun eval(runtime: Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)

        return when (op) {
            Operator.Add -> {
                if (x is StringData && y is StringData) {
                    StringData(x.value + y.value)
                } 
                else if (x is IntData && y is IntData) {
                    IntData(x.value + y.value)
                }
                else {
                    throw Exception("cannot concatenate non-string operands")
                }
            }
            Operator.Sub -> {
                if (x is IntData && y is IntData) {
                    IntData(x.value - y.value)
                } else {
                    throw Exception("cannot subtract operands of non-integer type")
                }
            }
            Operator.Mul -> {
                if (x is IntData && y is IntData) {
                    IntData(x.value * y.value)
                } else if (x is StringData && y is IntData) {
                    StringData(x.value.repeat(y.value))
                } else if (y is StringData && x is IntData) {
                    StringData(y.value.repeat(x.value))
                } else {
                    throw Exception("cannot multiply operands of non-integer type")
                }
            }
            Operator.Div -> {
                if (x is IntData && y is IntData) {
                    if (y.value != 0) {
                        IntData(x.value / y.value)
                    } else {
                        throw Exception("cannot divide by zero")
                    }
                } else {
                    throw Exception("cannot divide operands of non-integer type")
                }
            }
            Operator.Addtwice -> {
                if (x is StringData && y is StringData) {
                    StringData(x.value + y.value)
                } else {
                    throw Exception("cannot concatenate non-string operands")
                }
            }
            else -> throw Exception("Unknown operator")
        }
    }
}

enum class Comparator {
    LT, // <
    LE, // <=
    GT, // >
    GE, // >=
    EQ, // ==
    NE, // !=
}

class Compare(
    val comparator: Comparator,
    val left: Expr,
    val right: Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if(x is IntData && y is IntData) {
            return BooleanData(
                when(comparator) {
                    Comparator.LT -> x.value < y.value
                    Comparator.LE -> x.value <= y.value
                    Comparator.GT -> x.value > y.value
                    Comparator.GE -> x.value >= y.value
                    Comparator.EQ -> x.value == y.value
                    Comparator.NE -> x.value != y.value
                }
            )
        } else {
            throw Exception("Non-integer data in comparison")
        }
    }
}

class Assign(val symbol:String, val expr:Expr): Expr() {
    override fun eval(runtime:Runtime): Data
    = expr.eval(runtime).apply {
        runtime.symbolTable.put(symbol, this)
    }
}

class Deref(val name:String): Expr() {
    override fun eval(runtime:Runtime):Data {
        val data = runtime.symbolTable[name]
        if(data == null) {
            throw Exception("$name is not assigned.")
        }
        return data
    }
}

class Block(val exprList: List<Expr>): Expr() {
    override fun eval(runtime:Runtime): Data {
        var result:Data = NullData
        exprList.forEach {
            result = it.eval(runtime)
        }
        return result
    }
}



class IfElse(
    val cond: Expr,
    val trueExpr: Expr,
    val falseExpr: Expr
) : Expr() {
    override fun eval(runtime: Runtime): Data {
       val condData = cond.eval(runtime)
       val flag = (condData as BooleanData).value
       return if(flag) {
           trueExpr.eval(runtime)
       } else {
           falseExpr.eval(runtime)
       }
    }
}

class While(val cond:Expr, val body:Expr): Expr() {
    override fun eval(runtime:Runtime): Data {
        var flag = cond.eval(runtime) as BooleanData
        var result:Data = NullData
        var iter:Int = 1_000_000
        while(flag.value) {
            result = body.eval(runtime)
            flag = cond.eval(runtime) as BooleanData
            if(iter == 0) {
                println("MAX_ITER reached")
                println(runtime)
                return NullData
            }
            iter --
        }
        return result
    }
}

class FuncData(
    val name: String,
    val params: List<String>,
    val body: Expr
): Data() {
    override fun toString()
    = params.joinToString(", ").let {
        "$name($it) { ... }"
    }
}

class Declare(
    val name: String,
    val params: List<String>,
    val body: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data
    = FuncData(name, params, body).also {
        runtime.symbolTable[name] = it
    }
}

class Invoke(val name:String, val args:List<Expr>):Expr() {
    override fun eval(runtime:Runtime):Data {
        val func:Data? = runtime.symbolTable[name]
        if(func == null) {
            throw Exception("$name does not exist")
        }
        if(func !is FuncData) {
            throw Exception("$name is not a function.")
        }
        if(func.params.size != args.size) {
            throw Exception(
                "$name expects ${func.params.size} arguments "
                + "but received ${args.size}"
            )
        }
        
        val r = runtime.subscope(
            func.params.zip(args.map {it.eval(runtime)}).toMap()
        )
        return func.body.eval(r)
    }
}