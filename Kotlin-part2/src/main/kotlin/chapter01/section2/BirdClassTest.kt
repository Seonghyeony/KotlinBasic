package chapter01.section2

import sun.util.resources.cldr.bas.CurrencyNames_bas

class Bird(_name: String, _wing: Int, _beak: String) {
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak

    init {
        println("-------- init start ---------")
//        name = name.capitalize()
//        println("name: $name, wing: $wing, beak: $beak")
        println("-------- init end -----------")
    }

    // 메서드
    fun fly() {
        println("Fly~~")
    }

}

fun main() {
    val coco = Bird("coco", 2, "long")

    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
}