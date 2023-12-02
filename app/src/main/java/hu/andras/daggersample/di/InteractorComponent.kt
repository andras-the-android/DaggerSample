package hu.andras.daggersample.di

import dagger.Component
import hu.andras.daggersample.di.scopes.IteractorScope
import hu.andras.daggersample.interactor.Feature1Interactor
import hu.andras.daggersample.interactor.Feature2Interactor

/**
 * Created by Andras_Nemeth on 2017. 06. 14..
 */
@IteractorScope
@Component(dependencies = [NetworkComponent::class], modules = [InteractorModule::class])
interface InteractorComponent {
    //Need to expose for the other components which depend on this
    fun feature1Interactor(): Feature1Interactor

    //subcomponent automatically can inject everything the parent's modules can,
    //so this is not necessary for the inheritence. Only Feature2DetailActivity uses directly.
    fun feature2Interactor(): Feature2Interactor
    fun feature2ListSubcomponent(feature2Module: Feature2Module?, activityModule: ActivityModule?): Feature2ListSubcomponent

    object Get {
        val component: InteractorComponent = run {
            DaggerInteractorComponent.builder()
                .networkComponent(NetworkComponent.Get.component())
                .interactorModule(InteractorModule())
                .build()
        }
    }
}
