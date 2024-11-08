package `2_functions`

fun main() {
    // Passing a function reference
    println("Addition result: ${operate(5, 3, ::add)}")

    // Passing a lambda as a parameter
    println("Subtraction result: ${operate(10, 5) { a, b -> a - b }}")

    // Using a function that returns another function
    val doubler = createMultiplier(2)
    println("Double of 4: ${doubler(4)}")

    // Using a higher-order function with a lambda that has multiple lines
    val result = operate(4, 5) { a, b ->
        val product = a * b
        product + 10
    }
    println("Complex operation result: $result")
}

// Higher-order function that takes a function as a parameter
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// A function to return another function
fun createMultiplier(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}


