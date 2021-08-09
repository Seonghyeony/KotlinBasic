package chapter03.section1

fun avgFunc(initial: Float = 3f, vararg numbers: Float): Double {
    var result = 0f
    for (num in numbers) {
        result += num
    }
    println("result: ${result + initial}, numbers.size: ${numbers.size}")
    val avg = (result + initial) / numbers.size
    return avg.toDouble()
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f)
    println("avg result: $result")
}