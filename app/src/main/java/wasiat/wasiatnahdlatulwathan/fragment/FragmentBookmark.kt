package wasiat.wasiatnahdlatulwathan.fragment


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.adapter.ListViewAdapterBookmark
import wasiat.wasiatnahdlatulwathan.helper.DBHelper
import wasiat.wasiatnahdlatulwathan.model.DataModel

/**
 * Created by aheat on 7/22/18.
 */
class FragmentBookmark: Fragment() {

    var listView: ListView? = null
    var adapter: ListViewAdapterBookmark? = null
    var dbHelper: DBHelper? = null
    var list: List<DataModel> = ArrayList<DataModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.listview_bookmark, container, false)

        dbHelper = DBHelper(activity)
        list = dbHelper!!.getBookmark()

        listView = view.findViewById(R.id.list_item)
        adapter = ListViewAdapterBookmark(activity, list)

        listView!!.adapter = adapter

        return view
    }
}