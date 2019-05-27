class KotlinClass {

    fun kfoo() = "called method kfoo()"

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println(JavaClass().jfoo())
        }

    }

}