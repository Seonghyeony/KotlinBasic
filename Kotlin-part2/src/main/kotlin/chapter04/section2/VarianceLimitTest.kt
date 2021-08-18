package chapter04.section2

open class Animal(val size: Int)

class Cat(val jump: Int) : Animal(50)

class Spider(val poison: Boolean) : Animal(1)

// 형식 매개변수를 Animal로 제한.
class Box<out T: Animal>(val element: T) {  // 주 생성자에서 val만 허용
    fun getAnimal(): T = element    // out은 반환 자료형에만 사용할 수 있음.
//    fun set(new: T) {     // 오류! T는 in 위치에 사용할 수 없음.
//        element = new
//    }
}

fun main() {
    val c1 = Cat(10)
    val s1 = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("s1 ${a1.size} ${a1.poison}")   // a1은 Animal 타입이므로 하위 형식으로 스마트 캐스트 되어 값을 사용할 수 있다.

//    val b1: Box<Animal> = Box<Animal>()
//    val b2: Box<Animal> = Box<Cat>()
//    val b3 = Box<Spider>()
//    val b4: Box<Number> = Box<Int>()  // 자료형 제한


}