package hu.andras.daggersample.interactor

import hu.andras.daggersample.network.NetworkApi1

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */
class Feature1Interactor(private val networkApi1: NetworkApi1) {
    init {
        println("ddd Feature1Interactor created $this")
    }

    val feature1Stuff: String
        get() = "##" + networkApi1.request + "feature1 interactor: " + this + "##"
}
