package hu.andras.daggersample.interactor;

import javax.inject.Inject;
import javax.inject.Singleton;

import hu.andras.daggersample.network.NetworkApi3;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */
@Singleton
public class Feature3Interactor {

    private NetworkApi3 networkApi;

    @Inject
    public Feature3Interactor(NetworkApi3 networkApi3) {
        this.networkApi = networkApi3;
        System.out.println("ddd Feature2Interactor created " + this);
    }

    public String getFeature3Stuff() {
        return "##" + networkApi.getRequest() + "feature2 interactor: " + this + "##";
    }
}
