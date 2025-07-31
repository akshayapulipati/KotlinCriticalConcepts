package com.example.designpatterns

class UserOne {
    var age: Int = 0
        set(value) {
            if (value in 0..150) {
                field = value
            } else {
                println("Invalid age: $value")
            }
        }
}
fun main() {
    val user = UserOne()
    user.age = 25      // valid
    println(user.age)  // 25

    user.age = -10     //  invalid
    println(user.age)  // still 25
}
