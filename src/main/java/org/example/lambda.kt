package org.example

fun main() {
    printMessage(18,"Aries")
}

val printMessage: (age:Int, name: String) -> Unit = { age, name ->
    when (age) {
        in 1 .. 17 -> {
            println("$age, $name is not an adult")
        }
        else -> {
            println("$age, $name is an adult")
        }
    }
}
