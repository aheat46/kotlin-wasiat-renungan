package wasiat.wasiatnahdlatulwathan.activity

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.fragment.FragmentBookmark
import wasiat.wasiatnahdlatulwathan.fragment.FragmentNewWasiat
import wasiat.wasiatnahdlatulwathan.fragment.FragmentWasiat
import wasiat.wasiatnahdlatulwathan.helper.BottomNavigationBehavior

class MainActivity : AppCompatActivity(),
        NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {


    lateinit var toolbar: Toolbar
    var actionBar: ActionBar? = null
    var activityAboutOrganitation: AboutOrganitation
    var activityAboutApplication: AboutApplication
    var fragmentWasiat: FragmentWasiat
    var fragmentBookmark: FragmentBookmark
    var fragmentHistory: FragmentNewWasiat

    init {
        this.fragmentWasiat = FragmentWasiat()
        this.fragmentBookmark = FragmentBookmark()
        this.fragmentHistory = FragmentNewWasiat()
        this.activityAboutOrganitation = AboutOrganitation()
        this.activityAboutApplication = AboutApplication()
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()
        initDrawer()
        initNavigation()
        initBottomNavigation()

        loadFragment(fragmentWasiat)

    }

    override fun onBackPressed() {

        val drawer_layout: DrawerLayout = findViewById(R.id.drawer_layout)

        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }

    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_about_org -> {
                loadActivity(activityAboutOrganitation)
            }
            R.id.nav_about -> {
                loadActivity(activityAboutApplication)
            }
            R.id.bott_nav_wasiat -> {
                loadFragment(fragmentWasiat)
            }
            R.id.bott_nav_new_wasiat -> {
                loadFragment(fragmentHistory)
            }
            R.id.bott_nav_bookmark -> {
                loadFragment(fragmentBookmark)
            }
            R.id.bott_nav_about -> {
                loadActivity(activityAboutApplication)
            }
        }

        val drawer_layout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawer_layout.closeDrawer(GravityCompat.START)

        return true
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun initToolbar() {
        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitleTextColor(resources.getColor(R.color.color_white))
        setSupportActionBar(toolbar)

        actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setHomeButtonEnabled(true)

    }

    private fun initDrawer() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val toogle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        drawerLayout.setDrawerListener(toogle)
        toogle.syncState()
    }

    private fun initNavigation() {
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun initBottomNavigation() {
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        val layoutParams: CoordinatorLayout.LayoutParams = bottomNavigation.layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = BottomNavigationBehavior()
    }


    private fun loadFragment(fragment: Fragment) {
        fragmentManager.beginTransaction().replace(R.id.frame_container, fragment)
                .commit()
    }

    private fun loadActivity(activity: Activity) {
        val new_activity = Intent(this@MainActivity, activity::class.java)
        startActivity(new_activity)
    }

}
