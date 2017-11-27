package hu.andras.daggersample.network;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */
@Singleton
public class NetworkApi3 {

    @Inject
    public NetworkApi3() {
    }

    public String getRequest() {
        return "**from network api3**";
    }
}
