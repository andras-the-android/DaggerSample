package hu.andras.daggersample.ui.feature1.list

import hu.andras.daggersample.interactor.Feature1Interactor
import hu.andras.daggersample.ui.common.Navigator

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */
class Feature1ListPresenter(private val interactor: Feature1Interactor, private val navigator: Navigator, private val customBoundInstance: String) {
    fun setView(view: Feature1ListActivity) {
        view.display(interactor.feature1Stuff + " " + customBoundInstance)
    }

    fun goToDetail() {
        navigator.goToFeature1DetailScreen()
    }
}
