package com.example.designpatterns

//superclass
open class Animal1{
    open fun sound(){
        println("some sound")
    }
}
//subclass
class Dogs:Animal1(){
    override fun sound() {
        println("bark")
    }
}
fun main(){
    val dog =Dogs()
    dog.sound()
}