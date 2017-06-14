package hu.andras.daggersample.di;

import javax.inject.Singleton;


import dagger.Component;
import hu.andras.daggersample.interactor.Feature1Interactor;

/**
 * Created by Andras_Nemeth on 2017. 06. 14..
 */

@Singleton
@Component(modules = InteractorModule.class)
interface InteractorComponent {

    Feature1Interactor feature1Interactor();

    final class Get {
        private Get(){}

        private static InteractorComponent component;

        public static InteractorComponent component() {
            if (component == null) {
                component = DaggerInteractorComponent.builder()
                        .networkModule(new NetworkModule())
                        .interactorModule(new InteractorModule())
                        .build();
            }
            return component;
        }

    }
}
