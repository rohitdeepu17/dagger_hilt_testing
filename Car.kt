package com.example.testdaggerhilt

import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine){

    fun drive() {
        engine.start()
    }
}
