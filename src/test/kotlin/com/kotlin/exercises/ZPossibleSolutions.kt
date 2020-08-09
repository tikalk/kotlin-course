package com.kotlin.exercises

import java.lang.Exception
import kotlin.math.pow
import kotlin.math.roundToInt

object ZPossibleSolutions {

    /**
     * The idea here is to map numbers to their elements while we pass on the array
     * As we pass through the array we look whether the complementary number to the target is in the map
     * (the complementary number is 'target' - 'the number we are currently looking at')
     * if it is then we are done and we can return the complementary index and the current index
     * (This is sorted since we have already inserted the complementary number previously)
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>() // Element to array-position
        nums.forEachIndexed { i, n ->
            val complementaryIndex = map[target - n]
            if (complementaryIndex != null) {
                return intArrayOf(complementaryIndex, i)
            }
            map[n] = i
        }
        throw Exception("Can't reach here")
    }


    /**
     * We modulu 10 the number until we have no digits left
     * We start with a new number and for each digit we take, we multiply the number by 10
     * and add the digit
     */
    fun reverse(x: Int): Int {
        val isPositive = when {
            x > 0 -> true
            else -> false
        }
        var x = Math.abs(x) // This is a copy
        var newNumber = 0
        while (x != 0) {
            val digit = x % 10
            x /= 10

            // Check for overflow before we append the digit
            if ((Int.MAX_VALUE - digit) / 10 < newNumber) {
                return 0
            }
            newNumber *= 10
            newNumber += digit
        }
        if (!isPositive) {
            newNumber *= -1
        }
        return newNumber
    }



    private fun climbStairsInternal(n: Int, memo: MutableMap<Int, Int>): Int {
        if (memo[n] != null) {
            return memo[n]!!
        }
        memo[n] = when (n) {
            1 -> 1
            2 -> 2
            else -> climbStairsInternal(n - 1, memo) + climbStairsInternal(n - 2, memo)
        }
        return memo[n]!!
    }

    fun climbStairs(n: Int): Int {
        return climbStairsInternal(n, mutableMapOf())
    }

}