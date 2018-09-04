package wasiat.wasiatnahdlatulwathan.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 8/17/18.
 */
class CardAdapterNewWasiat: RecyclerView.Adapter<CardAdapterNewWasiat.ViewHolder> {

    var context: Context
    var dbList: List<DataModel>

    constructor(context: Context, dbList: List<DataModel>) {
        this.context = context
        this.dbList = dbList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_adapter_new_wasiat, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titles!!.setText(dbList.get(position).getTitles())
    }

    override fun getItemCount(): Int {
        return dbList.size
    }

    class ViewHolder: RecyclerView.ViewHolder, View.OnClickListener {

        var thumbs: ImageView? = null
        var titles: TextView? = null

        constructor(view: View): super(view) {
            thumbs = view.findViewById(R.id.thumb)
            titles = view.findViewById(R.id.title)
        }

        override fun onClick(view: View?) {
            Log.d("TAG", "position" + adapterPosition)
        }

    }

}