package hu.andras.daggersample.ui.common;

import android.content.Context;
import android.content.Intent;

import hu.andras.daggersample.ui.feature1.detail.Feature1DetailActivity;


/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */

public class Navigator {

    private Context context;

    public Navigator(Context context) {
        this.context = context;
    }

    public void goToFeature1DetailScreen() {
        context.startActivity(new Intent(context, Feature1DetailActivity.class));
    }
}
