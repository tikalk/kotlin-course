package com.kotlin.learn

fun nullableChecks() {

    /*  Declares a non-null String variable. */
    var neverNull: String = "This can't be null"

    /*When trying to assign null to non-nullable variable, a compilation error is produced. */
    neverNull = null


    /* Declares a nullable String variable */
    var nullable: String? = "You can keep a null here"

    /*Sets the null value to the nullable variable.This is OK. */
    nullable = null

    /* When inferring types, the compiler assumes non-null for variables that are initialized with a value. */
    var inferredNonNull = "The compiler assumes non-null"

    /* When trying to assign null to a variable with inferred type, a compilation error is produced. */
    inferredNonNull = null

    /* Calls the function with a String (non-nullable) argument. This is OK. */
    strLength(neverNull)

    /* When calling the function with a String? (nullable) argument, a compilation error is produced  */
    strLength(nullable)

}


fun strLength(notNull: String): Int {                   // Declares a function with a non-null string parameter.
    return notNull.length
}


fun safeCalls() {
    val a = "Kotlin"
    val b: String? = null
    println(b?.length) //This returns b.length if b is not null, and null otherwise
    println(a?.length) // Unnecessary safe call

    var person: Person? = null
    /*
    Safe calls are useful in chains
    If either `person` or `person.department` is null, the function is not called:
    */
    person?.department?.head = capitalize("Prof.Elkayam")
}


data class Department(var head: String)
data class Person(val department: Department)

fun capitalize(notNull: String): String {
    return notNull.capitalize()
}


fun elvisOperator() {
    val b: String? = null
    /* if b is not null, use it, otherwise use some non-null value  */
    val l: Int = if (b != null) b.length else -1

    /*
     If the expression to the left of ?: is not null,
      the elvis operator returns it, otherwise it returns the expression to the right.
    */
    val elvis = b?.length ?: -1
}

fun NPEAssert(){
    /*
     the not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null
    */
    val b: String? = null
    val l = b!!.length
}
