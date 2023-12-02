package hu.andras.daggersample.interactor;

import hu.andras.daggersample.network.NetworkApi1;

/**
 * Created by Andras Nemeth on 2017. 06. 14..
 */

public class Feature2Interactor {

    private NetworkApi1 networkApi1;

    public Feature2Interactor(NetworkApi1 networkApi1) {
        this.networkApi1 = networkApi1;
        System.out.println("ddd Feature2Interactor created " + this);
    }

    public String getFeature2Stuff() {
        return "##" + networkApi1.getRequest() + "feature2 interactor: " + this + "##";
    }
}
