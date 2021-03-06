package chapter04.section3

fun main() {
    twoLambda({a, b -> "First $a $b"}) {
        "second $it"
    }
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}
