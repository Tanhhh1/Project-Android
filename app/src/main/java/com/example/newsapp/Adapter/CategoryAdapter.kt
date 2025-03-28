package com.example.newsapp.Adapter

import Category
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.R

class CategoryAdapter(private val context: Context, private val categories: List<Category>) : BaseAdapter() {

    override fun getCount(): Int = categories.size

    override fun getItem(position: Int): Any = categories[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_category, parent, false)

        val category = categories[position]
        val categoryImage = view.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = view.findViewById<TextView>(R.id.categoryName)

        categoryImage.setImageResource(category.imageResId)
        categoryName.text = category.name

        return view
    }
}
