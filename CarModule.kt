package com.example.testdaggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class CarModule {
    @TruckQualifier
    @Provides
    fun getTruckEngine(): Engine{
        return TruckEngine()
    }

    @Named("bike")
    @Provides
    fun getBikeEngine(): Engine{
        return BikeEngine()
    }
}