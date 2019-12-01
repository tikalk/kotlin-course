object KotlinSyntax {

    // Entry point
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello world!")
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Same as above, return type is inferred
    // fun sum(a: Int, b: Int) = a + b


    // Method with no return type (Unit can be ommited)
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    fun variables() {
        val a: Int = 1  // immediate assignment
        val b = 2   // `Int` type is inferred
        val c: Int  // Type required when no initializer is provided
        c = 3       // deferred assignment

        var x = 5 // `Int` type is inferred
        x += 1
    }

    fun stringInterpolation() {
        var a = 1
        // simple name in template:
        val s1 = "a is $a"

        a = 2
        // arbitrary expression in template:
        val s2 = "${s1.replace("is", "was")}, but now is $a"

        println("""This is a "literal" string""")
    }

    fun namedFunction(name: String = "John", age: Int = 15) {
        println("$name => $age")
    }

    fun callNamedFunction() {
        namedFunction(age = 14, name = "Jane")
    }


    fun autoCasting(obj: Any): Int? {
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null
    }


    fun forLoop() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }

        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }


    fun switchCase(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }


    fun ranges() {
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("fits in range")
        }

        val list = listOf("a", "b", "c")

        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }

        // Iterating over range
        for (x in 1..5) {
            print(x)
        }

        // You can also step over numbers you don't like
        for (x in 1..10 step 2) {
            print(x)
        }
        println()
        for (x in 9 downTo 0 step 3) {
            print(x)
        }
    }

    fun multipleWhens() {
        val items = listOf<String>("orange", "apple", "box")
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }
    }

    fun lambdas() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }


    fun lists() {
        val nonMutableList = listOf(1, 2, 3)
        //nonMutableList.add(4) // Will not compile

        val mutableList = mutableListOf(1, 2, 3)
        mutableList.add(4)

        val nonMutableMap = mapOf<Int, String>(
            1 to "1",
            2 to "2")

        val mutableMap = mutableMapOf(
            1 to "1",
            2 to "2"
        )
    }

}