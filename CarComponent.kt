package com.example.testdaggerhilt

import dagger.BindsInstance
import dagger.Component

@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(consumer: Consumer)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance speed: Int): CarComponent
    }
}