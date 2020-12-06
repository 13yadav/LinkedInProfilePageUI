package com.strangecoder.linkedinprofilepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.strangecoder.linkedinprofilepage.databinding.ActivityMainBinding
import com.strangecoder.linkedinprofilepage.fragments.AboutFragment
import com.strangecoder.linkedinprofilepage.fragments.HomeFragment
import com.strangecoder.linkedinprofilepage.fragments.JobsFragment
import com.strangecoder.linkedinprofilepage.fragments.PeopleFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewPager = binding.viewPager
        setupViewPager(viewPager)

        val tabLayout = binding.tabLayout
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun setupViewPager(viewPager: ViewPager){
        val adapter = MyAdapter(this, supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(AboutFragment(), "About")
        adapter.addFragment(JobsFragment(), "Jobs")
        adapter.addFragment(PeopleFragment(), "People")
        viewPager.adapter = adapter
    }


    fun onButtonClick(view: View) {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}