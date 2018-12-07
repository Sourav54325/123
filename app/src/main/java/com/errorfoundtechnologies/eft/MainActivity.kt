package com.errorfoundtechnologies.eft

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            var i = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(i)
        }
        cd1.setOnClickListener {
            var i = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(i)
        }

    }
}
