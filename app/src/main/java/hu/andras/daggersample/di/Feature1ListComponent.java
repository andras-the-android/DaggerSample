package hu.andras.daggersample.di;

import android.app.Activity;


import dagger.BindsInstance;
import dagger.Component;
import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.ui.feature1.list.Feature1ListActivity;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@ActivityScope
@Component(dependencies = InteractorComponent.class, modules = Feature1Module.class)
public interface Feature1ListComponent {

    void inject(Feature1ListActivity feature1ListActivity);

    /**
     * https://stackoverflow.com/questions/42602803/dagger-2-component-builder
     * As Jeremy pointed out in the comments, you'll need an explicit interface if you want to use @BindsInstance.
     An explicit interface lets you name your Module methods arbitrarily or add per-method Javadoc to your builder methods. This might be especially handy if your Module instances are optional or if they need to be manually created.
     Some IDEs and tools don't do well with code-generated interfaces. An explicit Builder lets you define your own tool-readable interfaces and let Dagger generate the implementations later.
     An explicit interface may make it easier to mock your component builders in unit tests. This may be especially handy for subcomponent builders, which observe the same rules as component builders.
     */

    @Component.Builder
    interface Builder {
        Feature1ListComponent build();
        @BindsInstance Builder customInstance(String s);
        Builder activityModuleWithCustomName(ActivityModule commonModule);
        Builder feature1Module(Feature1Module feature1Module);
        Builder interactorComponent(InteractorComponent interactorComponent);
    }

    final class Get {
        private Get(){}

        public static Feature1ListComponent component(Activity activity) {
            return DaggerFeature1ListComponent.builder()
                    .customInstance("I'm the custom instance!")
                    .activityModuleWithCustomName(new ActivityModule(activity))
                    .feature1Module(new Feature1Module(activity))
                    .interactorComponent(InteractorComponent.Get.component())
                    .build();
        }

    }
}
