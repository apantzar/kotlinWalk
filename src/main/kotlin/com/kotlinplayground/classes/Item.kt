package com.kotlinplayground.classes

class Item() {

    var name: String = ""

    constructor(_name: String) : this(){
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("The item is: ${item.name}")
}