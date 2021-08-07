package chapter02.section4

fun main() {
    val x = 4           // 0100, 4(10)
    val y = 0b0000_1010 // 5(10)
    val z = 0x0F        // 0b0000_1111, 15(10)

    println("x shl 2 -> ${x.shl(2)}")
    println("x shr 2 -> ${x.shr(2)}")
    println("x and 2 -> ${x.and(2)}")
    println("x or 2 -> ${x.or(2)}")
    println("x xor 2 -> ${x.xor(2)}")
    println("x inv 2 -> ${x.inv()}")
}