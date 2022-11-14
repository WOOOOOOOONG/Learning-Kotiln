package com

import com.lannstark.lec03.Person


fun main() {
    val ABC = """
            hi
        """.trimIndent()
    println(ABC)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}