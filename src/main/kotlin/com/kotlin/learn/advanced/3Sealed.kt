package com.kotlin.learn.advanced

/*
Sealed modifier means it is impossible to define another subclass of this class outside of the file
It's in a sense, an extension of enum classes

Kotlin compiler knows that as well and so in some contexts like when it can suggest options,
and understand that all the possibilities were covered
*/
sealed class Response<out R>
class Success<R>(val value: R): Response<R>()
class Failure(val error: Throwable): Response<Nothing>()

fun handle(response: Response<String>) {
    val text = when (response) {
        is Success -> "Success, data are: " + response.value
        is Failure -> "Error"
    }
    print(text)
}

/* basically like enum :*/
enum class ResponseEnum{
    Success,
    Failure
}

/* The advantage of sealed classes over enum is that subclasses can hold instance-specific data.
    As you see below, each instance have a different implementation:
**/
sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()
