import java.util.*
import java.util.stream.Collectors

class KotlinStreams {

    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    internal var filteredList = numbers
        .filter { it > 5 }
        .onEach { println(it) }
}