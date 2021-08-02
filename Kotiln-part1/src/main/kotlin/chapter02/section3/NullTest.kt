package chapter02.section3

fun main() {
    var str1: String?
    str1 = null
    val len = str1?.length ?: -1        // elvis 연산
    // ?. -> 변수가 null이면 뒤에는 실행하지 않는다.
    println("str1: $str1, length: $len")
}