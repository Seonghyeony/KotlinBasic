package chapter02.section2

fun main() {
    var num: Double = 0.1
    var count = 0

    for (x in 0..999) {
        num += 0.1
        count += 1
    }

    println("num = $num, count = $count")
}