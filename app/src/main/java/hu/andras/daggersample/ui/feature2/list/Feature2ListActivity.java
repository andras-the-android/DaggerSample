package hu.andras.daggersample.ui.feature2.list;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import hu.andras.daggersample.R;
import hu.andras.daggersample.di.ActivityModule;
import hu.andras.daggersample.di.Feature2Module;
import hu.andras.daggersample.di.InteractorComponent;


public class Feature2ListActivity extends AppCompatActivity {

    @Inject
    Feature2ListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1_list);
        InteractorComponent.Get.component().feature2ListSubcomponent(new Feature2Module(this), new ActivityModule(this)).inject(this);
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
