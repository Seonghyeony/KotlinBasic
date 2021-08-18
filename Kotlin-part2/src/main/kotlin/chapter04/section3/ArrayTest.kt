package chapter04.section3

import java.util.*

fun main() {
    val b = Array<Any>(10, {0})
    b[0] = "Hello"  // 배열을 복사해서 다시 만듬
    b[1] = 1.1

    println(Arrays.toString(b))

    val iter: Iterator<Any> = b.iterator()
    while(iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }
}