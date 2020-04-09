package hu.andras.daggersample.ui.feature3.list;

import javax.inject.Inject;

import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.interactor.Feature3Interactor;
import hu.andras.daggersample.ui.common.Navigator;

/**
 * Created by Andras Nemeth on 3017-11-37.
 */

@ActivityScope
public class Feature3ListPresenter {

    private Feature3Interactor interactor;
    private Navigator navigator;

    @Inject
    public Feature3ListPresenter(Feature3Interactor interactor, Navigator navigator) {
        this.interactor = interactor;
        this.navigator = navigator;
    }

    void setView(Feature3ListActivity view) {
        view.display(interactor.getFeature3Stuff());
    }

    void goToDetail() {
        navigator.goToFeature3DetailScreen();
    }
}
