package com.example.testdaggerhilt

import javax.inject.Inject

class Consumer{
    @Inject
    lateinit var car: Car

    fun myConsumerFunction(){
        println("Hello")
        val carComponent: CarComponent = DaggerCarComponent.builder().build()

        carComponent.inject(this)

        car.drive()
    }
}

fun main(){
    Consumer().myConsumerFunction()
}