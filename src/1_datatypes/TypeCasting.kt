package `1_datatypes`

class TypeCasting {

    // Implicit Casting (automatic type promotion)
    fun demonstrateImplicitCasting() {
        val intVal: Int = 42
        val doubleVal: Double = intVal.toDouble() // Implicit casting from Int to Double
        println("Implicit Casting: $doubleVal")  // Output: 42.0
    }

    // Explicit Casting (manually casting types)
    fun demonstrateExplicitCasting() {
        val anyValue: Any = "Hello, Kotlin!"
        val stringValue: String = anyValue as String  // Explicit casting using 'as'
        println("Explicit Casting: $stringValue")  // Output: Hello, Kotlin!
    }

    // Safe Casting (avoiding ClassCastException)
    fun demonstrateSafeCasting() {
        val anyValue: Any = 42
        val stringValue: String? = anyValue as? String  // Safe cast: returns null if the cast is invalid
        if (stringValue == null) {
            println("Safe Casting: Casting failed, returned null")
        } else {
            println("Safe Casting: $stringValue")
        }
        // Output: Safe Casting: Casting failed, returned null
    }

    // Handling ClassCastException (manual error handling)
    fun demonstrateClassCastExceptionHandling() {
        try {
            val anyValue: Any = 42
            val stringValue: String = anyValue as String  // This will throw ClassCastException
        } catch (e: ClassCastException) {
            println("ClassCastException Handling: ${e.message}")  // Output: Cannot cast kotlin.Int to kotlin.String
        }
    }

    // Casting between Number types (Int to Double, etc.)
    fun demonstrateNumberCasting() {
        val intVal: Int = 123
        val doubleVal: Double = intVal.toDouble()  // Convert Int to Double
        val longVal: Long = intVal.toLong()        // Convert Int to Long
        val floatVal: Float = intVal.toFloat()     // Convert Int to Float

        println("Number Casting: $doubleVal, $longVal, $floatVal")
        // Output: Number Casting: 123.0, 123, 123.0
    }
}

fun main() {
    val typeCasting = TypeCasting()

    // Demonstrate different type casting operations
    typeCasting.demonstrateImplicitCasting()
    typeCasting.demonstrateExplicitCasting()
    typeCasting.demonstrateSafeCasting()
    typeCasting.demonstrateClassCastExceptionHandling()
    typeCasting.demonstrateNumberCasting()
}

