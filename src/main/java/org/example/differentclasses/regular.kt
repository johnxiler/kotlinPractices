package org.example.differentclasses

class Person(var name: String, var age: Int) {

}

fun main() {
    val person = Person("Dmitry", 17)
    person.age = 22
    println(person)
}