package chapter06.section1

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)
    val user = User("Kildong", "default")

    val result = with(user) {
        skills = "Swift"
        email = "kildong@example.com"
    }
    println(user)
    println("result: $result")
}