package com.example.viewpager_pagertransformer_zoomout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.setPageTransformer(true,ZoomOutPageTransformer())
        viewpager.adapter = FragmentPagerAdaptorEx(supportFragmentManager)


    }

    override fun onBackPressed() {
        if (viewpager.currentItem == 0){
            super.onBackPressed()
        }
        else{
            viewpager.currentItem = viewpager.currentItem-1
        }
    }
}
