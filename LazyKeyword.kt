package com.example.designpatterns

val greeting: String by lazy {
    println("Computing greeting...")
    "Hello, Akshaya"
}

fun main() {
    println("Program started")
    println("Accessing greeting for the first time:")
    println(greeting)     // First access → triggers lazy block
    println("Accessing greeting again:")
    println(greeting)     // Second access → uses cached value
}
