package com.amjadxdev.beginnerstoadvanced.listviews

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityListViewBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val listItem = arrayOf("create a project", "learn koltin", "create listview in xml", "create an array", "create adapter")

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, listItem)
        viewBinding.listView.adapter = listAdapter

        viewBinding.listView.setOnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You click item $selectItem", Toast.LENGTH_SHORT).show()
        }
    }
}