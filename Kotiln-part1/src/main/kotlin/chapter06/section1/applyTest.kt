package chapter06.section1

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    person.apply {
        this.skills = "Swift"
    }
    println(person)

    val returnApply = person.apply {
        name = "Sean"
        skills = "Java"
    }
    println(person)
    println(returnApply)
}