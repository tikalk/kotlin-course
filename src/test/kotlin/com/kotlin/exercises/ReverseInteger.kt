package com.kotlin.exercises

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.Exception


/***

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321


Example 2:

Input: -123
Output: -321


Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the
32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */

class ReverseInteger {

    fun reverse(n: Int): Int {
        throw Exception("Not implemented yet")
    }


    @Test
    fun `reverse integer should work`() {
        assertThat(reverse(123)).isEqualTo(321)
        assertThat(reverse(-123)).isEqualTo(-321)
        assertThat(reverse(0)).isEqualTo(0)
        assertThat(reverse(1534236469)).isEqualTo(0)
        assertThat(reverse(-2147483412)).isEqualTo(-2143847412)
    }
}