package com.kotlin.answer

fun main(args: Array<String>) {


    A.Companion
    A.printName() //prints Kotlin Tutorials

    B.printName()
}

class A {

    companion object {

        init {
            println("Singleton class invoked.")
        }
        var name = "Kotlin companion Objects"
        fun printName() {
            println(name)
        }

    }

    init {
        println("Class init method.")
    }
}

object B
{
    init {
        println("Singleton class invoked.")
    }
    var name = "Kotlin Objects"
    fun printName()
    {
        println(name)
    }

}
