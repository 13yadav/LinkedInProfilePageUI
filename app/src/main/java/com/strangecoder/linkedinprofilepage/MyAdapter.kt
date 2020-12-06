package com.strangecoder.linkedinprofilepage

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(private val context: Context, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {

    private var fragmentTitleList = ArrayList<String>()
    private var fragmentList = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment, fragmentTitle: String){
        fragmentList.add(fragment)
        fragmentTitleList.add(fragmentTitle)
    }
}