package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newdRecyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.getSupportActionBar()?.hide()

        imageId = arrayOf(
            R.drawable.placeholder,
            R.drawable.book_cover_placeholder,
            R.drawable.placeholder,
            R.drawable.book_cover_placeholder,
            R.drawable.placeholder,
            R.drawable.book_cover_placeholder,
            R.drawable.placeholder,
            R.drawable.book_cover_placeholder,
            R.drawable.placeholder,
            R.drawable.book_cover_placeholder,
            R.drawable.placeholder,
            R.drawable.book_cover_placeholder
        )

        heading = arrayOf(
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image",
            "Image"
        )

        newdRecyclerView = findViewById(R.id.recycler_view)
        newdRecyclerView.layoutManager = LinearLayoutManager(this)
        newdRecyclerView.setHasFixedSize(true)

        newsArrayList = arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {
        for (i in imageId.indices){
            val news = News(imageId[i],heading[i])
            newsArrayList.add(news)
        }
        newdRecyclerView.adapter = MyAdapter(newsArrayList)
    }
}