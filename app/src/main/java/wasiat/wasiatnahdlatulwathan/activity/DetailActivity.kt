package wasiat.wasiatnahdlatulwathan.activity


import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.Layout
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.helper.DBHelper
import wasiat.wasiatnahdlatulwathan.model.DataModel
import java.lang.reflect.Array

/**
 * Created by aheat on 8/18/18.
 */
class DetailActivity: AppCompatActivity() {

    var text_content: TextView? = null
    var action_bookmark: ImageView? = null

    var toolbar: Toolbar? = null
    var actionBar: ActionBar? = null
    var dbList: List<DataModel>? = null


    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initToolbar()

        val dbHelper = DBHelper(applicationContext)
        dbList = dbHelper.getData()

        text_content = findViewById(R.id.content)
        action_bookmark = findViewById(R.id.action_bookmark)

        val position = intent.extras.getInt("position")

        val _id = dbList!!.get(position).getId()
        val _content = dbList!!.get(position).getContents()
        val _status = dbList!!.get(position).getStatus()

        val content = _content.replace(",", "\n")

        if (_status == 1) {
            action_bookmark!!.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ic_action_star_rated))
        } else {
            action_bookmark!!.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ic_action_star_outline_white))
        }

        action_bookmark!!.setOnClickListener {

            if (_status == 1) {
                Log.d("TAG", "ini di ubah ke false")
                dbHelper.removeBookmark(_id)
                action_bookmark!!.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ic_action_star_outline_white))

            } else {
                Log.d("TAG", "ini di ubah ke true")
                dbHelper.addBookmark(_id)
                action_bookmark!!.setImageDrawable(ContextCompat.getDrawable(applicationContext, R.drawable.ic_action_star_rated))
            }

        }

        text_content!!.setText(content)


    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun initToolbar() {
        toolbar = findViewById(R.id.toolbar)
        toolbar!!.background = null
        setSupportActionBar(toolbar)

        actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setHomeButtonEnabled(true)
        actionBar!!.setDisplayShowTitleEnabled(false)

    }


}