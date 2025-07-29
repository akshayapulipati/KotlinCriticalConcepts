package com.example.designpatterns

object Logger{
    fun log(message:String){
        println("Log:$message")
    }
}
fun main(){
    Logger.log("App Started")//Here we dont need to create Logger()-its a singleton object
}