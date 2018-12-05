package com.errorfoundtechnologies.eft

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_splash_screen_activity.*
import java.util.*

class splash_screen_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timer().schedule(object :TimerTask(){
            override fun run() {
                var i =Intent(this@splash_screen_activity,MainActivity::class.java)
                startActivity(i)
                finish() 

            }               
        },100L)


    }

}


