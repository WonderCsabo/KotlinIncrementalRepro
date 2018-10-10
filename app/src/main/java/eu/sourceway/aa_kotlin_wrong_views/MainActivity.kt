package eu.sourceway.aa_kotlin_wrong_views

import android.support.v7.app.AppCompatActivity
import org.androidannotations.annotations.Click
import org.androidannotations.annotations.EActivity

@EActivity(R.layout.activity_main)
open class MainActivity : AppCompatActivity() {

    @Click(R.id.view1)
    fun click1() {
    }

    @Click(R.id.view2)
    fun click2() {
    }

    @Click(R.id.view3)
    fun click3() {
        System.err.println()
    }
}
