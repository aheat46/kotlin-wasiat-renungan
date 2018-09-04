package wasiat.wasiatnahdlatulwathan.activity


import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.text.Layout
import android.widget.TextView
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.helper.DBHelper
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 8/18/18.
 */
class DetailActivity: AppCompatActivity() {

    var text_content: TextView? = null

    var toolbar: Toolbar? = null
    var actionBar: ActionBar? = null
    var dbList: List<DataModel>? = null


    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initToolbar()

        val dbHelper = DBHelper(applicationContext)
        dbList = ArrayList()
        dbList = dbHelper.getData()

        text_content = findViewById(R.id.content)

        val position = intent.extras.getInt("position")
        val _content = dbList!!.get(position).getContents()


        text_content!!.setText(_content)


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