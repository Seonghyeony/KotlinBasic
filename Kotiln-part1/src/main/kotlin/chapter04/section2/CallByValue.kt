package chapter04.section2

fun main() {
    val result = callByValue(lambda())  // 람다식 함수의 즉시 실행.
    println(result)
}

fun callByValue(b: Boolean): Boolean {  // b에 true 값 복사
    println("callByValue function")
    return b    // b의 true 값 반환
}

val lambda: () -> Boolean = {
    println("lambda function")
    true    // true 반환
}