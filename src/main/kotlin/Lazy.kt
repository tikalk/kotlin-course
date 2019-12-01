class Lazy {

    val notLazy = longRunningStuff()

    val iamlazy: String by lazy {
        longRunningStuff()
    }

    fun longRunningStuff(): String {
        Thread.sleep(3000)
        return "Done"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var t0 = System.currentTimeMillis()
            val l1 = Lazy()
            println("Time taken to run ${System.currentTimeMillis() - t0}, value is ${l1.notLazy}")

            t0 = System.currentTimeMillis()
            val lazyParam = l1.iamlazy
            println("Figuring the lazy parameter ($lazyParam) took ${System.currentTimeMillis() - t0}")
        }
    }

}
