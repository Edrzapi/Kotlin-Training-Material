package `5_collections`

fun main() {
    val map = mapOf(
        "Alice" to 25,
        "Bob" to 30,
        "Charlie" to 35
    )

    // Accessing a value by key
    val aliceAge = map["Alice"]
    println("Alice's age: $aliceAge")

    // Transforming values: Add 5 years to each person's age
    val updatedMap = map.mapValues { it.value + 5 }
    println("Updated ages: $updatedMap")

    // Filtering: Get people older than 30
    val olderThan30 = map.filter { it.value > 30 }
    println("People older than 30: $olderThan30")

    // Keys: Get the list of names (keys)
    val keys = map.keys
    println("Names: $keys")

    // Values: Get the list of ages (values)
    val values = map.values
    println("Ages: $values")
}
