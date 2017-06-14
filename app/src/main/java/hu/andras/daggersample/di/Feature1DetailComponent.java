package hu.andras.daggersample.di;

import android.app.Activity;


import dagger.Component;
import hu.andras.daggersample.ui.feature1.detail.Feature1DetailActivity;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@ActivityScope
@Component(dependencies = InteractorComponent.class)
public interface Feature1DetailComponent {

    void inject(Feature1DetailActivity feature1ListActivity);

    final class Get {
        private Get(){}

        static Feature1DetailComponent component;

        public static Feature1DetailComponent component(Activity activity) {
            if (component == null) {
                component = DaggerFeature1DetailComponent.builder()
                        .interactorComponent(InteractorComponent.Get.component())
                        .build();
            }
            return component;
        }

    }
}
