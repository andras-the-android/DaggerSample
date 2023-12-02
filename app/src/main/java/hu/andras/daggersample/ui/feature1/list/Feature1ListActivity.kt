package hu.andras.daggersample.ui.feature1.list

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import hu.andras.daggersample.R
import hu.andras.daggersample.di.Feature1ListComponent
import javax.inject.Inject

class Feature1ListActivity : AppCompatActivity() {
    @JvmField
    @Inject
    var presenter: Feature1ListPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1_list)
        Feature1ListComponent.Get.component(this)?.inject(this)
        supportActionBar!!.title = "Feature2ListActivity"
        presenter!!.setView(this)
        findViewById<View>(R.id.button).setOnClickListener { presenter!!.goToDetail() }
    }

    fun display(feature1Stuff: String?) {
        (findViewById<View>(R.id.text) as TextView).text = feature1Stuff
    }
}
