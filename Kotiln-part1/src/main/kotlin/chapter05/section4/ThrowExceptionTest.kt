package chapter05.section4

import java.lang.Exception

fun main() {

    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("finally")
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if (amount < 1000)
        throw Exception("잔고가 부족합니다.")
    println("checkAmount After throw")
}