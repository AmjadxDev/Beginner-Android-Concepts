package com.amjadxdev.beginnerstoadvanced.recyclerviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityRecyclerViewBinding
import com.amjadxdev.beginnerstoadvanced.recyclerviews.adapters.AdapterClass
import com.amjadxdev.beginnerstoadvanced.recyclerviews.data.DataClass

class RecyclerViewActivity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityRecyclerViewBinding.inflate(layoutInflater) }

    private lateinit var dataList: MutableList<DataClass>
    private lateinit var imageList: Array<Int>
    private lateinit var titleList: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)



        dataList = mutableListOf()
        getData()

    }

    private fun getData() {
        imageList = arrayOf(
            R.drawable.ic_list,
            R.drawable.ic_checkbox,
            R.drawable.ic_image,
            R.drawable.ic_toggle,
            R.drawable.ic_date,
            R.drawable.ic_rating,
            R.drawable.ic_time,
            R.drawable.ic_text,
            R.drawable.ic_edit,
            R.drawable.ic_camera
        )
        titleList = arrayOf(
            "ListView",
            "CheckBox",
            "ImageView",
            "Toggle Switch",
            "Date Picker",
            "Rating Bar",
            "Time Picker",
            "TextView",
            "EditText",
            "Camera"
        )

        for (item in imageList.indices) {
            val dataClass = DataClass(imageList[item], titleList[item])
            dataList.add(dataClass)
        }
        viewBinding.apply {
            recyclerView.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = AdapterClass(dataList)
        }

    }
}