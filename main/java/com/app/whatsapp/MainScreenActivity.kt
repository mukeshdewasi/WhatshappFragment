package com.app.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.app.whatsapp.Adapter.ViewPagerAdapter
import com.app.whatsapp.databinding.ActivityMainScreenBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainScreenActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainScreenBinding
    var tittleArray= arrayOf("Chats", "Status","Calls")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


        val tabadapter=ViewPagerAdapter(supportFragmentManager,lifecycle)
        binding.viewPager.adapter=tabadapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager){ tab,position ->
            tab.text =tittleArray[position]
        }.attach()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.newgroup->{
                true
            }R.id.newbroadcast->{
                true
            }R.id.linkdevice->{
                true
            }R.id.starredmessage->{
                true
            }R.id.payments->{
                true
            }R.id.settings->{
                true
            }R.id.search->{
                true
            }R.id.camera->{
                true
            }else->super.onOptionsItemSelected(item)
            }
    }
}