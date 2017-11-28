package hu.andras.daggersample.ui.feature3.detail;

import javax.inject.Inject;

import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.interactor.Feature3Interactor;

/**
 * Created by Andras Nemeth on 2017-11-28.
 */
@ActivityScope
public class Feature3DetailPresenter {

    private Feature3Interactor interactor;

    @Inject
    public Feature3DetailPresenter(Feature3Interactor interactor) {
        this.interactor = interactor;
    }

    void setView(Feature3DetailActivity view) {
        view.display(interactor.getFeature3Stuff());
    }
}
