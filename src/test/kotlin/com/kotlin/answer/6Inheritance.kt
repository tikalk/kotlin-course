package com.kotlin.answer

open class Person(val age: Int) {
    fun eat() = println("knows how to eat")
    fun drink() = println("knows how to drink")
    open fun printDetails() = println("Age $age")
}

class MathTeacher(age: Int, val name:String): Person(age) {
    fun teachMath()= println("knows how to teach math")
    override fun printDetails() = println("Age $age name $name")

}

class Businesswoman(age: Int): Person(age) {
    fun closeDeal()= println("knows how to close deal")
}
