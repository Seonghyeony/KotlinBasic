package chapter06.section1

fun main() {
    data class Person(var name: String, var skills: String)
    val person = Person("Kildong", "Kotlin")

    val returnApply = person.apply {
        name = "Sean"
        skills = "Swift"
        "success"   // 사용되지 않음
    }
    println(person)
    println("returnApply: $returnApply")

    val returnRun = person.run {
        name = "Dooly"
        skills = "C++"
        "success"
    }
    println(person)
    println("returnRun: $returnRun")
}