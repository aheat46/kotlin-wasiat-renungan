package wasiat.wasiatnahdlatulwathan.fragment

import android.annotation.SuppressLint
import android.app.Fragment
import android.app.SearchManager
import android.content.Context
import android.database.Cursor
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.util.Log
import android.view.*
import wasiat.wasiatnahdlatulwathan.R

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
    var searchView: SearchView? = null
    val querTextListener: SearchView.OnQueryTextListener? = null


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setHasOptionsMenu(true)
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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
        val searchItem: MenuItem = menu.findItem(R.id.action_search)
        val searchManager: SearchManager = activity.getSystemService(Context.SEARCH_SERVICE) as SearchManager

        if (searchItem != null) {
            searchView = searchItem.actionView as SearchView
        }


        searchView!!.setOnQueryTextListener(object: SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            @RequiresApi(Build.VERSION_CODES.M)
            override fun onQueryTextChange(newText: String): Boolean {

                getDataListByKeywoard(newText)
                return false
            }


        })

        searchView!!.setOnCloseListener(object: SearchView.OnCloseListener{

            override fun onClose(): Boolean {
                return false
            }

        })

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_search -> {
                return false
            }
        }

        searchView!!.setOnQueryTextListener(querTextListener)

        return super.onOptionsItemSelected(item)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun getDataListByKeywoard(search: String) {

        val modelList: MutableList<DataModel> = mutableListOf()
        dbHelper = DBHelper(context)
        dbHelper!!.openDB()

        val cursor: Cursor = dbHelper!!.dataRetreive(search)


        if (cursor.moveToFirst()) {
            do {
                val model = DataModel()
                model.setId(cursor.getInt(0))
                model.setTitles(cursor.getString(1))
                modelList.add(model)
            }while (cursor.moveToNext())
        }

        adapter = CardAdapterWasiat(context, modelList)
        dbHelper!!.closeDB()
        recyClerview!!.adapter = adapter
    }

}