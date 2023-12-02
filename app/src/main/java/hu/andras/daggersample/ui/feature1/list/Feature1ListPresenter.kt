package hu.andras.daggersample.ui.feature1.list;

import hu.andras.daggersample.interactor.Feature1Interactor;
import hu.andras.daggersample.ui.common.Navigator;

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */

public class Feature1ListPresenter {

    private Feature1Interactor interactor;
    private Navigator navigator;
    private String customBoundInstance;

    public Feature1ListPresenter(Feature1Interactor interactor, Navigator navigator, String customBoundInstance) {
        this.interactor = interactor;
        this.navigator = navigator;
        this.customBoundInstance = customBoundInstance;
    }

    void setView(Feature1ListActivity view) {
        view.display(interactor.getFeature1Stuff() + " " + customBoundInstance);
    }

    void goToDetail() {
        navigator.goToFeature1DetailScreen();
    }
}
