package com.kotlinplayground.basics

fun main() {
    for (i in 1..5) {
        println("i in $i")

        if (i == 3) break
    }

    println("End of the Program!")

    label()

}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")

        innerLoop@ for (j in 1..5) {
            println("j in label $j")
            if (j == 2) break@innerLoop
        }

    }
}