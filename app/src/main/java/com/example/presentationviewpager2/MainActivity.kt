package com.example.presentationviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager2.adapter = ViewPagerAdapter()
            // viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}

            //  viewPager2.adapter = ViewPagerFragmentStateAdapter(supportFragmentManager)





