package com.example.testdaggerhilt

import dagger.Component

@Component(modules = [CarModule::class])
interface CarComponent {
    fun inject(consumer: Consumer)
}