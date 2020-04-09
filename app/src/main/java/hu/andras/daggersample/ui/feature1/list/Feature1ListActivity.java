package hu.andras.daggersample.ui.feature1.list;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

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
        getSupportActionBar().setTitle("Feature2ListActivity");
        presenter.setView(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.goToDetail();
            }
        });
    }


    public void display(String feature1Stuff) {
        ((TextView)findViewById(R.id.text)).setText(feature1Stuff);
    }
}
