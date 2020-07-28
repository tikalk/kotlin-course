package com.kotlin.learn
// Kotlin code is usually defined in packages


fun main() {                        // An entry point to a Kotlin application is the main function
    println("Hello, World!")
}

/** Variables **/
fun declareVariables() {
    var a: String = "initial"  // Declares a mutable variable and initializing it ~~ default getter and setter
    val b: Int = 1             // Declares an Immutable variable and initializing it. ~~ default getter
    val c = 3                  // Declares an immutable variable and initializing it without specifying the type. The compiler infers the type Int

    /*
    remove the initialization -->
    An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.
    The var must be initialized before the first read.
    No matter where
    */
    var e: Int
    println(e)  //
}

/** String Interpolation **/
fun stringInterpolation() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println("""This is a "literal" string""")
}

/** Named Function **/
fun namedFunction(name: String = "John", age: Int = 15) {
    println("$name => $age")
}

fun callNamedFunction() {
    namedFunction(age = 14, name = "Jane")
}
