package com.layout.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class showdetails1 extends AppCompatActivity {
    private TextView username;
    private TextView email;
    private TextView mobileno;
    private TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails1);
        username = (TextView)findViewById(R.id.un1);
        email   = (TextView)findViewById(R.id.em1);
        mobileno = (TextView)findViewById(R.id.mn1);
        age = (TextView)findViewById(R.id.ag1);


        // create the get Intent object

        Bundle b= getIntent().getExtras();
        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String uname = b.getString("username");
        String ema = b.getString("email");
        String mno = b.getString("mobno");
        String age1 =b.getString("age");

        String str = b.getString("message_key");
        String str1 = b.getString("message_key1");



        // display the string into textView
        username.setText(uname);
        email.setText(ema);
        mobileno.setText(mno);
        age.setText(age1);
    }
}