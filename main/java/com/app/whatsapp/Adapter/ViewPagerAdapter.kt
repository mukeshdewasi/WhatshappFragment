package com.app.whatsapp.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.whatsapp.Fragment.CallsFragment
import com.app.whatsapp.Fragment.ChatFragment
import com.app.whatsapp.Fragment.StatusFragment

private const val Num_Tabs=3
class ViewPagerAdapter( manager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(manager,lifecycle ) {
    override fun getItemCount(): Int {
        return Num_Tabs
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->ChatFragment()
            1->StatusFragment()
            else ->CallsFragment()
        }
    }
}