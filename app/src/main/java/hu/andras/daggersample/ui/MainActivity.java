package hu.andras.daggersample.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import hu.andras.daggersample.R;
import hu.andras.daggersample.ui.feature1.list.Feature1ListActivity;
import hu.andras.daggersample.ui.feature2.list.Feature2ListActivity;
import hu.andras.daggersample.ui.feature3.list.Feature3ListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startComponentDependency(View view) {
        startActivity(new Intent(this, Feature1ListActivity.class));
    }

    public void startSubcomponent(View view) {
        startActivity(new Intent(this, Feature2ListActivity.class));
    }

    public void startAndroidInjection(View view) {
        startActivity(new Intent(this, Feature3ListActivity.class));
    }
}
