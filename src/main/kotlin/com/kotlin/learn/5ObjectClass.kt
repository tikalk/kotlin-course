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
    A function or a property to be tied to a class rather than to instances of it .
    It's a singleton, and its members can be accessed directly via the name of the containing class
    Initialized when the class is loaded
    A class can only have one companion object, and companion objects can not be nested
* */
class Car(val horsepowers: Int) {
    companion object {
        val cars = mutableListOf<Car>()

        fun makeCar(horsepowers: Int): Car {
            val car = Car(horsepowers)
            cars.add(car)
            return car
        }
    }
}
