import kotlin.reflect.KProperty

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "${property.name} : $thisRef"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("value = $value")
    }
}

class User {
    var name: String by Delegate()
    var password: String by Delegate()
}

fun main(args: Array<String>) {
    val user = User()
    println(user.name)
    user.name = "Tony"
    println(user.password)
    user.password = "123456"

    println(IntArray(6) {
        it * it
    }.sum())

    val a = A()
    val x = a.getX<Int, String>(10)

    val list: List<Number> = List<Int>(5) { it }
}

class A {
    fun <T, R> getX(a: T): R {
        return a as R
    }
}