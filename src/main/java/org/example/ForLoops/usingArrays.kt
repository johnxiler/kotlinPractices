// Iterating Over Arrays or Lists
// In Kotlin, you can iterate over arrays or lists using a `for` loop.
// This is useful when you want to perform an operation on each element in the array or list, such as printing the values or performing calculations.
// The syntax is similar to the `for` loop used with ranges, but you use the array or list name instead of a range.
// The `for` loop will iterate over each element in the array or list, allowing you to access and manipulate the values as needed.

fun main() {
   arrayLoop() // prints 1, 2, 3, 4, 5
}

fun arrayLoop() {
    val numbersArray = arrayOf(1, 2, 3, 4, 5)
    
    val numbersList = listOf("1", 2, "3", 4, "5")
    // The arrayOf function creates an array of integers from 1 to 5.
    // The listOf function creates a list of mixed types (String and Int) from 1 to 5.
    
    for (num in numbersList) {
        println(num) // prints 1, 2, 3, 4, 5
    }

    for (num in numbersArray) {
        println(num) // prints 1, 2, 3, 4, 5
    }
    // The loop iterates over each element in the array and prints it.
}