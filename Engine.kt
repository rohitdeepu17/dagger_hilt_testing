package com.example.testdaggerhilt

import javax.inject.Inject

class Engine @Inject constructor(){
    fun start(){
        println("Engine starting")
    }
}