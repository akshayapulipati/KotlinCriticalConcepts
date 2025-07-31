package com.example.designpatterns

class PersonOne {
    var name: String = "Unknown"
        get() {
            println("Getter called")
            return field.uppercase()
        }
        set(value) {
            println("Setter called")
            field = value.trim()
        }
}
fun main() {
    val person = PersonOne()

    person.name = "   akshaya   "  // triggers setter
    println(person.name)           // triggers getter
}
