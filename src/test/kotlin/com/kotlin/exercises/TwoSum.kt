package com.kotlin.exercises

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.lang.Exception


/***

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */
class TwoSum {


    fun twoSum(nums: IntArray, target: Int): IntArray {
        throw Exception("Not implemented yet")
    }

    @Test
    fun `two sum should work`() {
        assertThat(twoSum(intArrayOf(1, 2), 3)).isEqualTo(intArrayOf(0, 1))
        assertThat(twoSum(intArrayOf(2, 7, 11, 15), 9)).isEqualTo(intArrayOf(0, 1))
        assertThat(twoSum(intArrayOf(3, 2, 4), 6)).isEqualTo(intArrayOf(1, 2))
    }


}