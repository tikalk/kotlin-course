package com.kotlin.learn

data class Course(val name: String)

class OddList //TODO - implement class

fun main() {
    val listOfStrings = listOf("Kotlin", "Java", "C#")
    val resultOfStrings: OddList<String> = OddList(listOfStrings)
    println(resultOfStrings.oddItems())

    val listOfInts = listOf(1, 7, 8, 9, 12, 45)
    val resultOfInts = OddList(listOfInts)
    println(resultOfInts.oddItems())

    val courses = listOf(
        Course("Kotlin"),
        Course("Java"),
        Course("C#"),
        Course("PHP"),
        Course("C++")
    )
    var resultCourses = OddList(courses).oddItems()
    println(resultCourses)
}
