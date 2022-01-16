package com.example.davaleba3_nika_svintradzejgufi12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleba3_nika_svintradzejgufi12.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var tabLayout: TabLayout
private lateinit var viewPager2: ViewPager2



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager)
        viewPager2.adapter = ViewPagerFragmentAdapter(this)
        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            tab.text = "Tab ${position + 1}"

        }.attach()
    }
}