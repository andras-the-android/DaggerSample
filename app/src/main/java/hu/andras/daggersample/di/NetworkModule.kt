package hu.andras.daggersample.di

import dagger.Module
import dagger.Provides
import hu.andras.daggersample.network.NetworkApi1
import hu.andras.daggersample.network.NetworkApi2
import javax.inject.Singleton

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */
@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideNetworkApi1(): NetworkApi1 {
        return NetworkApi1()
    }

    @Provides
    @Singleton
    fun provideNetworkApi2(): NetworkApi2 {
        return NetworkApi2()
    }
}
