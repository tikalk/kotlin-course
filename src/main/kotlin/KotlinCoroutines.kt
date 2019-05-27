import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

object KotlinCoroutines {

    @JvmStatic
    fun main(args: Array<String>) = runBlocking {

        val async = async {
            delay(1000)
            println("Calculating formula, this may take awhile...")
            7
        }



        val launch = launch {
            //throw Exception("Exception!")
        }

        launch.join()

        val result = async.await()

        println("Finished, the answer is $result")

    }

}