package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView setstext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setstext=(TextView) findViewById(R.id.textView);
        Intent i=getIntent();



        setstext.setText(new StringBuilder().append("Welcome  ").append(i.getStringExtra("name")).toString());
    }
}