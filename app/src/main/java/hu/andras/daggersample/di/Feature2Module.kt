package hu.andras.daggersample.di

import android.app.Activity
import dagger.Module
import dagger.Provides
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.interactor.Feature2Interactor
import hu.andras.daggersample.ui.common.Navigator
import hu.andras.daggersample.ui.feature2.list.Feature2ListPresenter

/**
 * Created by Andras Nemeth on 2017. 06. 14..
 */
@Module(includes = [ActivityModule::class])
class Feature2Module(activity: Activity?) {
    @ActivityScope
    @Provides
    fun provideFeature2ListPresenter(interactor: Feature2Interactor, navigator: Navigator): Feature2ListPresenter {
        return Feature2ListPresenter(interactor, navigator)
    }
}
