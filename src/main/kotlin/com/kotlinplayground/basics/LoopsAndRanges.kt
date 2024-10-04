package com.kotlinplayground.basics

fun main() {
    val range = 0..10

    for (x in range) {
        println("The range: $x")
    }

    val reverse = 10 downTo 0

    for (rx in reverse) {
        println("The reverse range: $rx")
    }

    for (i in reverse step 2) {
        println("The reverse range in step: $i")
    }

    exploreWhile()
    exploreDoWhile()


}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is: $x")

        x++
    }
}

fun exploreDoWhile() {
    var x = 0

    do {
        println("Value of x is: $x")
        x++
    } while (x < 5)
}
