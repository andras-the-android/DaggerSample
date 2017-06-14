package hu.andras.daggersample.ui.feature2.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import hu.andras.daggersample.R;
import hu.andras.daggersample.di.InteractorComponent;
import hu.andras.daggersample.interactor.Feature2Interactor;

public class Feature2DetailActivity extends AppCompatActivity {

    Feature2Interactor interactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1_list);
        interactor = InteractorComponent.Get.component().feature2Interactor();
        getSupportActionBar().setTitle("Feature2DetailActivity");
        ((TextView)findViewById(R.id.text)).setText(interactor.getFeature2Stuff());
    }
}
