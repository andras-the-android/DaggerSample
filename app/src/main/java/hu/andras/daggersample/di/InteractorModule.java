package hu.andras.daggersample.di;

import javax.inject.Singleton;


import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.interactor.Feature1Interactor;
import hu.andras.daggersample.network.NetworkApi1;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@Module(includes = NetworkModule.class)
public class InteractorModule {

    @Singleton
    @Provides
    Feature1Interactor provideFeature1Interactor(NetworkApi1 networkApi1) {
        return new Feature1Interactor(networkApi1);
    }
}
