package hu.andras.daggersample.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.ui.feature3.list.Feature3ListActivity;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */
@ActivityScope
@Subcomponent(modules = Feature3ListModule.class)
public interface Feature3ListSubcomponent  extends AndroidInjector<Feature3ListActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Feature3ListActivity>{}
}
