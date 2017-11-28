package hu.andras.daggersample.ui.common;

import android.content.Context;
import android.content.Intent;

import javax.inject.Inject;
import javax.inject.Named;

import hu.andras.daggersample.di.scopes.ActivityScope;
import hu.andras.daggersample.ui.feature1.detail.Feature1DetailActivity;
import hu.andras.daggersample.ui.feature2.detail.Feature2DetailActivity;
import hu.andras.daggersample.ui.feature3.detail.Feature3DetailActivity;


/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */

public class Navigator {

    private Context context;

    @Inject
    public Navigator( Context context) {
        this.context = context;
    }

    public void goToFeature1DetailScreen() {
        context.startActivity(new Intent(context, Feature1DetailActivity.class));
    }

    public void goToFeature2DetailScreen() {
        context.startActivity(new Intent(context, Feature2DetailActivity.class));
    }

    public void goToFeature3DetailScreen() {
        context.startActivity(new Intent(context, Feature3DetailActivity.class));
    }
}
