package hu.andras.daggersample.di.androidinjection;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import hu.andras.daggersample.di.Feature3ListSubcomponent;
import hu.andras.daggersample.ui.feature3.list.Feature3ListActivity;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */
@Module(subcomponents = Feature3ListSubcomponent.class)
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(Feature3ListActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(Feature3ListSubcomponent.Builder builder);

}
