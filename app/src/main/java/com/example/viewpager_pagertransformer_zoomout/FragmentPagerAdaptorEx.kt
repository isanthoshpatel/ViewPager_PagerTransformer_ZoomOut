package com.example.viewpager_pagertransformer_zoomout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPagerAdaptorEx(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment:Fragment? = null
        when(position){
            0 -> fragment = BlankFragment()
            1 -> fragment = BlankFragment2()
            2 -> fragment = BlankFragment3()
        }
        return  fragment!!
    }

    override fun getCount(): Int {

        return 3
    }
}