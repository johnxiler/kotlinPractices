// Using Index with withIndex()
// The withIndex() function is a built-in function in Kotlin that allows you to 
//iterate over a collection while keeping track of the index of each element.
// This is particularly useful when you need both the index and the value of each element in the collection.

fun main() {
    usingIndex() // prints 0: 1, 1: 2, 2: 3, 3: 4, 4: 5
}

fun usingIndex() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val mutableNumbers = mutableListOf(1, 2, 3, 4, 5)
    val clonedNumbers = mutableNumbers.toMutableList()
    clonedNumbers.add(6) // Adding a new element to the cloned list
    
    // for (index in clonedNumbers.indices) {
    //     println("$index: ${clonedNumbers[index]}") // prints 0: 1, 1: 2, 2: 3, 3: 4, 4: 5
    // }

    for ((index, value) in clonedNumbers.withIndex()) {
        println("$index: $value") // prints 0: 1, 1: 2, 2: 3, 3: 4, 4: 5
    }
    // The indices property returns a range of valid indices for the list,

    val numbersMap = mapOf(0 to 0, 1 to 1, 2 to 2, 3 to 3, 4 to 4, 5 to 5)

    val mutableMaps = mutableMapOf(0 to 0, 1 to 1, 2 to 2, 3 to 3, 4 to 4, 5 to 5)
    val clonedMaps = mutableMaps.toMutableMap()
    clonedMaps[6] = 6 // Adding a new key-value pair to the cloned map

    for ((key, value) in clonedMaps) {
        println("$key: $value") // prints 0: 0, 1: 1, 2: 2, 3: 3, 4: 4, 5: 5
    }
    // The listOf function creates a list of integers from 0 to 5.

    for((key, value) in numbersMap) {
        println("$key: $value") // prints 1: 1, 2: 2, 3: 3, 4: 4, 5: 5
    }
    
    for ((index, value) in numbers.withIndex()) {
        println("$index: $value") // prints 0: 1, 1: 2, 2: 3, 3: 4, 4: 5
    }
    // The withIndex() function returns a sequence of IndexedValue objects, 
    // each containing the index and the corresponding value from the original collection.
}
// This allows you to easily access both the index and the value in a single loop,