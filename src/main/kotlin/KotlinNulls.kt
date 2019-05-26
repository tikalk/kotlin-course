class KotlinNulls {

    fun foo() = "foo"

    fun mayReturnNull(): String? {
        return "mayReturnNull"
    }

}


fun main() {


    var k: KotlinNulls = KotlinNulls()
    //k = null //won't compile
    k.foo() //works fine

    var knull: KotlinNulls? = KotlinNulls()
    knull = null //works fine
    //knull.foo() //won't compile since compiler is not sure about the nullability of this var
    knull?.foo()

    if (knull != null) {
        knull.foo()
    }

    //company?.department?.head?.name

    val fallback = knull?.foo() ?: "abc"

    val force = knull!!.foo() //This will throw NPE
}