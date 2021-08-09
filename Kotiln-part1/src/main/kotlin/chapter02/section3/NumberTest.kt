package chapter02.section3

fun main() {
    var test: Number = 12.2
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")

    if (test is Int) {
        println("test is Int")
    } else if (test !is Int) {
        println("test is Not Int")
    }
}