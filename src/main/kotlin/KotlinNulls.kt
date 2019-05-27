class KotlinNulls {

    fun foo() = "foo"

    fun mayReturnNull(): String? {
        return "mayReturnNull"
    }

}

data class Outer(val inner1: Inner1? = null)
data class Inner1(val inner2: Inner2? = null)
data class Inner2(val target: String? = null)

fun main() {


    var k: KotlinNulls = KotlinNulls()
    //k = null //won't compile
    k.foo() //works fine

    var knull: KotlinNulls? = null
    //knull.foo() //won't compile since compiler is not sure about the nullability of this var

    Outer().inner1?.inner2?.target

    val fallback = knull?.foo() ?: "abc"

    val force = knull!!.foo() //This will throw NPE
}