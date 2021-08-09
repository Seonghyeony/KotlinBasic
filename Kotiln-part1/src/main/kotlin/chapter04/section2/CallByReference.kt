package chapter04.section2

fun sum2(x: Int, y: Int): Int {
    print("sum2 func")
    return x + y
}

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    println("CallByReference")
    return c(a, b)
}

fun main() {
    funcParam(3, 2, ::sum2)
}