package org.example.differentclasses

data class Person2(var name: String, var age: Int)

fun main(){
    val person = Person2("Dmitry", 17)
    person.age = 22

    println(person)
}