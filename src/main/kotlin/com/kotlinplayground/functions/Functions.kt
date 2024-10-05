package com.kotlinplayground.functions

import java.time.LocalDate


fun main() {
    printName("Anastasios")
    val result = addition(10, 30)

    println("The result is: $result")
    printPersonalData("Anastasios", "anastasiospantz@gmail.com", LocalDate.parse("1999-04-20"))
    printPersonalData("Anastasios", )

    val num = topLevelFunction()
    println("The num from the top level fun is: $num")

}

fun printName(name: String) {
    println("Your name is: $name")
}

fun addition(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun printPersonalData(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name is $name and the email is $email and the dob is $dob")
}