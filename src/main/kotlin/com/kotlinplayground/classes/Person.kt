package com.kotlinplayground.classes

class Person(val name: String, val age: Int) {
    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = Person("Anastasios", 25)
    person.action()
    println("Name: ${person.name}, Age: ${person.age}")

}