package com.example.senthil.kotlin_recyclerview.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.example.senthil.kotlin_recyclerview.Adapter.CustomRecyclerAdapter
import com.example.senthil.kotlin_recyclerview.R
import com.example.senthil.kotlin_recyclerview.Utils.Helper

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val rvRecyclerView = findViewById<RecyclerView>(R.id.sample_recyclerView)

        rvRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        var adapter = CustomRecyclerAdapter(this, Helper.Companion.getVersionsList())
        rvRecyclerView.adapter = adapter
    }
}
