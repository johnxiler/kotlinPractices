// 1. Iterating Over a Range
// In Kotlin, you can use the `..` operator to create a range of numbers and iterate over it using a `for` loop.
// This is useful when you want to perform an operation on each number in the range, 
// such as printing the values or performing calculations.
// The syntax is simple: you specify the start and end values of the range using the `..` operator,
// and then use a `for` loop to iterate over the range. The `for` loop will automatically 
// handle the incrementing of the loop variable,

fun main() {
    rangeIn() // prints 1, 2, 3, 4, 5

}

fun rangeIn() {
    val i = 1..20 // The range operator creates a range of integers from 1 to 20.
    for (num in i) {
        println(num) // prints 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
    }
}