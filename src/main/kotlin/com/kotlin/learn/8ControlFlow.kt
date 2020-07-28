package com.kotlin.learn

import java.lang.Integer.parseInt

class `8ControlFlow` {

    fun ifFlow(){
        val a:Int=0
        val b:Int=1
        var max: Int
        if (a > b) {
            max = a
        } else {
            max = b
        }


        //last expression is the value of a block
        max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
    }

    fun forFlow(){
        for (i in 1..3) {
            println(i)
        }
        for (i in 6 downTo 0 step 2) {
            println(i)
        }

        val array = arrayListOf<Int>(1,2,3)
        for (i in array) {
            println(array[i])
        }
    }

    fun whileFlow(){
        var x =1
        while (x > 0) {
            x--
        }

        do {
            val y = retrieveData()
        } while (y != null) // y is visible here!
    }

    private fun retrieveData(): Int {
        return 2
    }


    //when matches its argument against all branches sequentially until some branch condition is satisfied
    fun whenFlow(){
        val x:Int=5
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }

        when (x) {
            parseInt("1") -> print("s encodes x")
            else -> print("s does not encode x")
        }

        val validNumbers= listOf<Int>(1,2,3,4)
        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }
}
