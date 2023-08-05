package com.example.testdaggerhilt

import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun getTruckEngine(): Engine{
        return TruckEngine()
    }
}