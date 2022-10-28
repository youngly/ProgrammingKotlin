package ch3_functions.u3

fun fib(): () -> Int {
    var first = 0
    var second = 1
    return {
        val fibResult = first + second
        first = second
        second = fibResult
        first
    }
}

fun main(args: Array<String>) {
    val fibs = fib()
    for (i in 0..10) {
        println(fibs())
    }
}