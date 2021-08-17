package chapter03.section2

interface Pet {
    var category: String
    var species: String
    // 인터페이스에서는 프로퍼티에 값을 저장할 수 없지만
    // val로 선언된 프로퍼티는 게터를 통해 필요한 내용을 구현할 수 있다.
    val msgTags: String
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}

class Cat(override var category: String, override var species: String) : Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("small", "cat")
    println("Pet Category: ${obj.category}")
    println("Pet Message tags: ${obj.msgTags}")
    obj.feeding()
    obj.patting()
}