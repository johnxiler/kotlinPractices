// Iterating with Step

// In Kotlin, you can use the `step` keyword to specify the increment between each iteration in a loop.
//This is particularly useful when you want to skip certain values in a range or iterate with a specific step size.
// The `step` keyword can be used with both `for` loops and ranges. 
//It allows you to control the increment of the loop variable, 
//making it easy to create loops that skip values or iterate in a non-standard way.

fun main() {
    stepLoop() // prints 1, 3, 5
}

fun stepLoop() {
    for(i in 1..10 step 2) {
        println(i) // prints 1, 3, 5, 7, 9
    }
    // The loop starts at 1 and increments by 2 each time, so it prints 1, 3, and 5.
}