package `1_datatypes`

// Extension function for nullable String to check if it's null or empty
fun String?.isReallyNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}

class NullableTypes {

    // Nullable type
    private var number: Int? = 1

    // Non-nullable type
    private var name: String = "Alice"

    private val nullName: String? = null  // Set to null for demonstration purposes

    fun nullCheck() {
        number = null // allowed as the ? was used
//        name = null // not allowed

        val sizeOfName = nullName?.length // Safe call, checks for null before accessing length
        val length = nullName?.length ?: 0 // Elvis operator returns 0 if nullName is null
        println("Size of name: $sizeOfName, Length with Elvis operator: $length")

        // Safe cast example
        val safeNumber: Int? = name as? Int  // Safe casting, returns null if name is not an Int
        println("Safe cast result (name as Int?): $safeNumber")
    }

    // Use let function for null checks
    fun printIfNotNull() {
        nullName?.let {
            println("Non-null name: $it")
        } ?: println("nullName is null")
    }

    // Safe collection example with listOfNotNull
    fun safeCollectionExample(): List<String> {
        return listOfNotNull("Alice", null, "Bob")  // Returns ["Alice", "Bob"], excluding nulls
    }

    // Greeting function with Elvis operator for default value
    fun greet(name: String?) {
        println("Hello, ${name ?: "Guest"}!")
    }

    // Nullable return type example
    fun findNumber(id: Int): Int? {
        // Returns null if id is not found in some hypothetical list
        return if (id < 10) id else null
    }
}

fun main() {
    val nullableTypes = NullableTypes()

    // Demonstrate null checks and operations
    nullableTypes.nullCheck()
    nullableTypes.printIfNotNull()

    // Greet with nullable handling
    nullableTypes.greet(null)
    nullableTypes.greet("Alice")

    // Safe collection example
    println("Safe collection example: ${nullableTypes.safeCollectionExample()}")

    // Nullable extension function example
    val nullableString: String? = null
    println("Is null or empty (custom extension): ${nullableString.isReallyNullOrEmpty()}")
}
