package hu.andras.daggersample.di

import dagger.Component
import hu.andras.daggersample.network.NetworkApi1
import hu.andras.daggersample.network.NetworkApi2
import javax.inject.Singleton

/**
 * Created by Andras_Nemeth on 2017. 10. 03..
 */
@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent {
    fun networkApi1(): NetworkApi1
    fun networkApi2(): NetworkApi2

    object Get {
        private var component: NetworkComponent? = null
        fun component(): NetworkComponent? {
            if (component == null) {
                component = DaggerNetworkComponent.builder()
                    .networkModule(NetworkModule())
                    .build()
            }
            return component
        }
    }
}
