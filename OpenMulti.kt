package com.example.designpatterns

//base class
open class Animals{
    open fun sounds(){
        println("some animal sound")
    }
}
//first level subclass
open class Doggy:Animals(){
    override fun sounds() {
        println("bark")
    }
}
//second level subclass
class Puppy:Doggy(){
    override fun sounds() {
        println("yip yip")

    }
}
fun main(){
    val a = Animals()
    val d = Doggy()
    val p = Puppy()
    a.sounds()
    d.sounds()
    p.sounds()
}