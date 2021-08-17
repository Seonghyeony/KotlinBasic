package chapter01.section5

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities

private class PrivateClass {

    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass() {
//    val opc = PrivateClass()  // 불가 - 프로퍼티 opc는 private이 되어야 함.
    fun test() {
        val pc = PrivateClass() // 가능 - public이지만 test()에 의해 한번 더 가려지기 때문에 가능.
    }
}

fun main() {
    val pc = PrivateClass()
    pc.access()
}

fun topFunction() {
    val tp = PrivateClass()
}