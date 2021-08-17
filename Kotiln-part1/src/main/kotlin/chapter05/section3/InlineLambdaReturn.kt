package chapter05.section3

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("Start of Func")
    inlineLambda(2, 3) { a, b ->
        val result = a + b
        if (result > 10) return@inlineLambda
        println("result: $result")
    }
    println("end of retFunc")
}