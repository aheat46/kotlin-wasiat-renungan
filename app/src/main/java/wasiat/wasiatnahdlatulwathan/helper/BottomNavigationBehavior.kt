package wasiat.wasiatnahdlatulwathan.helper

import android.content.Context
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.CoordinatorLayout
import android.support.v4.view.ViewCompat
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout

/**
 * Created by aheat on 8/25/18.
 */
class BottomNavigationBehavior : CoordinatorLayout.Behavior<BottomNavigationView> {

    constructor() {
    }


    override fun layoutDependsOn(parent: CoordinatorLayout?, child: BottomNavigationView?, dependency: View?): Boolean {
        return super.layoutDependsOn(parent, child, dependency)
    }

    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: BottomNavigationView, directTargetChild: View, target: View, axes: Int): Boolean {
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL
    }

    override fun onNestedPreScroll(coordinatorLayout: CoordinatorLayout, child: BottomNavigationView, target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        if (dy < 0 ) {
            showBottomNavigation(child)
        } else if (dy > 0) {
            hideBottomNavigation(child)
        }
    }

    private fun hideBottomNavigation(view: BottomNavigationView) {
        view.clearAnimation()
        view.animate().translationY(view.height.toFloat())
    }

    private fun showBottomNavigation(view: BottomNavigationView) {
        view.clearAnimation()
        view.animate().translationY(0F)
    }

}