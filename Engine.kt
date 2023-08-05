package com.example.testdaggerhilt

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

interface Engine{
    fun start()
}

@Singleton
class TruckEngine @Inject constructor(private val speed: Int): Engine{
    override fun start() {
        println("Truck's Engine starting at speed : $speed")
    }

}

@Named("bike")
class BikeEngine: Engine{
    override fun start(){
        println("Bike's Engine starting")
    }
}