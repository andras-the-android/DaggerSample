package hu.andras.daggersample.di

import android.content.Context
import dagger.Module
import dagger.Provides
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.ui.common.Navigator

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */
@Module
class ActivityModule(private val context: Context) {
    @Provides
    @ActivityScope
    fun provideNavigator(): Navigator {
        return Navigator(context)
    }
}
