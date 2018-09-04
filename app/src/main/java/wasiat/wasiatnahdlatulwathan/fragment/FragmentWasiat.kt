package wasiat.wasiatnahdlatulwathan.fragment

import android.app.Fragment
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import wasiat.wasiatnahdlatulwathan.adapter.CardAdapterWasiat
import wasiat.wasiatnahdlatulwathan.helper.DBHelper
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 8/4/18.
 */
class FragmentWasiat: Fragment() {

    var linearLayout: LinearLayoutManager? = null
    var adapter: CardAdapterWasiat? = null
    var dbHelper: DBHelper? = null
    var dbList: List<DataModel>? = null
    var recyClerview: RecyclerView? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dbHelper = DBHelper(context)
        dbList = ArrayList()
        dbList = dbHelper!!.getData()

        linearLayout = LinearLayoutManager(context)
        recyClerview = RecyclerView(context)

        adapter = CardAdapterWasiat(context, dbList!!)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        recyClerview!!.setLayoutManager(linearLayout)
        recyClerview!!.adapter = adapter

        return recyClerview
    }


}