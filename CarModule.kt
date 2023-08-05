package com.example.testdaggerhilt

import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun getBikeEngine(): Engine{
        return BikeEngine()
    }
}