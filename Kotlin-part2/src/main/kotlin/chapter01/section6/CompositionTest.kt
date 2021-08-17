package chapter01.section6

/**
 * 구성 관계
 */

class Car(val name: String, val power: String) {

    private var engine = Engine(power)  // Engine 클래스 객체는 Car의 구성품.

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}