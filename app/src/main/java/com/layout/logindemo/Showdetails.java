package com.layout.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Showdetails extends AppCompatActivity {
    private TextView username;
    private TextView email;
    private TextView mobileno;
    private TextView age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails);
        username = (TextView)findViewById(R.id.un);
        email   = (TextView)findViewById(R.id.em);
        mobileno = (TextView)findViewById(R.id.mn);
        age = (TextView)findViewById(R.id.ag);


        // create the get Intent object
        Intent intent3 = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String uname = intent3.getStringExtra("username");
        String ema = intent3.getStringExtra("email");
        String mno = intent3.getStringExtra("mobno");
        String age1 = intent3.getStringExtra("age");

//        int number=Integer.parseInt(age1);

        // display the string into textView
        username.setText(uname);
        email.setText(ema);
        mobileno.setText(mno);
        age.setText(age1);



    }
}