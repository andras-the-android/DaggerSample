package hu.andras.daggersample.di.androidinjection;

import android.app.Activity;
import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */

@Module
public abstract class AbstractActivityProviderModule<T extends Activity> {

    @Provides
    public Activity providesActivity(T activity) {
        return activity;
    }

    @Provides
    public Context providesContext(T activity) {
        return activity;
    }
}
