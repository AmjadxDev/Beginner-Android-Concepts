package com.amjadxdev.beginnerstoadvanced.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityFragmentBinding.inflate(layoutInflater) }

    private lateinit var fragmentManager: FragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.apply {
            btnFragment1.setOnClickListener {
                gotoFragment(Fragment1())
            }

            btnFragment2.setOnClickListener {
                gotoFragment(Fragment2())
            }
        }

    }

    private fun gotoFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()
    }
}