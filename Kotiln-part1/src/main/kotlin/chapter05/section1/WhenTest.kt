package chapter05.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    grade = when (score) {
        in 90.0..100.0 -> 'A'
        in 80.0..89.9 -> 'B'
        else -> 'F'
    }

    println("score: $score, grade: $grade")
}
