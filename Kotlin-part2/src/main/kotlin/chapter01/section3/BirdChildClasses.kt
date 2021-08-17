package chapter01.section3

open class Bird(var name: String, var wing: Int, var beak: String) {

    open fun fly() {
        println("Fly!")
    }
}

class Lark(name: String, wing: Int, beak: String, var leg: Int) : Bird(name, wing, beak) {

    override fun fly() {
        println("Quick fly")
    }

    fun singHitone() {
        println("leg: $leg")
        println("sing Hitone")
    }
}

class Parrot : Bird {

    var language: String

    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
        this.language = language
    }

    override fun fly() {
        println("Slow Fly")
        super.fly()
    }

    fun speak() {
        println("Speak: $language")
    }
}

fun main() {
    val lark: Bird = Lark("mylark", 2, "short", 2)
    val parrot: Bird = Parrot("myParrot", 2, "long", "English")

    println("lark - name: ${lark.name}")
    println("parrot - name: ${parrot.name}")

//    lark.singHitone()
    lark.fly()

//    parrot.speak()
    parrot.fly()
}