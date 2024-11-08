package `3_oop`

import javax.print.attribute.standard.MediaSize.Other

//Compile-time Polymorphism (Static Polymorphism) – Achieved through method overloading.
//Runtime Polymorphism (Dynamic Polymorphism) – Achieved through method overriding

open class Thing {
    open fun sound() = println("Some animal sound")
}

class OtherThing : Thing() {
    override fun sound() = println("Bark")  // Runtime polymorphism
}

interface Shape {
    fun draw()  // Method contract
}

class Circle : Shape {
    override fun draw() = println("Circle")  // Runtime polymorphism
}

class Square : Shape {
    override fun draw() = println("Sq")  // Runtime polymorphism
}

class Rectangle : Shape {
    override fun draw() = println("Rec")  // Runtime polymorphism
}

fun main() {
    val animal: Thing = OtherThing()  // Animal reference, Dog object (runtime polymorphism)
    animal.sound()  // Output: Bark
    val shapes: List<Shape> = listOf(Circle(), Rectangle(), Square())  // Compile-time polymorphism
    shapes.forEach { it.draw() }
}
