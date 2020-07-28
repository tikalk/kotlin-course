package com.kotlin.learn

/*  I want to be able to ryn all three :*/
fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

/* I can  do this :

fun foo(name: String, number: Int, toUpperCase: Boolean): String? {
    return (if (toUpperCase) name.toUpperCase() else name) + number
}

fun foo(name: String, number: Int): String? {
    return foo(name, number, false)
}

fun foo(name: String, toUpperCase: Boolean): String? {
    return foo(name, 42, toUpperCase)
}

fun foo(name: String): String? {
    return foo(name, 42)
}

But i want to do it in one function:
fun foo(name: String, number: Int, toUpperCase: Boolean) =
    (if (toUpperCase) name.toUpperCase() else name) + number

Please change the signature of the function for it to fit.
* */

