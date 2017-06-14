package hu.andras.daggersample.di;

import javax.inject.Singleton;


import dagger.Component;
import hu.andras.daggersample.interactor.Feature1Interactor;
import hu.andras.daggersample.interactor.Feature2Interactor;

/**
 * Created by Andras_Nemeth on 2017. 06. 14..
 */

@Singleton
@Component(modules = InteractorModule.class)
public interface InteractorComponent {

    //Need to expose for the other components which depend on this
    Feature1Interactor feature1Interactor();

    //subcomponent automatically can inject everything the parent's modules can,
    //so this is not necessary for the inheritence. Only Feature2DetailActivity uses directly.
    Feature2Interactor feature2Interactor();

    Feature2ListSubcomponent feature2ListSubcomponent(Feature2Module feature2Module);

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
