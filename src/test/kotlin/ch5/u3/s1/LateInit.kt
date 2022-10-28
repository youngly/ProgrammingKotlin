package ch5.u3.s1

class LateInit {
    val i:Int by lazy {
        println("")
        1
    }
}

fun main(args: Array<String>) {
    val lateInit = LateInit()
    println(lateInit.i)
}