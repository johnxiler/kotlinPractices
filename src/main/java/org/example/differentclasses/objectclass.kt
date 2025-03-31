package org.example.differentclasses

object Color {
    val gradient = "#fffffs"
    val count = 3
}

class ColorClass {
    companion object {
        val gradient = "gghg"
        public val count = 3
    }

}

fun main () {
    println(ColorClass.gradient)
    print(Color.gradient)
}