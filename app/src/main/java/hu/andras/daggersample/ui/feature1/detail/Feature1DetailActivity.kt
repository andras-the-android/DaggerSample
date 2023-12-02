package hu.andras.daggersample.ui.feature1.detail

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import hu.andras.daggersample.R
import hu.andras.daggersample.di.Feature1DetailComponent
import hu.andras.daggersample.interactor.Feature1Interactor
import javax.inject.Inject

class Feature1DetailActivity : AppCompatActivity() {
    @JvmField
    @Inject
    var interactor: Feature1Interactor? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1_list)
        Feature1DetailComponent.Get.component(this).inject(this)
        supportActionBar!!.title = "Feature2DetailActivity"
        (findViewById<View>(R.id.text) as TextView).text = interactor?.feature1Stuff
        findViewById<View>(R.id.button).visibility = View.GONE
    }
}
