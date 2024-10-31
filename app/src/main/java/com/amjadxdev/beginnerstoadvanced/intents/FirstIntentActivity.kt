package com.amjadxdev.beginnerstoadvanced.intents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityFirstIntentBinding

class FirstIntentActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityFirstIntentBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        // explicit intent
        viewBinding.explicitButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondIntentActivity::class.java)
            startActivity(explicitIntent)
        }

//        implicit intent
        viewBinding.implicitButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/amjadxdev/"))
            startActivity(implicitIntent)
        }


    }
}