package com.example.testdaggerhilt

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CarModule {
    @Binds
    abstract fun getTruckEngine(truckEngine: TruckEngine): Engine
}