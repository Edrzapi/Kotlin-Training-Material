package `3_oop`

// Base class representing an Animal with genus and age properties
open class Animal(val genus: String, var age: Int) {
    // Additional constructors with flexibility for genus and age initialization
    constructor(age: Int) : this("Unknown", age)
    constructor(genus: String) : this(genus, 0)

    // Method that all animals share
    open fun describe() {
        println("This is a $genus, and it is $age years old.")
    }
}

// Subclass representing a specific type of animal (Dog) that inherits from Animal
class Dog(genus: String, age: Int, val breed: String) : Animal(genus, age) {
    // Overriding the describe method
    override fun describe() {
        println("This is a $breed dog, part of the $genus genus, and it is $age years old.")
    }
}


// Subclass representing a Human that inherits from Animal and adds more specific properties
open class Human(
    private var firstName: String,
    private var lastName: String,
    private var role: String,
    genus: String,
    age: Int
) :
    Animal(genus, age) {
    override fun describe() {
        println(
            "My name is $firstName $lastName, a ${Human::class.simpleName} " +
                    "is part of the $genus genus, and currently I am $age years old."
        )
    }


}

fun main() {
    var jim = Human("Jim", "Jimson", "Jimanic", "Homo", 25)
    jim.describe()
}
