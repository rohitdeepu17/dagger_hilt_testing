package com.example.testdaggerhilt

import javax.inject.Inject

class Consumer{
    @Inject
    lateinit var car: Car

    fun myConsumerFunction(){
        println("Hello")
        val carComponent: CarComponent = DaggerCarComponent.factory().create(23)

        carComponent.inject(this)

        car.drive()
    }
}

fun main(){
    Consumer().myConsumerFunction()
}

/*
Missing binding Error :

D:\Projects\AndroidProjects\TestDaggerHilt\app\build\tmp\kapt3\stubs\debug\com\example\testdaggerhilt\CarComponent.java:7: error: [Dagger/MissingBinding] com.example.testdaggerhilt.Engine cannot be provided without an @Provides-annotated method.
public abstract interface CarComponent {
                ^

  Missing binding usage:
      com.example.testdaggerhilt.Engine is injected at
          com.example.testdaggerhilt.Car(engine)
      com.example.testdaggerhilt.Car is injected at
          com.example.testdaggerhilt.Consumer.car
      com.example.testdaggerhilt.Consumer is injected at
          com.example.testdaggerhilt.CarComponent.inject(com.example.testdaggerhilt.Consumer)
* */