package chapter04.section3

fun main() {
    // 매개변수 없는 람다식 함수
    noParam({ "Hello World!!" })
    noParam {
        "Hello World!!" // 위의 식과 동일.
    }
}

// 매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 out으로 지정됨.
fun noParam(out: () -> String) = println(out())