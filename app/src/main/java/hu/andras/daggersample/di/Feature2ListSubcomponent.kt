package hu.andras.daggersample.di

import dagger.Subcomponent
import hu.andras.daggersample.di.scopes.ActivityScope
import hu.andras.daggersample.ui.feature2.list.Feature2ListActivity

/**
 * Created by Andras Nemeth on 2017. 06. 14..
 */
@ActivityScope
@Subcomponent(modules = [Feature2Module::class])
interface Feature2ListSubcomponent {
    fun inject(feature2ListActivity: Feature2ListActivity?)
}
