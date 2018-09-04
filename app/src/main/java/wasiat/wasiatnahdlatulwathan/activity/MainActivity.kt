package wasiat.wasiatnahdlatulwathan.activity

import android.app.Activity
import android.app.Fragment
import android.app.SearchManager
import android.content.Context
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
import android.support.v7.widget.SearchView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import wasiat.wasiatnahdlatulwathan.R
import wasiat.wasiatnahdlatulwathan.fragment.FragmentBookmark
import wasiat.wasiatnahdlatulwathan.fragment.FragmentNewWasiat
import wasiat.wasiatnahdlatulwathan.fragment.FragmentWasiat
import wasiat.wasiatnahdlatulwathan.helper.BottomNavigationBehavior

class MainActivity : AppCompatActivity(),
        NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {


    lateinit var toolbar: Toolbar
    var actionBar: ActionBar? = null
    var activitySettings: SettingsActivity
    var activityAbout: AboutActivity
    var fragmentWasiat: FragmentWasiat
    var fragmentBookmark: FragmentBookmark
    var fragmentHistory: FragmentNewWasiat


    init {
        this.activitySettings = SettingsActivity()
        this.fragmentWasiat = FragmentWasiat()
        this.fragmentBookmark = FragmentBookmark()
        this.fragmentHistory = FragmentNewWasiat()
        this.activityAbout = AboutActivity()
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.toolbar_menu, menu)
        val searchItem: MenuItem = menu.findItem(R.id.action_search)

        val searchManager: SearchManager = this@MainActivity.getSystemService(Context.SEARCH_SERVICE) as SearchManager

        var searchView: SearchView? = null

        if (true) {
            searchView = searchItem.actionView as SearchView
        }

        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(this@MainActivity.componentName))
        }

        return super.onCreateOptionsMenu(menu)
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
            R.id.nav_home -> {
                loadFragment(fragmentWasiat)
            }
            R.id.nav_settings -> {
                loadActivity(activitySettings)
            }
            R.id.nav_about -> {
                loadActivity(activityAbout)
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
                loadActivity(activityAbout)
            }
        }

        val drawer_layout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawer_layout.closeDrawer(GravityCompat.START)

        return true
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun initToolbar() {
        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitleTextColor(resources.getColor(R.color.color_white))
        setSupportActionBar(toolbar)

        actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setHomeButtonEnabled(true)

    }

    fun initDrawer() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val toogle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        drawerLayout.setDrawerListener(toogle)
        toogle.syncState()
    }

    fun initNavigation() {
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    fun initBottomNavigation() {
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        val layoutParams: CoordinatorLayout.LayoutParams = bottomNavigation.layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = BottomNavigationBehavior()
    }


    fun loadFragment(fragment: Fragment) {
        fragmentManager.beginTransaction().replace(R.id.frame_container, fragment)
                .commit()
    }

    fun loadActivity(activity: Activity) {
        val new_activity = Intent(this@MainActivity, activity::class.java)
        startActivity(new_activity)
    }



}
