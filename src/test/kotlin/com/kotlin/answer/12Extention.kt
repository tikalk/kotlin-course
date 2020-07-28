package com.kotlin.answer

package com.kotlin.learn

/*implement extension functions Int.r() and Pair.r() and make them convert Int and Pair to RationalNumbe*/
fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main() {
    println("for Int : ${2.r()}")
    println("for pair : ${Pair(8,4).r()}")
}

