package hu.andras.daggersample.interactor

import hu.andras.daggersample.network.NetworkApi1

/**
 * Created by Andras Nemeth on 2017. 06. 14..
 */
class Feature2Interactor(private val networkApi1: NetworkApi1) {
    init {
        println("ddd Feature2Interactor created $this")
    }

    val feature2Stuff: String
        get() = "##" + networkApi1.request + "feature2 interactor: " + this + "##"
}
