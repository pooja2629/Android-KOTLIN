package com.example.pooja.myapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Pooja on 18-12-2017.
 */

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String username = getIntent().getStringExtra("username");
       ((TextView) findViewById(R.id.txtInfo)).setText("Welcome " + username);
    }
}
