package chapter04.section1

fun main() {

    val result: Int

//    val multi = { a: Int, b: Int -> a * b }
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a, b: $b")
        a * b
    }

    result = multi(10, 20)
    println(result)

    val nestedLambda: () -> () -> Unit = { { println("NestedLambda") } }
    nestedLambda()()
}