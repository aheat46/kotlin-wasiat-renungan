package wasiat.wasiatnahdlatulwathan.adapter

import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CursorAdapter
import android.widget.ImageView
import android.widget.TextView
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.activity.DetailActivity
import wasiat.wasiatnahdlatulwathan.helper.DBHelper
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 8/17/18.
 */
class CardAdapterWasiat : RecyclerView.Adapter<CardAdapterWasiat.ViewHolder> {

    val context: Context
    val dbList: List<DataModel>


    constructor(context: Context, dbList: List<DataModel>) {
        this.context = context
        this.dbList = dbList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_adapter_wasiat, parent, false)
        return ViewHolder(context, view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dbHelper = DBHelper(context)

        val status = dbHelper.checkBookmark(position)

        holder.titles.setText(dbList.get(position).getTitles())

        if (status == 1) {
            holder.check_bookmark.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_action_star_rated))
        } else {
            holder.check_bookmark.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_action_star_outline))
        }


    }

    override fun getItemCount(): Int {
        return dbList.size
    }

    class ViewHolder: RecyclerView.ViewHolder, View.OnClickListener{

        var thumbs: ImageView
        var titles: TextView
        var check_bookmark: ImageView
        var context: Context

        constructor(context: Context, view: View): super(view) {

            thumbs = view.findViewById(R.id.thumb)
            titles = view.findViewById(R.id.title)
            check_bookmark = view.findViewById(R.id.check_bookmark)
            this.context = context

            check_bookmark.setOnClickListener {

                val dbHelper = DBHelper(context)

                val status = dbHelper.checkBookmark(adapterPosition)

                if (status == 1) {
                    Log.d("TAG", "ini di ubah ke false")
                    dbHelper.removeBookmark(adapterPosition)
                    check_bookmark.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_action_star_outline))
                } else {
                    Log.d("TAG", "ini diubah ke true")
                    dbHelper.addBookmark(adapterPosition)
                    check_bookmark.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_action_star_rated))
                }


            }

            view.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            val data = adapterPosition
            openDetailActivity(data)
        }

        fun openDetailActivity(position: Int){
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("position", position)
            context.startActivity(intent)
        }

    }



}