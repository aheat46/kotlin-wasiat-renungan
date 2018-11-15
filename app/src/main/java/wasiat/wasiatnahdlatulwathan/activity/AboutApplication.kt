package wasiat.wasiatnahdlatulwathan.activity

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import wasiat.wasiatnahdlatulwathan.R

/**
 * Created by aheat on 9/5/18.
 */

class AboutApplication: AppCompatActivity() {

    var toolbar: Toolbar? = null
    var actionBar: ActionBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_application)

        initToolbar()
    }

    private fun initToolbar() {

        val toolbar: Toolbar = findViewById(R.id.toolbar)

        toolbar.setTitle("Tentang Aplikasi")
        toolbar.setTitleTextColor(resources.getColor(R.color.color_white))

        setSupportActionBar(toolbar)

        actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)


    }

}