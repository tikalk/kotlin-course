package com.kotlin.learn
/*
Kotlin classes are final by default.For inheritance, mark the class with the open modifier.
Methods are also final by default so we should use Open for methods as well.
Overriding methods or attributes requires the override modifier.


Add implementation for sayHello
*/
open class Tiger(val origin: String) {
     open fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia"){
    override fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}
