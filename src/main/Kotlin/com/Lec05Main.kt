package com

fun main() {
    getPassOrFail(50)
}

fun getPassOrFail(score: Int): Unit {
    var grade = if (score >= 50) {
        "Pass"
    } else {
        "False"
    }

    println(grade)
}