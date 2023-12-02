package hu.andras.daggersample.di

import android.app.Activity
import dagger.BindsInstance
import dagger.Component
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.ui.feature1.list.Feature1ListActivity
import javax.inject.Named

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */
@ActivityScope
@Component(dependencies = [InteractorComponent::class], modules = [Feature1Module::class])
interface Feature1ListComponent {
    fun inject(feature1ListActivity: Feature1ListActivity?)

    /**
     * https://stackoverflow.com/questions/42602803/dagger-2-component-builder
     * As Jeremy pointed out in the comments, you'll need an explicit interface if you want to use @BindsInstance.
     * An explicit interface lets you name your Module methods arbitrarily or add per-method Javadoc to your builder methods. This might be especially handy if your Module instances are optional or if they need to be manually created.
     * Some IDEs and tools don't do well with code-generated interfaces. An explicit Builder lets you define your own tool-readable interfaces and let Dagger generate the implementations later.
     * An explicit interface may make it easier to mock your component builders in unit tests. This may be especially handy for subcomponent builders, which observe the same rules as component builders.
     */
    @Component.Builder
    interface Builder {
        fun build(): Feature1ListComponent?

        @BindsInstance
        fun customInstance1(@Named("first") s: String): Builder

        @BindsInstance
        fun customInstance2(@Named("second") s: String): Builder
        fun activityModuleWithCustomName(commonModule: ActivityModule?): Builder
        fun feature1Module(feature1Module: Feature1Module): Builder
        fun interactorComponent(interactorComponent: InteractorComponent): Builder
    }

    object Get {
        /**
         * You have to set all the bound instances unless IllegalArgumentException will be thrown during injection which is dangerous.
         */
        fun component(activity: Activity): Feature1ListComponent? {
            return DaggerFeature1ListComponent.builder()
                .customInstance1("I'm the custom instance!")
                .customInstance2("And I'm a custom instance too!")
                .activityModuleWithCustomName(ActivityModule(activity))
                .feature1Module(Feature1Module(activity))
                .interactorComponent(InteractorComponent.Get.component)
                .build()!!
        }
    }
}
