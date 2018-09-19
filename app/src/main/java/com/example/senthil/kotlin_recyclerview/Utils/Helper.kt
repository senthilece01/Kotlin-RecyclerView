package com.example.senthil.kotlin_recyclerview.Utils

import com.example.senthil.kotlin_recyclerview.Model.AndroidVersionModel
import com.example.senthil.kotlin_recyclerview.R

class Helper{
    companion object {
        fun <ArrayList> getVersionsList(): ArrayList {
            var androidVersionList = ArrayList<AndroidVersionModel>()
            androidVersionList.add(AndroidVersionModel(R.drawable.cupcake, "Cupcake", "1.5", apiLevel = "3"))
            androidVersionList.add(AndroidVersionModel(R.drawable.donut, "Donut", "1.6", apiLevel = "4"))
            androidVersionList.add(AndroidVersionModel(R.drawable.eclair, "Eclair", "2.0 - 2.1", apiLevel = "5 - 7"))
            androidVersionList.add(AndroidVersionModel(R.drawable.froyo, "Froyo", "2.2 - 2.2.3", apiLevel = "8"))
            androidVersionList.add(AndroidVersionModel(R.drawable.ginger_bread, "Gingerbread", "2.3 - 2.3.7", apiLevel = "9 - 10"))
            androidVersionList.add(AndroidVersionModel(R.drawable.honeycomb, "Honeycomb", "3.0 - 3.2.6", apiLevel = "11 - 13"))
            androidVersionList.add(AndroidVersionModel(R.drawable.ice_cream_sandwich, "Ice Cream Sandwich", "4.0 - 4.0.4", apiLevel = "14 - 15"))
            androidVersionList.add(AndroidVersionModel(R.drawable.jelly_bean, "Jelly Bean", "4.1 - 4.3.1", apiLevel = "16 - 18"))
            androidVersionList.add(AndroidVersionModel(R.drawable.kitkat, "KitKat", "4.4 - 4.4.4", apiLevel = "19 - 20"))
            androidVersionList.add(AndroidVersionModel(R.drawable.lollipop, "Lollipop", "5.0 - 5.1.1", apiLevel = "21 - 22"))
            androidVersionList.add(AndroidVersionModel(R.drawable.marshmallow, "Marshmallow", "6.0 - 6.0.1", apiLevel = "23"))
            androidVersionList.add(AndroidVersionModel(R.drawable.nougat, "Nougat", "7.0 - 7.1.2", apiLevel = "24 - 25"))
            androidVersionList.add(AndroidVersionModel(R.drawable.oreo, "Oreo", "8.0 - 8.1", apiLevel = "26 - 27"))
            androidVersionList.add(AndroidVersionModel(R.drawable.pie, "pie", "9.0", apiLevel = "28"))

            return androidVersionList as ArrayList
        }
    }
}