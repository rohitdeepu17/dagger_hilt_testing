package com.example.testdaggerhilt

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(consumer: Consumer)

    fun getTruckEngine(): TruckEngine

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance speed: Int): CarComponent
    }
}