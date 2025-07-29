package com.example.designpatterns

//example
//building toolkit that supports diff buttons based on platform

// Interface for common Button behavior
interface  Button{
    fun render()//abstract fun, All buttons must implement this function
}
//Concrete implementation for Android button
class AndroidButton:Button{
    override fun render() = println("Rendering android button")

}
class IOSButton:Button{
    override fun render() = println("Rendering  ios button")
}
//Factory object to create buttons based on platform
object ButtonFactory {
    // Factory method that returns a Button based on the type string
    fun createButton(type: String): Button {
        return when (type.lowercase()) {
            "android" -> AndroidButton()
            "ios" -> IOSButton()
            else -> throw IllegalArgumentException("unsupported plafform$type")
        }
    }
}
fun main() {
    // Create an Android button using the factory
    val button1 = ButtonFactory.createButton("android")
    val button2 = ButtonFactory.createButton("ios")
// Render the Android button
    button1.render()
    button2.render()
}
