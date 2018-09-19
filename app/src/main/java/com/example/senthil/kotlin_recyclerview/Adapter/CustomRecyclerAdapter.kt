package com.example.senthil.kotlin_recyclerview.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.senthil.kotlin_recyclerview.Model.AndroidVersionModel
import com.example.senthil.kotlin_recyclerview.R

class CustomRecyclerAdapter(val context : Context, val androidVersionList: ArrayList<AndroidVersionModel>) : RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.txtTitle?.text = androidVersionList[p1].codeName
        p0?.txtContent?.text = "Version : ${androidVersionList[p1].versionName}, Api Name : ${androidVersionList[p1].apiLevel}"
        p0?.image.setImageResource(androidVersionList[p1].imgResId!!)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.recycler_view_item, p0, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return androidVersionList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle = itemView.findViewById<TextView>(R.id.appOSTitle_txtVw)
        val txtContent = itemView.findViewById<TextView>(R.id.appOSDetails_txtVw)
        val image = itemView.findViewById<ImageView>(R.id.appOS_imageVw)
    }
}