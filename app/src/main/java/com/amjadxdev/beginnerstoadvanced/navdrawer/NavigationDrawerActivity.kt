package com.amjadxdev.beginnerstoadvanced.navdrawer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityNavigationDrawerBinding
import com.amjadxdev.beginnerstoadvanced.navdrawer.fragments.AboutFragment
import com.amjadxdev.beginnerstoadvanced.navdrawer.fragments.HomeFragment
import com.amjadxdev.beginnerstoadvanced.navdrawer.fragments.SettingsFragment
import com.amjadxdev.beginnerstoadvanced.navdrawer.fragments.ShareFragment
import com.google.android.material.navigation.NavigationView

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private val viewBinding by lazy { ActivityNavigationDrawerBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this@NavigationDrawerActivity)

        val toggle = ActionBarDrawerToggle(this@NavigationDrawerActivity , viewBinding.drawerLayout, viewBinding.toolbar,  R.string.open_nav, R.string.close_nav)

        viewBinding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null) {
            replaceFragment(HomeFragment())
            viewBinding.navView.setCheckedItem(R.id.nav_home)

        }

    }


    override fun onBackPressed() {
        if (viewBinding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_home -> replaceFragment(HomeFragment())
            R.id.nav_settings -> replaceFragment(SettingsFragment())
            R.id.nav_share -> replaceFragment(ShareFragment())
            R.id.nav_about -> replaceFragment(AboutFragment())
            R.id.nav_logout -> Toast.makeText(
                this@NavigationDrawerActivity,
                "Successfully Logout...",
                Toast.LENGTH_SHORT
            ).show()
        }
        viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    fun replaceFragment(fragment: Fragment) {
        val transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}