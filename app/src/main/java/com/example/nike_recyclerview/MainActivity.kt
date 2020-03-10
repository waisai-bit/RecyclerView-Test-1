package com.example.nike_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nike_recyclerview.Adapter.BootAdapter
import com.example.nike_recyclerview.Model.Boot
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bootArray = ArrayList<Boot>()
        bootArray.add(Boot("0001","Nike Superfly 6", "Elite FG", "$799", R.drawable.boot1))
        bootArray.add(Boot("0002","Nike Superfly 6", "Elite FG", "$799", R.drawable.boot1))

        bootArray.add(Boot("0003","Nike Superfly 6", "Elite FG", "$799", R.drawable.boot1))
        bootArray.add(Boot("0004","Nike Superfly 6", "Elite FG", "$799", R.drawable.boot1))

        bootArray.add(Boot("0005","Nike Superfly 6", "Elite FG", "$799", R.drawable.boot1))
        bootArray.add(Boot("0006","Nike Superfly 6", "Elite FG", "$799", R.drawable.boot1))


        var bootAdapter = BootAdapter(bootArray)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = bootAdapter
    }
}
