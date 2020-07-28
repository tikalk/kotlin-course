package com.kotlin.learn

class `9HigherOrderFunctions` {
    /*
    * Kotlin functions are first-class, which means that they can be stored in variables and data structures,
    * passed as arguments to and returned from other higher-order functions
    * */

    /** function as input  **/
    fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  //method takes two integer parameters, x and y and it takes another function operation as a parameter
        return operation(x, y)                                          // returns the result of operation invocation with the supplied arguments.
    }

    fun sum(x: Int, y: Int) = x + y                                 // Declares a function that matches the operationsignature

    fun main1() {
        val sumResult = calculate(4, 5, ::sum)                       // :: is the notation that references a function by name
        val mulResult = calculate(4, 5) { a, b -> a * b }   // passing in a lambda as a function argument (If the last parameter of a function is a function,then a lambda expression passed as the corresponding argument can be placed outside the parentheses)

         println("sumResult $sumResult, mulResult $mulResult")
    }


    /** function as output  **/
    fun operation(): (Int) -> Int {       // (Int) -> Int represents the parameters and return type of the square function.
        return ::square
    }

    fun square(x: Int) = x * x      // Declares a function matching the signature

    fun main2() {
        val func = operation()  // Invokes operation to get the result assigned to a variable
        println(func(2))                  // The square function is actually executed
    }

    /*
    There are several ways to obtain an instance of a function type:

    Using a code block within a function literal, in one of the forms:
        a lambda expression: { a, b -> a + b },
        an anonymous function: fun(s: String): Int { return s.toIntOrNull() ?: 0 }


    Using a callable reference to an existing declaration:
        a top-level, local, member, or extension function: ::isOdd, String::toInt,
        a top-level, member, or extension property: List<Int>::size,
        a constructor: ::Regex
     */


    /* sum1 and sym2 are the same it's like declering val i:Int=1 , no need of the Int, it's inferred */
    val sum1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val sum2 = { x: Int, y: Int -> x + y }

}
