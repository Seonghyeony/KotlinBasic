package chapter03.section1

// vararg: 인자를 하나 이상 받을 수 있음.
fun normalVarargs(vararg a: Int) {
    for (num in a) {
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)
    println()
    normalVarargs(1, 2, 3, 4)
}