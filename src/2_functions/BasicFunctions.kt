package `2_functions`

fun main() {
    greet("Alice")           // Uses provided name
    greet()                   // Uses default name
    greet(name = "Bob")       // Named argument example

    println(add(5, 3))        // Simple addition
    println(add(5))           // Uses default value for b

    println(maxOfThree(5, 10, 3))  // Finds the maximum of three numbers
}

// Function with a default parameter
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

// Function with multiple parameters, one with a default value
fun add(a: Int, b: Int = 0): Int {
    return a + b
}

// Single-expression function with three parameters
fun maxOfThree(a: Int, b: Int, c: Int) = maxOf(a, maxOf(b, c))

// Function with Unit return type (can omit "Unit")
fun printMessage(message: String) {
    println(message)
}

// Overloading functions
fun multiply(a: Int, b: Int): Int = a * b
fun multiply(a: Double, b: Double): Double = a * b
