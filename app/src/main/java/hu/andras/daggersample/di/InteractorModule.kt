package hu.andras.daggersample.di

import dagger.Module
import dagger.Provides
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.di.scopes.IteractorScope
import hu.andras.daggersample.interactor.Feature1Interactor
import hu.andras.daggersample.interactor.Feature2Interactor
import hu.andras.daggersample.network.NetworkApi1
import java.util.Date

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */
@Module
class InteractorModule {
    @IteractorScope
    @Provides
    fun provideFeature1Interactor(networkApi1: NetworkApi1): Feature1Interactor {
        return Feature1Interactor(networkApi1)
    }

    @IteractorScope
    @Provides
    fun provideFeature2Interactor(networkApi1: NetworkApi1): Feature2Interactor {
        return Feature2Interactor(networkApi1)
    }

    /**
     * You can use any scope, but you can reference it only from a matching component.
     */
    @ActivityScope
    @Provides
    fun randomObject(): Date {
        return Date()
    }
}
