package com.amjadxdev.beginnerstoadvanced.intents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.amjadxdev.beginnerstoadvanced.databinding.ActivitySecondIntentBinding

class SecondIntentActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivitySecondIntentBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

    }
}