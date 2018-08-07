package wasiat.wasiatnahdlatulwathan.fragment

import android.app.Fragment
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import wasiat.wasiatnahdlatulwathan.R

/**
 * Created by aheat on 8/4/18.
 */
class FragmentWasiat: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.listview_wasiat, container, false)

        return view
    }

}