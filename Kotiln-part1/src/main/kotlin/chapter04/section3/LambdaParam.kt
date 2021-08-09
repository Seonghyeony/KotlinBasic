package chapter04.section3

fun main() {
    // 매개변수 없는 람다식 함수
    noParam({ "Hello World!!" })
    noParam {
        "Hello World!!" // 위의 식과 동일.
    }

    // 매개변수가 하나 있는 람다식 함수
    oneParam({ a -> "Hello World! $a"})
    oneParam { a ->
        "Hello World! $a"
    }
    oneParam {
        "Hello World! $it"
    }

    // 매개변수 2개
    moreParam({ a, b ->
        "Hello World! $a $b"
    })
    moreParam { a, b ->
        "Hello World! $a $b"
    }
    moreParam { _, b ->
        "Hello World! $b"
    }

    withArgs("Arg1", "Arg2", { a, b ->
        "Hello World! $a $b"
    })
    withArgs("Arg1", "Arg2") { a, b ->
        "Hello World! $a $b"
    }
}

// 매개변수가 없는 람다식 함수가 noParam 함수의 매개변수 out으로 지정됨.
fun noParam(out: () -> String) = println(out())

// 매개변수가 하나 있는 람다식 함수가 oneParam 함수의 매개변수 out으로 지정됨.
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 2개
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}