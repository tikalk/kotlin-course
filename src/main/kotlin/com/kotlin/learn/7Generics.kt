package com.kotlin.learn

/* E is called the generic type parameter */
class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        //E can be used as a parameter like any other type

    fun peek(): E = elements.last()                     // use E as a return type

}

/*
Generic Functions
Type parameters are placed before the name of the function:
*/
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

/*
The type specified after a colon is the upper bound: only a subtype of Comparable<T> may be substituted for T.
For example:
sort(listOf(1, 2, 3)) // OK. Int is a subtype of Comparable<Int>
*/
fun <T : Comparable<T>> sort(list: List<T>) {  /*do something*/ }

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}
