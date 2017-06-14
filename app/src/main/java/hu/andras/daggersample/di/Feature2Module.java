package hu.andras.daggersample.di;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import hu.andras.daggersample.interactor.Feature2Interactor;
import hu.andras.daggersample.ui.common.Navigator;
import hu.andras.daggersample.ui.feature2.list.Feature2ListPresenter;

/**
 * Created by Andras Nemeth on 2017. 06. 14..
 */

@Module(includes = {CommonModule.class})
public class Feature2Module {

    public Feature2Module(Activity activity) {
    }

    @ActivityScope
    @Provides
    Feature2ListPresenter provideFeature2ListPresenter(Feature2Interactor interactor, Navigator navigator) {
        return new Feature2ListPresenter(interactor, navigator);
    }
}
