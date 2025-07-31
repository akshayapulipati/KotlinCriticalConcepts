package com.example.designpatterns

class GuideNmae{
    lateinit var name:String
    fun initName(){
        name = "Akshaya"
    }
    fun printName() {
        if (::name.isInitialized) {
            println("Name is $name")
        } else {
            println("Name is not initialized yet")
        }
    }

}
fun main(){
    val user = GuideNmae()
    user.initName()
    user.printName()
}