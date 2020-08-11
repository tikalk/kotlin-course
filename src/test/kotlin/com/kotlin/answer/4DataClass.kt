package com.kotlin.answer

data class User(var name:String, val age:Int)

fun getUser(): List<User> {
    return listOf(User("Alice", 29), User("Bob", 31))
}
