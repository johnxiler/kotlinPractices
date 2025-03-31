package org.example.differentclasses

abstract class Shape(){
    abstract fun draw(): String
    fun area() {
        println("Area")
    }
}

abstract class Shape3(){
    abstract fun draw3(): String
    fun area3() {
        println("Area")
    }
}

interface Shape2 {
    fun draw(): String
    fun area()
}

class Circle() : Shape2 {
    override fun draw(): String {
        return "circle"
    }

    override fun area() {
        TODO("Not yet implemented")
    }
}


interface LoginRepository {
    fun loadApi()
    fun deleteItemInApi()
}

class LoginRepositoryImpl :Shape2 {
    override fun draw(): String {
        TODO("Not yet implemented")
    }

    override fun area() {
        TODO("Not yet implemented")
    }


}