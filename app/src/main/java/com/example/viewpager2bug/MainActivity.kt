package com.example.viewpager2bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.adapter = CardAdapter()
/*        view_pager.clipToPadding = false*/
//        view_pager.setPadding(40, 0, 40, 0)
    }
}
