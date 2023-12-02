package hu.andras.daggersample.di

import android.app.Activity
import dagger.Module
import dagger.Provides
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.interactor.Feature1Interactor
import hu.andras.daggersample.ui.common.Navigator
import hu.andras.daggersample.ui.feature1.list.Feature1ListPresenter
import javax.inject.Named

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */
@Module(includes = [ActivityModule::class])
class Feature1Module(activity: Activity?) {
    @ActivityScope
    @Provides
    fun provideFeature1ListPresenter(
        interactor: Feature1Interactor,
        navigator: Navigator,
        @Named("second") boundInstance: String
    ): Feature1ListPresenter {
        return Feature1ListPresenter(interactor, navigator, boundInstance)
    }
}
