package com.example.testdaggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CarModule(private val speed: Int) {
    @TruckQualifier
    @Provides
    fun getTruckEngine(): Engine{
        return TruckEngine(speed)
    }

    @Named("bike")
    @Provides
    fun getBikeEngine(): Engine{
        return BikeEngine()
    }
}