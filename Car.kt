package com.example.testdaggerhilt

import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(
    @TruckQualifier private val engine: Engine){

    fun drive() {
        engine.start()
    }
}
