package com.example.newsapp.Adapter

import News
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.R

class NewsAdapter(private val context: Context, private val newsList: List<News>) : BaseAdapter() {

    override fun getCount(): Int = newsList.size

    override fun getItem(position: Int): Any = newsList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_news, parent, false)

        val newsImage = view.findViewById<ImageView>(R.id.newsImage)
        val newsCategory = view.findViewById<TextView>(R.id.newsCategory)
        val newsTitle = view.findViewById<TextView>(R.id.newsTitle)
        val newsDate = view.findViewById<TextView>(R.id.newsDate)

        val newsItem = newsList[position]

        newsImage.setImageResource(newsItem.imageResId)
        newsCategory.text = newsItem.category
        newsTitle.text = newsItem.title
        newsDate.text = newsItem.date

        return view
    }
}
