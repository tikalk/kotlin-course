package com.kotlin.answer

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false)=
    println("${if (toUpperCase) name.toUpperCase() else name}  $number")


fun main(){
    useFoo()
}