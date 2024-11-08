package `2_functions`

fun main() {
    // Basic lambda to add two numbers
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println("Addition: ${add(2, 3)}")

    // Multi-line lambda
    val complexOperation: (Int, Int) -> Int = { a, b ->
        val sum = a + b
        val product = a * b
        product - sum
    }
    println("Complex operation: ${complexOperation(4, 2)}")

    // Lambda with filter and map
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenSquares = numbers
        .filter { it % 2 == 0 }      // Filters even numbers
        .map { it * it }             // Squares each even number
    println("Even squares: $evenSquares")

    // Using `it` in a lambda (when there's only one parameter)
    val names = listOf("Alice", "Bob", "Charlie")
    val shortNames = names.filter { it.length <= 4 }
    println("Short names: $shortNames")

    // Lambda with `forEach`
    numbers.forEach { number ->
        println("Number: $number")
    }

    // Assigning a lambda to a variable and using it
    val printMessage: (String) -> Unit = { message -> println(message) }
    printMessage("Hello from lambda!")
}
