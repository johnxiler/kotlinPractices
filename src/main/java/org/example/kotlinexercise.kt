package org.example

fun main() {
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    val comparison1 = 4 <= 4
    val comparison2 = 4 > 3
    val comparison3 = 3 > 4
    val comparison4 = 4 > 3 && 4 <= 4
    val comparison5 = 3 > 4 || 4 > 3

    println(comparison1)
    println(comparison2)
    println(comparison3)
    println(comparison4)
    println(comparison5)
    println(simpleExpression)
    println("end of expression")
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    val test1 = (!bool || y < z) //true
    val test2 = z > (x + y) && (!bool || y > z) //false
    val test3 = bool || z > (x + y) //true
    val test4 = !(x != z) && bool //true

    println(test1)
    println(test2)
    println(test3)
    println(test4)

    println(hardExpression)

    val q = 5
    val w = 10

    if (!(q > w) && (w > q)) {
        println("true")
    } else {
        println("not true")
    }

    fun isPalindrome(str: String): Boolean {
        val cleanStr = str.lowercase()
            .replace("[^a-z0-9]".toRegex(), "")  // Remove non-alphanumeric characters and convert to lowercase
        val length = cleanStr.length

        for (i in 0 until length / 2) {
            if (cleanStr[i] != cleanStr[length - 1 - i]) {
                return false  // If characters don't match, it's not a palindrome
            }
        }
        return true  // All characters matched, it is a palindrome
    }

    val testString = "123321"
    if (isPalindrome(testString)) {
        println("\"$testString\" is a palindrome")
    } else {
        println("\"$testString\" is not a palindrome")
    }
}