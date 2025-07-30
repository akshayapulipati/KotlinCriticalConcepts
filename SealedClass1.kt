package com.example.designpatterns

sealed class Result

class Success(val data:String) :Result()
class Error(val message:String) :Result()
object Loading:Result()//singleton object

fun handleResult(result: Result){
    when(result){
        is Success -> println("success:${result.data}")
        is Error -> println("Error: ${result.message}")
        Loading -> println("Loading...")
    }
}
fun main(){
    val result1:Result =Success("Data loaded")
    val result2: Result = Error("Something went wrong")
    val result3: Result = Loading

    handleResult(result1)
    handleResult(result2)
    handleResult(result3)
}