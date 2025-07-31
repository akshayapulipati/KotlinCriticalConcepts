package com.example.designpatterns



class MyHelper {

    companion object {
        //  @JvmField → exposes property as a public field (no getter)
        @JvmField
        val version: String = "1.0.0"

        //  @JvmStatic → allows static-style access in Java
        @JvmStatic
        fun printVersion() {
            println("App Version: $version")
        }

        //  @JvmOverloads → generates overloaded methods for Java
        @JvmOverloads
        fun greetUser(name: String = "Guest", greeting: String = "Hello") {
            println("$greeting, $name!")
        }
    }
}
fun main() {
    // Accessing @JvmField property
    println(MyHelper.version) // Output: 1.0.0

    // Calling @JvmStatic function
    MyHelper.printVersion()   // Output: App Version: 1.0.0

    // Calling @JvmOverloads function
    MyHelper.greetUser()
    MyHelper.greetUser("Akshaya")
    MyHelper.greetUser("Akshaya", "Welcome back")
}


