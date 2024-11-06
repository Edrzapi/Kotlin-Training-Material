package `1_datatypes`

class StringOperations {

    // String Interpolation: Easily combine variables and text
    fun demonstrateInterpolation() {
        val name = "Alice"
        val age = 30
        val greeting = "Hello, my name is $name and I am $age years old."
        println(greeting)  // Output: Hello, my name is Alice and I am 30 years old.
    }

    // String Length: Get the length of a string
    fun demonstrateStringLength() {
        val message = "Hello, Kotlin!"
        println("Length of the message: ${message.length}")  // Output: 14
    }

    // String Comparison: Check if two strings are equal
    fun demonstrateStringComparison() {
        val string1 = "Hello"
        val string2 = "hello"
        val areEqual = string1.equals(string2, ignoreCase = true)
        println("Are the strings equal (ignoring case)? $areEqual")  // Output: true
    }

    // Substring Extraction: Extract a portion of a string
    fun demonstrateSubstringExtraction() {
        val text = "Kotlin Programming"
        val substring = text.substring(0, 6)  // Extracts "Kotlin"
        println("Substring: $substring")  // Output: Kotlin
    }

    // String Conversion: Convert to uppercase and lowercase
    fun demonstrateStringConversion() {
        val str = "Kotlin"
        println("Uppercase: ${str.uppercase()}")  // Output: KOTLIN
        println("Lowercase: ${str.lowercase()}")  // Output: kotlin
    }

    // Null Safety with Strings: Handling nullable strings safely
    fun demonstrateNullSafety() {
        val nullableString: String? = null

        // Safe call with ?. to avoid NullPointerException
        val length = nullableString?.length ?: "String is null"
        println("Length: $length")  // Output: String is null
    }

    // Trim and Replace: Trim whitespaces and replace characters in a string
    fun demonstrateTrimAndReplace() {
        val dirtyString = "   Hello, Kotlin!   "
        val cleanString = dirtyString.trim()  // Removes leading and trailing spaces
        val replacedString = cleanString.replace("Kotlin", "Java")  // Replace word
        println("Trimmed and Replaced: $replacedString")  // Output: Hello, Java!
    }
}

fun main() {
    // Create an instance of StringOperations class to call the methods
    val stringOps = StringOperations()

    // Call different methods to demonstrate string operations
    stringOps.demonstrateInterpolation()
    stringOps.demonstrateStringLength()
    stringOps.demonstrateStringComparison()
    stringOps.demonstrateSubstringExtraction()
    stringOps.demonstrateStringConversion()
    stringOps.demonstrateNullSafety()
    stringOps.demonstrateTrimAndReplace()
}
