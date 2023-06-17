package com.app.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread({
            try {
            Thread.sleep(3000)
            var intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }).start()
    }
}