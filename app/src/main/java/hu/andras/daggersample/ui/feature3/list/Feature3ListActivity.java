package hu.andras.daggersample.ui.feature3.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import hu.andras.daggersample.R;
import hu.andras.daggersample.interactor.Feature3Interactor;

/**
 * Created by Andras Nemeth on 2017-11-26.
 */

public class Feature3ListActivity extends AppCompatActivity {

    @Inject
    Feature3ListPresenter presenter;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1_list);
        getSupportActionBar().setTitle("Feature2ListActivity");
        presenter.setView(this);
    }

    public void display(String feature1Stuff) {
        ((TextView)findViewById(R.id.text)).setText(feature1Stuff);
    }
}
