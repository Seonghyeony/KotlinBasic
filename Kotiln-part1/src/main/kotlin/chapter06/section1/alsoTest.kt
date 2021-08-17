package chapter06.section1

fun main() {

    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Swift"
        "Success"
    }

    val b = person.also {
        it.skills = "iOS"
        "success"
    }

    println("a $a")
    println("person $person")
    println("b $b")
}