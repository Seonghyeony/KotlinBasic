package chapter06.section1

fun main() {
    val score: Int? = 32

    fun checkScoreLet() {
        score?.let { println("Score: $score") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScoreLet()

    var a: Int? = 1
    val b = 2

    a = a?.let { it + 2 }?.let {
        val i = it + b
        i
    }

    println(a)
}