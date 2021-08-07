package chapter02.section3

fun main() {
    val a: Int = 128
    val b: Int = 128

    println(a == b)

    println()

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d)
    println(c === d)
    println(c === e)
}