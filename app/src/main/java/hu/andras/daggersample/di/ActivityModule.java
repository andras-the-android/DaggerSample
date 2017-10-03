package hu.andras.daggersample.di;

import android.content.Context;


import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.DaggerSampleApplication;
import hu.andras.daggersample.ui.common.Navigator;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@Module
public class ActivityModule {

    private Context context;

    public ActivityModule(Context viewContext) {
        this.context = viewContext;
    }

    @Provides
    @ActivityScope
    Navigator provideNavigator() {
        return new Navigator(context);
    }

}
