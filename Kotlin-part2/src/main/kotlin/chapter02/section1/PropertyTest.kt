package chapter02.section1

// 직접 구성한 기본 게터/세터
class User(_id: Int, _name: String, _age: Int) {
    // 프로퍼티들
    val id: Int = _id
        get() = field

    // field: 프로퍼티를 참조하는 변수로 보조 필드로 불림.

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value + 10
        }
}

fun main() {
    val user = User(1, "Kildong", 30)
    user.age = 35
    println("user.age = ${user.age}")
}