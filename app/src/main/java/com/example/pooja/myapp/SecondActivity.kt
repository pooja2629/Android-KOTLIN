package com.example.pooja.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //txt TextView : findViewById<TextView>(R.id.txtInfo).text = "Welcome"
    }
}
