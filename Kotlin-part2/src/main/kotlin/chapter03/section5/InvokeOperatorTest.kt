package chapter03.section5

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }
}

fun main() {
    val manager = Manager()
    manager("Do something for me!") // manager.invoke("...") 형태로 호출되며 invoke가 생략되었다.

    val sum = { x: Int, y: Int -> x + y }
    println(sum.invoke(3, 10))
    println(sum(3, 10))
}