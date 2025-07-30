package com.example.designpatterns

abstract class Animalworld{
    abstract fun soundding()//no body -myst be implemented

    fun eat(){
        println("eating food")
    }
    class Pig:Animalworld(){
        override fun soundding() {
            println("baa")
        }
    }
    class Mouse:Animalworld(){
        override fun soundding() {
            println("Mu mu")
        }


    }
    fun main(){
        val pig=Pig()
        pig.soundding()
        pig.eat()

        val mouse =Mouse()
        mouse.soundding()
        mouse.eat()
    }
}