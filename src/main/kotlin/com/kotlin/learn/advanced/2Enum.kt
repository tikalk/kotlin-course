package com.kotlin.learn.advanced
import java.math.BigDecimal

/*
Each enum constant is an object. Enum constants are separated with commas.
Just like classes, they can have custom methods or hold data, but always one per enum value, meaning each value is an instance of the class!
*/


enum class PaymentOption {
    CASH,
    CARD,
    TRANSFER;
    //Enum class members are separated from the instance definitions by a semicolon

    var commission: BigDecimal = BigDecimal.ZERO
}

fun main() {

    /*BAD PRACTICE -  don't make values mutable as they are static per item*/
    val c1 = PaymentOption.CARD
    val c2 = PaymentOption.CARD
    print(c1 == c2) // true, because it is the same object

    c1.commission = BigDecimal.TEN
    print(c2.commission) // 10

    val t = PaymentOption.TRANSFER
    print(t.commission) // 0, because `commission` is per-item
}

enum class PaymentOptionGoodPractice(val commission: BigDecimal) {
    CASH(BigDecimal.ONE),
    CARD(BigDecimal.TEN),
    TRANSFER(BigDecimal.ZERO)
}

enum class PaymentOptionWithFunctions {
    CASH {
        override fun startPayment(transaction: String) {
            //do something
        }
    },
    CARD {
        override fun startPayment(transaction: String) {
            //do something
        }
    },
    TRANSFER {
        override fun startPayment(transaction: String) {
            //do something
        }
    };

    abstract fun startPayment(transaction: String)
}

//A better option for 'PaymentOptionWithFunctions' use extensions function
fun PaymentOption.startPayment(transaction: String) {
    when (this) {
        PaymentOption.CASH -> transaction.length
        PaymentOption.CARD -> transaction.length+1
        PaymentOption.TRANSFER -> {
            transaction.length+2
        }
    }
}
