package hu.andras.daggersample.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import hu.andras.daggersample.R
import hu.andras.daggersample.ui.feature1.list.Feature1ListActivity
import hu.andras.daggersample.ui.feature2.list.Feature2ListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startComponentDependency(view: View?) {
        startActivity(Intent(this, Feature1ListActivity::class.java))
    }

    fun startSubcomponent(view: View?) {
        startActivity(Intent(this, Feature2ListActivity::class.java))
    }
}
