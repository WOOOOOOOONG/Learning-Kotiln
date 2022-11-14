package com

import com.lannstark.lec01.Person

fun main() {
    val str: String? = "ABC"
    println(str?.length)

    val person = Person("공부하는 개발자")
}

fun startsWithA1(str: String?): Boolean? {
    return str!!.startsWith("A");
}