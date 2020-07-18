package com.kotlin.learn


/* A class in Kotlin can have a primary constructor and one or more secondary constructors
* The primary constructor cannot contain any code.
*/
class InitOrder(name: String) {

    val firstProperty = "First property: $name".also(::println)

    //Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.
    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

/* for declaring properties and initializing them from the primary constructor */
class Customer(val name: String) {
    var children: MutableList<Customer> = mutableListOf()

    /*
    * each secondary constructor needs to delegate to the primary constructor,
    * either directly or indirectly through another secondary constructor(s)
    */
    constructor(name: String, parent: Customer) : this(name) {
        parent.children.add(this)
    }
}
