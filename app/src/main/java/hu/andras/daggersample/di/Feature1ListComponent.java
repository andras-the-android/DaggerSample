package hu.andras.daggersample.di;

import android.app.Activity;


import dagger.Component;
import hu.andras.daggersample.ui.feature1.list.Feature1ListActivity;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@ActivityScope
@Component(dependencies = InteractorComponent.class, modules = Feature1Module.class)
public interface Feature1ListComponent {

    void inject(Feature1ListActivity feature1ListActivity);

    final class Get {
        private Get(){}

        public static Feature1ListComponent component(Activity activity) {
            return DaggerFeature1ListComponent.builder()
                    .activityModule(new ActivityModule(activity))
                    .feature1Module(new Feature1Module(activity))
                    .interactorComponent(InteractorComponent.Get.component())
                    .build();
        }

    }
}
