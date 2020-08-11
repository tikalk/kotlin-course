package com.kotlin.learn

/* If you need a singleton - a class that only has got one instance.
The instance (which is created the first time it is accessed, in a thread-safe manner) has got the same name as the class
*/
object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsepowers: Int): Car {
        val car = Car(horsepowers)
        cars.add(car)
        return car
    }
}

/* companion object:
    A function or a property to be tied to a class rather than to instances of it.
    The name of the companion object can be omitted, in which case the name Companion will be used
    It's a singleton, and its members can be accessed directly via the name of the containing class => Car.makeCar(2000)
    Initialized when the class is loaded
    A class can only have one companion object, and companion objects can not be nested
    Note that, even though the members of companion objects look like static members in other languages,
    at runtime those are still instance members of real objects
* */
class Car(val horsepowers: Int) {
    companion object CarO{
        val cars = mutableListOf<Car>()

        fun makeCar(horsepowers: Int): Car {
            val car = Car(horsepowers)
            cars.add(car)
            return car
        }
    }
}

fun main() {
   val carObj= CarFactory.makeCar(1200)
   val carComObj= Car.makeCar(1200)

}
