package hu.andras.daggersample.ui.feature1.detail;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import hu.andras.daggersample.R;
import hu.andras.daggersample.di.Feature1DetailComponent;
import hu.andras.daggersample.interactor.Feature1Interactor;

public class Feature1DetailActivity extends AppCompatActivity {

    @Inject
    Feature1Interactor interactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1_list);
        Feature1DetailComponent.Get.component(this).inject(this);
        getSupportActionBar().setTitle("Feature2DetailActivity");
        ((TextView)findViewById(R.id.text)).setText(interactor.getFeature1Stuff());
    }
}
