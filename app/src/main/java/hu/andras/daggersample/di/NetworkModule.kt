package hu.andras.daggersample.di;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.network.NetworkApi1;
import hu.andras.daggersample.network.NetworkApi2;

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    NetworkApi1 provideNetworkApi1() {
        return new NetworkApi1();
    }

    @Provides
    @Singleton
    NetworkApi2 provideNetworkApi2() {
        return new NetworkApi2();
    }
}
