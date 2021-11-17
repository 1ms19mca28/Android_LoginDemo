package com.layout.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class showdetails2 extends AppCompatActivity {
    private TextView username;
    private TextView email;
    private TextView mobileno;
    private TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails2);
        username = (TextView)findViewById(R.id.un2);
        email   = (TextView)findViewById(R.id.em2);
        mobileno = (TextView)findViewById(R.id.mn2);
        age = (TextView)findViewById(R.id.ag2);


        // create the get Intent object
        SharedPreferences b = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String uname = b.getString("username","");
        String ema = b.getString("email","");
        String mno = b.getString("mobno","");
        String age1 =b.getString("age","");


        // display the string into textView
        username.setText(uname);
        email.setText(ema);
        mobileno.setText(mno);
        age.setText(age1);

    }
}