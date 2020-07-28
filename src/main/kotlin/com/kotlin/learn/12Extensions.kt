package com.kotlin.learn

class `12Extensions` {
    /* the ability to extend a class with new functionality
    without having to inherit from the class or use design patterns such as Decorator */

    // we need to prefix fun name (= swap)  with a receiver type (= ArrayList<Int)
    fun Array<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // 'this' corresponds to the list
        this[index1] = this[index2]
        this[index2] = tmp
    }


    fun main(){
        val list = listOf<Int>(1, 2, 3).toTypedArray()
        list.swap(0, 2)
    }

    /* Extensions do not actually modify classes they extend */


    /*
    Scope of extensions
    Most of the time we define extensions on the top level - directly under packages for example define this:
    */

    fun List<String>.getLongestString() { /*...*/}
    /* use it:
    To use such an extension outside its declaring package, we need to import it at the call site:
    import org.example.declarations.getLongestString
    */

    fun useExtension() {
        val list = listOf("red", "green", "blue")
        list.getLongestString()
    }

}
