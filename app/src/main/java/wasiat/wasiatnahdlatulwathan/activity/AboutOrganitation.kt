package wasiat.wasiatnahdlatulwathan.activity

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import wasiat.wasiatnahdlatulwathan.R

/**
 * Created by aheat on 7/3/18.
 */
class AboutOrganitation : AppCompatActivity() {

    var toolbar: Toolbar? = null
    var actionBar: ActionBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_organitation)

        initToolbar()
    }

    private fun initToolbar() {

        toolbar = findViewById(R.id.toolbar)

        toolbar!!.setTitle("Sejarah Nahdlatul Wathan")
        toolbar!!.setTitleTextColor(resources.getColor(R.color.color_white))

        setSupportActionBar(toolbar)

        actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)


    }
}