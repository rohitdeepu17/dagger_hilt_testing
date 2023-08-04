package com.example.testdaggerhilt

import dagger.Component

@Component
interface CarComponent {
    fun getCarComponent(): Car
}