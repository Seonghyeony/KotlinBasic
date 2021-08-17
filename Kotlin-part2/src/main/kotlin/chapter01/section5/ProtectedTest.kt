package chapter01.section5

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
//
    }
}

class Derived: Base() {
    var j = 1 + i
    fun derivedFunc(): Int {
        protectedFunc()
        return i
    }
}