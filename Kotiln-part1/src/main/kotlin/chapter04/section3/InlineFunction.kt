package chapter04.section3

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Hello")
    out(a)
    println("Goodbye")
}

fun main() {
    shortFunc(3) {
        println("a: $it")
        //return // crossinline: 비지역 반환을 금지.
    }
}