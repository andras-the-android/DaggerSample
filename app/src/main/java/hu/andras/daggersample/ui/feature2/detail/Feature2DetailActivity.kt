package hu.andras.daggersample.ui.feature2.detail

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import hu.andras.daggersample.R
import hu.andras.daggersample.di.InteractorComponent
import hu.andras.daggersample.interactor.Feature2Interactor

class Feature2DetailActivity : AppCompatActivity() {
    var interactor: Feature2Interactor? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1_list)
        interactor = InteractorComponent.Get.component.feature2Interactor()
        supportActionBar!!.title = "Feature2DetailActivity"
        (findViewById<View>(R.id.text) as TextView).text = interactor?.feature2Stuff
        findViewById<View>(R.id.button).visibility = View.GONE
    }
}
