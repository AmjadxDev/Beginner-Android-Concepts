package com.amjadxdev.beginnerstoadvanced.spinners

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivitySpinnerBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

//        step 1 create a list
        val listItem = listOf("Chocolate", "Strawberry", "Vanilla", "Orange", "Apple", "Banana", "Pineapple", "Mango", "Lemon")

//        step 2 create an adapter
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listItem)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        viewBinding.spinner.adapter = spinnerAdapter
        
        viewBinding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@SpinnerActivity, "You select ${parent?.getItemAtPosition(position)}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



    }
}