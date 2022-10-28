package ch5.u6

class MapTest {
}

fun main(args: Array<String>) {
    val mapOf = mapOf("google" to "www.google.com")

    for (i in mapOf) {
//        val entry: Map.Entry<String, String> = i
        println(i.key + i.value)
    }

    val any:Any = Throwable()
}