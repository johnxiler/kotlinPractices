// Using until (Exclusive Range)

// The until function creates an exclusive range, meaning the end value is not included in the range.
// This is useful when you want to iterate up to a certain number but not include it in the loop.
// The syntax is similar to the range operator, but you use the until function instead.
// The until function is a part of the Kotlin standard library and is used to create a range that excludes the end value.

fun main() {
    untilLoop() // prints 1, 2, 3, 4
}

fun untilLoop() {
    for (i in 1 until 6) {
        println(i) // prints 1, 2, 3, 4, 5
    }
    // The loop starts at 1 and goes up to (but does not include) 5.
}