package com.kotlinplayground.functions

fun topLevelFunction(): Int {
    return (0..100).random()
}

fun main() {
    val num = topLevelFunction()
    println("The random num is: $num")
}