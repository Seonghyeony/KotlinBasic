package chapter04.section1

class GenericNull<T> {  // 기본적으로 null이 허용되는 형식 매개변수
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj1 = GenericNull<String>()
    obj1.equalityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.equalityFunc(null, 10)
}

