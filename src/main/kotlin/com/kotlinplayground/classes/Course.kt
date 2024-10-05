package com.kotlinplayground.classes

data class Course(val id: Int, val name: String, val author: String)

fun main() {
    val course1 = Course(1, "Maths", "The author")
    val course2 = Course(2, "Maths", "The author")
    val course3 = course1.copy(
        id=3,
        author = "Pantzartzis"
    )

    println(course1 == course2)
    println(course3)
}