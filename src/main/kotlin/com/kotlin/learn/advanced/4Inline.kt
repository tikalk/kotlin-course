package com.kotlin.learn.advanced

/*
Sometimes it is necessary for business logic to create a wrapper around some type
but it introduces runtime overhead due to additional heap allocations.
Therefore inline keyword was created, for class , functions
*/

inline class Password(val value: String)
/* No actual instantiation of class 'Password' happens
  At runtime 'securePassword' contains just 'String'*/
val securePassword = Password("Don't try this in production")

/*
Each function is an object, memory allocations (both for function objects and classes) and virtual calls introduce runtime overhead.
*/
inline fun <T> Collection<T>.each(block: (T) -> Unit) {
    for (e in this) block(e)
}

/*
When using inline functions, the compiler inlines the function body.
That is, it substitutes the body directly into places where the function gets called
Therefore both functions below are the same :
*/
fun usingInline(){
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.each { println(it) }
}


fun usingWithoutInline(){
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers)
        println(number)
}


/*
By default, all lambdas passed to an inline function would be inlined, too.
However, we can mark some of the lambdas with the noinline keyword to exclude them from inlining:
 */

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) { print("noinline") }

/*
Kotlin erases the generic type information at runtime, but for inline functions, we can avoid this limitation.
That is, the compiler can reify generic type information for inline functions, by using reified.
 */

inline fun <reified T> Any.isA(): Boolean = this is T
