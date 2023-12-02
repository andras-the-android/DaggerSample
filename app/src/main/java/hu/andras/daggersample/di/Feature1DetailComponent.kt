package hu.andras.daggersample.di

import android.app.Activity
import dagger.Component
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.ui.feature1.detail.Feature1DetailActivity

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */
@ActivityScope
@Component(dependencies = [InteractorComponent::class])
interface Feature1DetailComponent {
    fun inject(feature1ListActivity: Feature1DetailActivity?)

    object Get {
        fun component(activity: Activity?): Feature1DetailComponent {
            return DaggerFeature1DetailComponent.builder()
                .interactorComponent(InteractorComponent.Get.component)
                .build()
        }
    }
}
