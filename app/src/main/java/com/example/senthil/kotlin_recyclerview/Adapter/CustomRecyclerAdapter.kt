package com.example.senthil.kotlin_recyclerview.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.senthil.kotlin_recyclerview.Model.ListViewModel
import com.example.senthil.kotlin_recyclerview.R

class CustomRecyclerAdapter(val context : Context, val userList: ArrayList<ListViewModel>) : RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.txtTitle?.text = userList[p1].title
        p0?.txtContent?.text = userList[p1].content
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.recycler_view_item, p0, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        val txtContent = itemView.findViewById<TextView>(R.id.tvContent)
    }
}