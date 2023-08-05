package com.example.testdaggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class CarModule() {

    @TruckQualifier
    @Provides
    fun getTruckEngine(speed: Int): Engine{
        return TruckEngine(speed)
    }

    @Named("bike")
    @Provides
    fun getBikeEngine(): Engine{
        return BikeEngine()
    }
}