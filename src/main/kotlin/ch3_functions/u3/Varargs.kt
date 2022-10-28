package ch3_functions.u3

fun max(vararg numbers: Int): Int {
    var max = 0
    for (num in numbers) {
        max = kotlin.math.max(num, max)
    }
    return max
}

fun main(args: Array<String>) {
    max(*(intArrayOf(1, 2, 3, 4, 5, 6)))

    val listOf = listOf(1, 2, 3, 4)
    max(*(listOf.toIntArray()))

    val a = fun(a: Int): Int {
        return a * a
    }

    println(a(10))

    var runnable: Runnable = Runnable {
        println("hello")
    }
}