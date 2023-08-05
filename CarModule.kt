package com.example.testdaggerhilt

import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun getTruckEngine(truckEngine: TruckEngine): Engine{
        return truckEngine
    }
}