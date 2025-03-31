// Iterating in Reverse
// In Kotlin, you can iterate over a range in reverse order using the `downTo` keyword.
// This is useful when you want to loop from a higher number to a lower number, 
//such as counting down or iterating through a list in reverse.
// The `downTo` keyword creates a range that goes from the first number to the second number in reverse order, 
//and you can use it with a `for` loop to iterate through the range.
// The syntax is similar to the `..` operator, but you use the `downTo` keyword instead.
// The `downTo` keyword is a part of the Kotlin standard library and is 
//used to create a range that goes from a higher number to a lower number.
// It is particularly useful when you want to iterate in reverse order, such as counting down or iterating 
//through a list in reverse.

fun main() {
    reverseLoop() // prints 5, 4, 3, 2, 1
}

fun reverseLoop() {
    for (i in 5 downTo 1) {
        println(i) // prints 5, 4, 3, 2, 1
    }
    // The loop starts at 5 and decrements by 1 each time, so it prints 5, 4, 3, 2, and 1.
}