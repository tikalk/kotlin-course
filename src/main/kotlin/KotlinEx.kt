
class KotlinEx {
    val s: String = "a kotlin string"
}


fun KotlinEx.foo() {
    println(this.s)
}

fun JavaEx.foo() {
    println(this.s)
}

fun main() {
    KotlinEx().foo()
    JavaEx().foo()
}