package com.kotlin.learn

import com.sun.org.apache.xml.internal.utils.StringBufferPool.get

// Kotlin code is usually defined in packages


fun main() {                        // An entry point to a Kotlin application is the main function
    println("Hello, World!")
}

/** Variables **/
fun declareVariables() {
    var a: String = "initial"  // Declares a mutable variable and initializing it ~~ default getter and setter
    val b: Int = 1             // Declares an Immutable variable and initializing it. ~~    default getter
    val c = 3                  // Declares an immutable variable and initializing it without specifying the type. The compiler infers the type Int

    /*
    remove the initialization -->
    An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.
    The var must be initialized before the first read.
    No matter where
    */
    var e: Int = 1
    println(e)  //


}
