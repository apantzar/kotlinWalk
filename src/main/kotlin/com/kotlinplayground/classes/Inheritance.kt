package com.kotlinplayground.classes

open class User(val name: String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("User ${this.name} is logged in")
    }
}

class Student(name: String) : User(name) {

    override var isLoggedIn : Boolean = true
    override fun login() {
        println("Inside student login function")
    }
}

class Instructor(name: String) : User(name)


fun main() {
    var student = Student("Anastasios")
    println("Name of student: ${student.name}")
    student.login()
    var instructor = Instructor("The instructor")
    println("Name of instructor: ${instructor.name}")
    instructor.login()
}