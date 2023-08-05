package com.example.testdaggerhilt

import javax.inject.Inject

interface Engine{
    fun start()
}

class TruckEngine @Inject constructor(): Engine{
    override fun start() {
        println("Truck's Engine starting")
    }

}
class BikeEngine: Engine{
    override fun start(){
        println("Bike's Engine starting")
    }
}