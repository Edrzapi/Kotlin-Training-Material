package `5_collections`

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val names = mutableListOf("bob", "hanana")

    // Filtering: Get even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    // Transforming: Multiply each number by 2
    val multiplied = numbers.map { it * 2 }
    println("Numbers multiplied by 2: $multiplied")

    // Sorting: Sort in descending order
    val sortedNumbers = numbers.sortedDescending()
    println("Sorted numbers: $sortedNumbers")

    // First element: Get the first element
    val firstElement = numbers.first()
    println("First element: $firstElement")

    // Sum: Get the sum of the list
    val sum = numbers.sum()
    println("Sum of numbers: $sum")

    // Add to list
    names.add(1, "Bobby")
    names.add(3, "Sam")
    names.forEach(System.out::println)
}
