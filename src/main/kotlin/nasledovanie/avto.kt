package nasledovanie

class avto {
}

abstract class Vehicle(val speed: Int, val color: String) {
    abstract fun makeSound()

    open fun displayInfo() {
        println("Транспортное средство: ${this::class.simpleName}")
        println("Скорость: $speed")
        println("Цвет: $color")
    }
}

class Bike(speed: Int, color: String, val countOfWheels: Int) : Vehicle(speed, color) {
    override fun makeSound() {
        println("Звонок велосипеда")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Количество колес: $countOfWheels")
    }
}

class ElectricCar(speed: Int, color: String, val batteryCapacity: Int) : Vehicle(speed, color) {
    override fun makeSound() {
        println("Звук гудка электромобиля")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Емкость аккумулятора: $batteryCapacity")
    }
}

interface FuelEfficient {
    fun fuelEfficiency()
}

class Car(speed: Int, color: String) : Vehicle(speed, color), FuelEfficient {
    override fun makeSound() {
        println("Звук гудка автомобиля")
    }

    override fun fuelEfficiency() {
        println("Автомобиль - эффективное использование топлива")
    }
}

fun main() {
    val vehicles = listOf(
        Car(100, "красный"),
        Bike(30, "синий", 2),
        ElectricCar(80, "зеленый", 100)
    )

    for (vehicle in vehicles) {
        vehicle.displayInfo()
        vehicle.makeSound()
        if (vehicle is FuelEfficient) {
            vehicle.fuelEfficiency()
        }
        println()
    }
}