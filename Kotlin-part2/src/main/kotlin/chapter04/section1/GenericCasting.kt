package chapter04.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
//    val obj1: Child = Parent()    // 에러!
    val obj2: Parent = Child()  // Parent 형식의 obj1은 Child로 형 변환될 수 있음

//    val obj3: Cup<Child> = Cup<Parent>()    // 에러!
//    val obj4: Cup<Parent> = Cup<Child>()    // 에러!
}