package com.example.davaleba3_nika_svintradzejgufi12.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba3_nika_svintradzejgufi12.fragments.FirstFragment
import com.example.davaleba3_nika_svintradzejgufi12.fragments.SecondFragment
import com.example.davaleba3_nika_svintradzejgufi12.fragments.ThirdFragment

class ViewPagerFragmentAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return FirstFragment()
        }
        return ThirdFragment()
    }

}