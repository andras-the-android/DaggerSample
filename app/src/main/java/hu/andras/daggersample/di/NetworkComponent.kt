package hu.andras.daggersample.di;

import javax.inject.Singleton;

import dagger.Component;
import hu.andras.daggersample.network.NetworkApi1;
import hu.andras.daggersample.network.NetworkApi2;

/**
 * Created by Andras_Nemeth on 2017. 10. 03..
 */

@Singleton
@Component(modules = NetworkModule.class)
public interface NetworkComponent {

    NetworkApi1 networkApi1();

    NetworkApi2 networkApi2();

    final class Get {
        private Get(){}

        private static NetworkComponent component;

        public static NetworkComponent component() {
            if (component == null) {
                component = DaggerNetworkComponent.builder()
                        .networkModule(new NetworkModule())
                        .build();
            }
            return component;
        }

    }
}
