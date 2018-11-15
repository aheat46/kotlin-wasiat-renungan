package wasiat.wasiatnahdlatulwathan.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.activity.DetailActivity
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 8/17/18.
 */
class ListViewAdapterBookmark: BaseAdapter {


    val activity: Activity
    var title: TextView? = null

    val dbList: List<DataModel>


    constructor(activity: Activity, dbList: List<DataModel>) {
        this.activity = activity
        this.dbList = dbList
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        if (convertView == null) {
            convertView = LayoutInflater.from(activity).inflate(R.layout.item_list_bookmark, parent, false)
        }

        title = convertView!!.findViewById(R.id.title)

        title!!.setText(dbList.get(position).getTitles())
        val _id = dbList.get(position).getId()

        convertView.setOnClickListener { openDetailActivity(_id) }


        return convertView
    }

    override fun getItem(position: Int): Any {
        return dbList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return dbList.size
    }

    private fun openDetailActivity(position: Int) {
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("position", position)
        activity.startActivity(intent)
    }

}