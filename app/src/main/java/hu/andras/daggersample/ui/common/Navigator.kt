package hu.andras.daggersample.ui.common

import android.content.Context
import android.content.Intent
import hu.andras.daggersample.ui.feature1.detail.Feature1DetailActivity
import hu.andras.daggersample.ui.feature2.detail.Feature2DetailActivity

/**
 * Created by Andras Nemeth on 2017. 06. 04..
 */
class Navigator(private val context: Context) {
    fun goToFeature1DetailScreen() {
        context.startActivity(Intent(context, Feature1DetailActivity::class.java))
    }

    fun goToFeature2DetailScreen() {
        context.startActivity(Intent(context, Feature2DetailActivity::class.java))
    }
}
