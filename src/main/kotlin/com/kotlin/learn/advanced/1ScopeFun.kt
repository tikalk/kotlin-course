package com.kotlin.learn.advanced

import kotlin.random.Random

/*
* scope functions - functions whose sole purpose is to execute a block of code within the context of an object.
* Basically, these functions do the same: execute a block of code on an object.
* What's different is how this object becomes available inside the block and what is the result of the whole expression
*
* There are five of them: let, run, with, apply, and also
*
* the difference:
*  - The way to refer to the context object:
*       run, with, and apply refer to the context object as a lambda receiver - by keyword this
*       let and also have the context object as a lambda argument - named argument or 'it'
*  - The return value:
*       apply and also return the context object.
*       let, run, and with return the lambda result.
*
* The use cases of different functions overlap, so that you can choose the functions based on the specific conventions used in your project or team
*/

fun let(){
    //regular code:
    val alice = Person("Alice", 20, "Amsterdam")
    println(alice)
    alice.moveTo("London")
    alice.incrementAge()
    println(alice)

    //using let:
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

    //using apply
    val adam = Person("Adam").apply {
        age = 20                       // same as this.age = 20 or adam.age = 20
        city = "London"
    }
    println(adam)


    //using also with it
    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            println("getRandomInt() generated value $it")
        }
    }
    val i = getRandomInt()

    //returning context value 'numberList'
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()//returning the contest value is what allow us to use 'sort' here

    //return the lambda result
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.")


    /*******   examples when to use: ***********/

    val numbers2 = mutableListOf("one", "two", "three", "four", "five")
    numbers2.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
    }


    //To perform actions on a non-null object, use the safe call operator ?. on it and call let
    val str: String? = "Hello"
    //processNonNullString(str)       // compilation error: str can be null
    val length = str?.let {
        println("let() called on $it")
        processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
        it.length
    }

    // “with this object, do the following.”
    val numbers3 = mutableListOf("one", "two", "three")
    with(numbers3) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }


    //“apply the following assignments to the object.”
    val adam2 = Person("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam2)

}

fun processNonNullString(s: String) {
    s.reversed()
}

data class Person(val name: String,var age:Int=15,var city:String="RishonLezion"){
    fun moveTo(otherCity:String){
        city=otherCity
    }
    fun incrementAge(){
        age++
    }
}
