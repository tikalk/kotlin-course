package com.kotlin.learn

class `10Collections` {

    /*
    A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List)
    A set is an unordered collection that does not support duplicates, mutable (MutableSet)  or read-only (Set)
    A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value , mutable (MutableMap)  or read-only (Map)
     */


    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //it takes a filter predicate as a lambda-parameter. The predicate is applied to each element
    val positives = numbers.filter { x -> x > 0 } //Gets positive numbers.
    val negatives = numbers.filter { it < 0 }   //Uses the shorter it notation to get negative numbers

    //map extension function enables you to apply a transformation to all elements in a collection
    val doubled = numbers.map { x -> x * 2 }

    val anyNegative = numbers.any { it < 0 }//returns true if the collection contains at least one element that matches the given predicate
    val allEven = numbers.all { it % 2 == 0 }//returns true if all elements in collection match the given predicate
    val noneEven = numbers.none { it % 2 == 1 }//returns true if there are no elements that match the given predicate in the collection

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }        // Looks for the first word starting with "some".
    val last = words.findLast { it.startsWith("some") }     // Looks for the last word starting with "some"

    val nothing = words.find { it.contains("nothing") }     // Looks for the first word containing "nothing"
}
