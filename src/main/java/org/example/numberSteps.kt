package org.example
/*
1. Number steps
Many programming languages have built-in functions that output sequences of numbers separated
by steps. Create your own Kotlin function from scratch that creates a sequenced list of
numbers from 0 to a maximum input value and input step. For example, a maximum value of
8 and a step value of 2 should return an output of [2, 4, 6, 8].

If you’re looking for more of a challenge, create a Fibonacci sequence generator.
Remember that the following number of a Fibonacci sequence is the sum of the two preceding it:
[1, 1, 2, 3, 5, 8, 13].
*/
fun main(){
    val baseNumber = 8
    var inputValue = 0
    var stepValue = 2
    println("First $baseNumber terms: ")
    for (number in 1..baseNumber) {
        println("$inputValue + ") //check
        val sum = inputValue + stepValue
        inputValue = stepValue
        stepValue = sum
    }
}
//fibonacci sequence