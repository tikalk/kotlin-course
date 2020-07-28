package com.kotlin.learn
/* no not need to use explicit cast operators ,the compiler tracks the is-checks and explicit cast */
fun demo(x: Any) {
    if (x is String) {
        print(x.length) // x is automatically cast to String
    }
    // x is automatically cast to string on the right-hand side of `||`
    if (x !is String || x.length == 0) return

    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }

    fun autoCasting(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }
}
