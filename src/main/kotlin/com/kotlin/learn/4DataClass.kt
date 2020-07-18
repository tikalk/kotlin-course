package com.kotlin.learn

/* classes whose main purpose is to hold data.
* The primary constructor needs to have at least one parameter;
* All primary constructor parameters need to be marked as val or var;
* Data classes cannot be abstract, open, sealed or inner;
*/
data class User(val name: String, val age: Int)


/*
* The compiler only uses the properties defined inside the primary constructor for the automatically generated functions:
* toString(), equals(), hashCode(), and copy()
*
*  To exclude a property from the generated implementations, declare it inside the class body:
*/
data class Student(val name: String) {
    var age: Int = 0
}
