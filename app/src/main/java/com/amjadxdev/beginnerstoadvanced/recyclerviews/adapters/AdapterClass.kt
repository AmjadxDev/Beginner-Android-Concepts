package com.amjadxdev.beginnerstoadvanced.recyclerviews.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.amjadxdev.beginnerstoadvanced.databinding.ItemLayoutRecyclerviewBinding
import com.amjadxdev.beginnerstoadvanced.recyclerviews.data.DataClass

class AdapterClass(private val dataList : List<DataClass>) :
RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    inner class ViewHolderClass(val binding : ItemLayoutRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val view = ItemLayoutRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolderClass(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val getDataList = dataList[position]
        holder.binding.apply {
            image.setImageResource(getDataList.dataImage)
            title.text = getDataList.dataTitle
        }
    }
}