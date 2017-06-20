package hu.andras.daggersample.di;


import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.interactor.Feature1Interactor;
import hu.andras.daggersample.ui.common.Navigator;
import hu.andras.daggersample.ui.feature1.list.Feature1ListPresenter;

/**
 * Created by Andras Nemeth on 2017. 06. 05..
 */

@Module(includes = {CommonModule.class})
public class Feature1Module {

    public Feature1Module(Activity activity) {
    }

    @ActivityScope
    @Provides
    Feature1ListPresenter provideFeature1ListPresenter(Feature1Interactor interactor, Navigator navigator, String boundInstance) {
        return new Feature1ListPresenter(interactor, navigator, boundInstance);
    }
}
