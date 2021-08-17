package chapter03.section1


// 추상 클래스 자체의 인스턴스는 생성 불가.
abstract class Vehicle(val name: String, val color: String, val weight: Double) {   // 비 추상 프로퍼티

    // 추상 프로퍼티 - 하위 클래스에서 오버라이딩을 반드시 해야 함.
    abstract val maxSpeed: Double

    var year: String = "2020"   // 비추상 프로퍼티

    // 추상 메서드
    abstract fun start()
    abstract fun stop()

    // 비추상 메서드
    fun displaySpec() {
        println("name: $name, color: $color, weight: $weight, year: $year, maxSpeed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }

    fun autoPilotOn() {
        println("Auto Pilot ON")
    }
}

class Motorbike(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Motorbike started")
    }

    override fun stop() {
        println("Motorbike stopped")
    }
}

fun main() {

    var car = Car("Matiz", "red", 1000.0, 100.0)
    var motor = Motorbike("Honda", "blue", 1000.0, 110.0)

    car.year = "2014"
    car.displaySpec()

    motor.displaySpec()

    car.start()
    motor.start()
}