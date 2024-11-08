package `3_oop`

interface Vehicle {
    val speed: Int  // Abstract property
    val regNo: String
        get() = "${('A'..'Z').random()}${('A'..'Z').random()}${(5..75).random()} ${('A'..'Z').random()}${('A'..'Z').random()}${('A'..'Z').random()}"

}

class Car : Vehicle {
    override val speed: Int = 120  // Providing implementation for the abstract property
}


// Interfaces can inherit from interfaces
interface A {
    fun aMethod()
}

interface B : A {
    fun bMethod()
}

class C : B {
    override fun bMethod() {
        println("")
    }

    override fun aMethod() {
        println()
    }
}

fun main() {
    val car = Car()
    println("Speed of the car: ${car.speed}")  // Output: Speed of the car: 120
}
