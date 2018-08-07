package wasiat.wasiatnahdlatulwathan.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import wasiat.wasiatnahdlatulwathan.R


/**
 * Created by aheat on 7/22/18.
 */
class FragmentHistory: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.listview_history, container, false)

        return view
    }

}