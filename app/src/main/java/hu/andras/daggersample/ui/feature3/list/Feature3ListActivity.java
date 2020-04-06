package hu.andras.daggersample.ui.feature3.list;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import hu.andras.daggersample.R;

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
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onButtonClick();
            }
        });
    }

    public void display(String feature1Stuff) {
        ((TextView)findViewById(R.id.text)).setText(feature1Stuff);
    }
}
