package chapter04.section2

fun main() {
    val result = callByName(otherLambda)    // 람다식 자체가 매개변수에 복사됨.
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName function")
    return b()  // 여기서 otherLambda 호출
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}
