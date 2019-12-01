package classes

open class Person constructor(val firstName: String = "") {

    val firstProperty = "First property: $firstName"

    init {
        println(firstName)
    }

    constructor(firstName: String, lastName: Person) : this(firstName)

    fun `This method cannot be inherited`() = ""

    open fun `But this one can be`() = "Something"

    companion object {

        fun callCompanionObject(value: String) = println(value)

    }

}

class DerivedPerson : Person() {

    //override fun `This method cannot be inherited`() = ""

    override fun `But this one can be`() = "something else"

}

fun main() {
    // Can be constructed defaultly since all parameters have default values
    val p1 = Person()

    val p2 = Person("Joe")

    Person.callCompanionObject("Name")

    with(p1) {
        println(firstName)
    }


}