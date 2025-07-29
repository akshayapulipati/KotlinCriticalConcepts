package com.example.designpatterns

interface Animal {
    fun sound()
}

class Dog : Animal {
    override fun sound() = println("Woof")
}

class Cat : Animal {
    override fun sound() = println("Meow")
}

object AnimalFactory {
    fun getAnimal(type: String): Animal {
        return when (type.lowercase()) {
            "dog" -> Dog()
            "cat" -> Cat()
            else -> throw IllegalArgumentException("Unknown animal")
        }
    }
}
fun main() {
    val animal = AnimalFactory.getAnimal("dog")
    animal.sound()  // Woof
}
