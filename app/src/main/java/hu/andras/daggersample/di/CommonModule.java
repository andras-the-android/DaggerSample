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
public class CommonModule {

    private Context context;

    public CommonModule() {
        this.context = DaggerSampleApplication.getInstance();
    }

    @Provides
    @ActivityScope
    Navigator provideNavigator() {
        return new Navigator(context);
    }

}
