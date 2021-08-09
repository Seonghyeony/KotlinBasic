package chapter03.section1

fun sum(a: Int = 2, b: Int = 5) = a + b

fun max(a: Int, b: Int) = if (a > b) a else b

fun outFunc(name: String) = println("Name: $name")

fun main() {    // 최상위 (Top-level) 함수: 어디에서든 선언하면 사용 가능.
//    fun sum(a: Int, b: Int): Int {  // 지역함수
//        return a + b
//    }
    val result1 = sum(2, 3)
    val result3 = sum(b = 2)

    val a = 3
    val b = 5

    val result2 = max(a, b)

    outFunc("Seonghyeon")
    println(result1)
    println(result2)
    println(result3)
}