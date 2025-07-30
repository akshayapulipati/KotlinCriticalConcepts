package com.example.designpatterns

data class Person(val name: String, val age: Int)

fun main() {
    val p1 = Person("Akshaya", 24)

    println(p1) // toString() => Person(name=Akshaya, age=24)

    val p2 = p1.copy(age = 25)
    println(p2) // Person(name=Akshaya, age=25)

    // Destructuring
    val (n, a) = p2
    println("Name: $n, Age: $a") // Name: Akshaya, Age: 25

    // Comparison
    val p3 = Person("Akshaya", 24)
    println(p1 == p3) // true, checks content (not memory)
}
