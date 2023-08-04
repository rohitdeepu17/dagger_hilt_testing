package com.example.testdaggerhilt

class Car(private val engine: Engine){

    fun drive() {
        engine.start()
    }
}

fun main(){
    val engine: Engine = Engine()
    val car:Car = Car(engine)
    car.drive()
}

/*
Problems : SOLVED
1. class Car not testable without Engine
2. class Car not extensible (tomorrow if class Engine is defined as an interface with some derived classes implementing it)
3. class Car is violating Single Responsibility Principle by doing these 2 things:-
   A. Creating an instance of class Engine
   B. Providing functionality of API drive
4. The object of Engine is not usable outside class Car. So, reusability principle is not followed.
* */