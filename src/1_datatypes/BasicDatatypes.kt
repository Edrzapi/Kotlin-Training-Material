package `1_datatypes`


class BasicDatatypes {

    // val is used for immutable variables, meaning their reference cannot be reassigned.
    // They are equivalent to 'final' variables in Java. Use val when the value will not change.

    val number = 1 // Int
    val longNumber = 10000000 // Long (inferred by Kotlin)
    val lNumber = 1L // Explicit Long declaration with "L" suffix
    val eightBit: Byte = 1 // Byte
    val name: String = "name" // String
    val str = "name" // String (inferred)
    val digit = 0.1 // Double (default for floating-point numbers)
    val decimal: Float = 1.222222f // Float, using "f" suffix for precision
    // Kotlin does have type inferring, so you only need to be explicit when there isn't an obvious use. E.g
    val shorty: Short = 1 // Short
    val unsignedShort: UShort = 1u // Unsigned Short, using "u" suffix for unsigned

    // var is used for mutable variables, which can be reassigned after declaration.
    // Use var when the value is expected to change over time.

    var charOfSomething: Char = '1' // Char, mutable for future reassignment
}
