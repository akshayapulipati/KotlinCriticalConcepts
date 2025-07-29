package com.example.designpatterns

class OldPrinter{
    fun printOld(text:String){
        println("printing form oldprinter:$text")
    }

}

interface NewPrinter{
    fun print(text: String)
}
//adapter class
class PrinterAdapter(private val oldPrinter: OldPrinter):NewPrinter {
    override fun print(text: String) {
        oldPrinter.printOld(text)
    }

}
fun main(){
    val oldPrinter=OldPrinter()// Create old printer
    val adapter:NewPrinter=PrinterAdapter(oldPrinter)// Use adapter as new printer
    adapter.print("hello kotlin")// This will call oldPrinter.printOld internally
}































//OldPrinter is a pre-existing class (maybe from old code or a library).
//
//It has a method printOld() that prints text.
//
//But this method name (printOld) doesn’t match what your new system expects.


//This is a new standard your app wants to use.
//
//Instead of printOld(), it expects a function called print().
//
//You want all printers to use this print() method going forward.
//


//PrinterAdapter implements the new interface NewPrinter.
//
//But inside it, it uses the OldPrinter to actually do the work.
//
//The adapter:
//
//Receives the new method call print()
//
//Internally redirects it to the old method printOld()
//
//This is the core of the Adapter Pattern — it converts print() into printOld().


//You create an object of OldPrinter (which doesn’t support print() directly).
//
//Then wrap it inside PrinterAdapter, which acts like a NewPrinter.
//
//Now you can use adapter.print() in your app, even though the actual printer is old.