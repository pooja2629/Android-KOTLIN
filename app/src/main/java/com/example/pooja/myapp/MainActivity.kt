package com.example.pooja.myapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEditText()
        initButton()
    }

    private fun initButton() {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        findViewById<Button>(R.id.btnLogin).setOnClickListener(View.OnClickListener {

        })
    }

    private fun initEditText() {
     //   TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        findViewById<EditText>(R.id.edtUserName)

    }

}
