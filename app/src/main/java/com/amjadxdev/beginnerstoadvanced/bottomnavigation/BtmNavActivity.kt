package com.amjadxdev.beginnerstoadvanced.bottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.bottomnavigation.fagments.AddFragment
import com.amjadxdev.beginnerstoadvanced.bottomnavigation.fagments.ReelFragment
import com.amjadxdev.beginnerstoadvanced.bottomnavigation.fagments.SearchFragment
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityBtmNavBinding
import com.amjadxdev.beginnerstoadvanced.navdrawer.fragments.HomeFragment

class BtmNavActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityBtmNavBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)


        viewBinding.bottomNavView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.bottom_add -> {
                    replaceFragment(AddFragment())
                    true

                }

                R.id.bottom_reel -> {
                    replaceFragment(ReelFragment())
                    true
                }

                R.id.bottom_search -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.bottom_profile -> {
                    Toast.makeText(
                        this@BtmNavActivity,
                        "Logout profile",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }
                else -> false
            }

        }

        replaceFragment(HomeFragment())

    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }
    }
}