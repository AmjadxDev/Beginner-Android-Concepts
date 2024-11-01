package com.amjadxdev.beginnerstoadvanced.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.amjadxdev.beginnerstoadvanced.R
import com.amjadxdev.beginnerstoadvanced.databinding.ActivityViewPager2Binding
import com.amjadxdev.beginnerstoadvanced.databinding.ItemLayoutViewpager2Binding

class ViewPager2Activity : AppCompatActivity() {
    private val viewBinding by lazy { ActivityViewPager2Binding.inflate(layoutInflater) }

//    step 1: declare all the variable
    private lateinit var viewPager2 : ViewPager2
    private lateinit var viewPager2Adapter : ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

//        step 3: set view pager adapter

        viewPager2Adapter = ViewPagerAdapter()
        viewPager2 = viewBinding.viewPager2
        viewPager2.adapter = viewPager2Adapter

    }
}


//      Step:2 Create a viewPager Adapter class

class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.ViewPager2ViewHolder>() {
    private val itemList = listOf("Item 1", "Item 2", "Item 3")

    inner class ViewPager2ViewHolder(val binding : ItemLayoutViewpager2Binding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPager2ViewHolder {
        val view = ItemLayoutViewpager2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPager2ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewPager2ViewHolder, position: Int) {
        holder.binding.pagerLayoutText.text = itemList[position]
    }
}