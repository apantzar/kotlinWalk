package com.kotlinplayground.classes

class Item(
) {
    var name: String = ""
    var price: Double = 0.0
        get() {
            return field
        }
        set(value) {
            if (value > 0.0) {
                field = value
            } else {
                throw IllegalAccessException("Value should be greater that 0.0")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }

    init {
        println("Inside init block")
    }
}

fun main() {
    val item = Item("Iphone")
    println("The item is: ${item.name}")

    item.price = 20.0
   // item.price = -1.0
}