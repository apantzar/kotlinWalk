package com.kotlinplayground.basics

fun main() {
    var name : String = ""
    var position : Int = 0
    name = "Anastasios"

    val result = if(name.length > 4){
        println("Name has more that 4 characters")
        name.length
    }else{
        println("Name has less than 4 characters")
        name.length
    }


    println("The name has: $result chars")


    position = 10

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "Bronze"
        else -> "No medal for you :/"
    }

    println(medal)
}