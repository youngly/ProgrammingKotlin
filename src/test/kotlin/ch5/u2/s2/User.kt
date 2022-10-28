package ch5.u2.s2

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DatabaseDelegate<in R, T>(private val field: String, private val id: Int) : ReadWriteProperty<R, T> {
    override fun getValue(thisRef: R, property: KProperty<*>): T = queryForValue(field, id) as T

    override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        update(field, id, value)
    }

    class NoRecordFoundException(id: Int) : Exception("No record found for id $id")

    private val data = arrayOf<MutableMap<String, Any?>>(
        mutableMapOf("id" to 1, "name" to "Tony", "password" to "123456"),
        mutableMapOf("id" to 2, "name" to "Monica", "password" to "123456")
    )

    private fun queryForValue(field: String, id: Int): Any {
        val value = data.firstOrNull {
            it["id"] == id
        }?.get(field) ?: throw NoRecordFoundException(id)
        println("loaded value $value for field \"$field\" of record $id")
        return value
    }

    private fun update(field: String, id: Int, value: Any?) {
        println("update field \"$field\" of record $id to value $value")
        data.firstOrNull { it["id"] == id }?.put(field, value) ?: throw NoRecordFoundException(id)
    }
}

class User(private val id: Int) {
    var name: String by DatabaseDelegate<User, String>("name", id)
    var password: String by DatabaseDelegate<User, String>("password", id)
}

fun main(args: Array<String>) {
    val tony = User(2)
    println("tony.password = " + tony.password)
    println("-------------->-------")
}