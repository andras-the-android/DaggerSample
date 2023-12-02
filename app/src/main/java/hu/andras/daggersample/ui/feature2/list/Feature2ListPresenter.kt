package hu.andras.daggersample.ui.feature2.list

import hu.andras.daggersample.interactor.Feature2Interactor
import hu.andras.daggersample.ui.common.Navigator

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */
class Feature2ListPresenter(private val interactor: Feature2Interactor, private val navigator: Navigator) {
    fun setView(view: Feature2ListActivity) {
        view.display(interactor.feature2Stuff)
    }

    fun goToDetail() {
        navigator.goToFeature2DetailScreen()
    }
}
