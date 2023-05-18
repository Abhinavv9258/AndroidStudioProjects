package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ZomatoHomeScreen : AppCompatActivity() {
    lateinit var toolbar:Toolbar
    lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zomato_home_screen)

        toolbar=findViewById(R.id.toolbar)
        // strep 1
        setSupportActionBar(toolbar)

        //step 2
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.round_location_on_24)

        toolbar.setTitle("Home")
        toolbar.setSubtitle("friends market opposite kharar bus..")

        val recyclerView: RecyclerView = findViewById(R.id.recycler)

        // Create a GridLayoutManager with horizontal orientation and 3 columns
        val layoutManager = GridLayoutManager(this, 10, GridLayoutManager.HORIZONTAL, false)

        // Set the layout manager for the RecyclerView
        recyclerView.layoutManager = layoutManager

        // Create and set the adapter for the RecyclerView
//        val adapter = MyAdapter(myDataset)
//        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.appbar_icons, menu)
        return true
    }
}