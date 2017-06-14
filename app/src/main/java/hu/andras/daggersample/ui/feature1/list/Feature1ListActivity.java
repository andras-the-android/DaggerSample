package hu.andras.daggersample.ui.feature1.list;

import javax.inject.Inject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import hu.andras.daggersample.R;
import hu.andras.daggersample.di.Feature1ListComponent;


public class Feature1ListActivity extends AppCompatActivity {

    @Inject
    Feature1ListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1_list);
        Feature1ListComponent.Get.component(this).inject(this);
        getSupportActionBar().setTitle("Feature1ListActivity");
        presenter.setView(this);
    }


    public void display(String feature1Stuff) {
        ((TextView)findViewById(R.id.text)).setText(feature1Stuff);
    }
}
