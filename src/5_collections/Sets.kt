package `5_collections`

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(4, 5, 6, 7, 8)
    var set3 = mutableSetOf(5, 6, 7, 3245, 21, 352, 4, 5)

    // Union: Combine two sets (no duplicates)
    val union = set1.union(set2)
    println("Union: $union")

    // Intersection: Get common elements
    val intersection = set1.intersect(set2)
    println("Intersection: $intersection")

    // Difference: Get elements in set1 but not in set2
    val difference = set1.subtract(set2)
    println("Difference (set1 - set2): $difference")

    // Add an element to a set
    val mutableSet = set1.toMutableSet()
    mutableSet.add(6)
    println("Mutable set after adding 6: $mutableSet")

    // Remove an element from a set
    mutableSet.remove(1)
    println("Mutable set after removing 1: $mutableSet")
}
