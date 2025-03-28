package com.example.newsapp

import Category
import News
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.Adapter.CategoryAdapter
import com.example.newsapp.Adapter.ImageSliderAdapter
import com.example.newsapp.Adapter.NewsAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help)
        this.enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.helpCenter)) { v: View, insets: WindowInsetsCompat ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        HelpCenter
        val answerText = findViewById<TextView>(R.id.answerText)
        val toggleButton = findViewById<ImageView>(R.id.toggleButton)

        toggleButton.setOnClickListener {
            if (answerText.visibility == View.VISIBLE) {
                answerText.visibility = View.GONE
                toggleButton.setImageResource(R.drawable.down_arrow)
            } else {
                answerText.visibility = View.VISIBLE
            }
        }

//        Category
//        val categories = listOf(
//            Category("Technology", R.drawable.news1),
//            Category("Sports", R.drawable.news2),
//            Category("Health", R.drawable.news3),
//        )
//        val gridView = findViewById<GridView>(R.id.categoriesGridView)
//        gridView.adapter = CategoryAdapter(this, categories)


//        MainScreen
//        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
//        val images = listOf(
//            R.drawable.news1,
//            R.drawable.news2
//        )
//        val titles = listOf(
//            "Let’s settle the debate: IOS vs Androidz Consumer verdict",
//            "Let’s settle the debate: IOS vs Androidz Consumer verdict"
//        )
//        val categories = listOf(
//            "Sport",
//            "Technology"
//        )
//        val adapterSlider = ImageSliderAdapter(images, titles, categories)
//        viewPager.adapter = adapterSlider
//
//        val newsListView = findViewById<ListView>(R.id.newsListView)
//        val newsList = listOf(
//            News("Technology", "IOS vs Android Consumer verdict", "Sun 9 March, 2025", R.drawable.news3),
//            News("Sports", "Latest match highlights: Epic showdown", "Mon 10 March, 2025", R.drawable.news3),
//            News("Health", "The benefits of a balanced diet", "Tue 11 March, 2025", R.drawable.news3),
//            News("Law", "New legal regulations coming soon", "Wed 12 March, 2025", R.drawable.news3)
//        )
//        val adapterNews = NewsAdapter(this, newsList)
//        newsListView.adapter = adapterNews
    }
}
