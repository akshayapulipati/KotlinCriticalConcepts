package com.example.designpatterns

//singleton with properties

object AppConfig{
    var theme ="Light"
    var fontSize= 14

    fun printConfig(){
        println("THeme:$theme,FontSize:$fontSize")
    }
}
fun main(){
    AppConfig.printConfig()
    AppConfig.theme="Dark"
    AppConfig.fontSize =16
    AppConfig.printConfig()
}