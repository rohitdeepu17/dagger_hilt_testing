package com.example.testdaggerhilt

class Consumer{
    lateinit var car: Car

    lateinit var engine1: Engine

    lateinit var engine2: Engine

    lateinit var engine3: Engine

    fun myConsumerFunction(){
        println("Hello")
        val carComponent: CarComponent = DaggerCarComponent.factory().create(23)

        carComponent.inject(this)

        engine1 = carComponent.getTruckEngine()
        engine2 = carComponent.getTruckEngine()

        val carComponent1: CarComponent = DaggerCarComponent.factory().create(23)

        engine3 = carComponent1.getTruckEngine()

        println("Engine1 : ${engine1.hashCode()}")
        println("Engine2 : ${engine2.hashCode()}")
        println("Engine3 : ${engine3.hashCode()}")

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