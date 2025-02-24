package org.example

fun main() {
    val carArray = arrayOf("Mercedes", "Lamborghini", "Tesla", "BMW", "Ford")
    println(carArray[0])
    println(carArray[1])
    println(carArray[2])
    println(carArray[3])
    println(carArray[4])

//change the index 0 to the value named: "Toyota"
    carArray[0] = "Toyota"
    println(carArray[0])
    //check the size of the array which is 5
    println(carArray.size)
//checks if the "Mercedes" are on the array list.
    if("Mercedes" in carArray) {
        println("It exists.")
    }else{
        println("It does not exist.")
    }
//iterate over the carArray using for loop
    for(x in carArray) {
        println(x)
    }


}