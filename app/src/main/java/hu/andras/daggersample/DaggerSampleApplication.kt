package hu.andras.daggersample;

import android.app.Application;


public class DaggerSampleApplication extends Application {

    private static DaggerSampleApplication instance;

    public static DaggerSampleApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

}
