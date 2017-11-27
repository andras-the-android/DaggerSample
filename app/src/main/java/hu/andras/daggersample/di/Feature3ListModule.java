package hu.andras.daggersample.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.di.androidinjection.AbstractActivityProviderModule;
import hu.andras.daggersample.ui.feature3.list.Feature3ListActivity;

/**
 * Created by Andras Nemeth on 2017-11-27.
 */
@Module
public class Feature3ListModule extends AbstractActivityProviderModule<Feature3ListActivity> {

//    @Provides
//    Context providesContext(Feature3ListActivity activity) {
//        return activity;
//    }
}
