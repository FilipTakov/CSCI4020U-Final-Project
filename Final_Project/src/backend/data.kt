package backend

abstract class Data

object None:Data() {
    override fun toString() = "None"
}

object NullData: Data() {
    override fun toString(): String = "NULL"
}

class IntData(val value:Int): Data() {
    override fun toString(): String = "Int:$value"
}

class StringData(val value:String): Data() {
    override fun toString(): String = 
        //if(value.length > 10) {
        //    "String:\"${value.substring(0, 10)}...\""
        //} else {
            "String:$value"
        //}
}

class BooleanData(val value: Boolean): Data() {
    override fun toString(): String
    = if(value) {
        "true"
    } else {
        "false"
    }
}



class ArrayData(val elements: List<Data>): Data() {
    override fun toString(): String {
        // Convert the array elements to a string representation
        return elements.joinToString(", ", "[", "]")
    }
}
