package com.layout.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.content.SharedPreferences;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Details extends AppCompatActivity {
    private EditText email;
    private EditText mobno;
    private EditText age;
    private Button intbased;
private Button bunbased;
private Button sharbased;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        email = (EditText) findViewById(R.id.email);
        mobno = (EditText) findViewById(R.id.mobno);
        age = (EditText) findViewById(R.id.age);
        intbased = (Button) findViewById(R.id.intentbased);
        intbased.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              String  em = String.valueOf(email.getText());
               String mn = String.valueOf(mobno.getText());
                String ag=String.valueOf(age.getText());
                Intent intent2=new Intent(getApplicationContext(), Showdetails.class);
                intent2.putExtra("email",  em);
                intent2.putExtra("mobno",  mn);
                intent2.putExtra("age",ag);
                String un=getIntent().getStringExtra("username");
                intent2.putExtra("username",un);
startActivity(intent2);
            }
        });
        bunbased = (Button) findViewById(R.id.bundledbased);
        bunbased.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String  em = String.valueOf(email.getText());
                String mn = String.valueOf(mobno.getText());
                String ag=String.valueOf(age.getText());
                Intent intent3=new Intent(getApplicationContext(), showdetails1.class);
                Bundle b=new Bundle();
                b.putString("email",  em);
                b.putString("mobno",  mn);
                b.putString("age",ag);
                String un=getIntent().getStringExtra("username");
                b.putString("username",un);
                intent3.putExtras(b);
                startActivity(intent3);
            }
        });
//        sharbased = (Button) findViewById(R.id.bundledbased);
//        sharbased.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                String  em = String.valueOf(email.getText());
//                String mn = String.valueOf(mobno.getText());
//                String ag=String.valueOf(age.getText());
//                Intent intent2=new Intent(getApplicationContext(), Showdetails.class);
//                SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
//                SharedPreferences.Editor myEdit = sharedPreferences.edit();
//                myEdit.putString("email",  em);
//                myEdit.putExtra("mobno",  mn);
//                intent2.putExtra("age",ag);
//                String un=getIntent().getStringExtra("username");
//                intent2.putExtra("username",un);
//                startActivity(intent2);
//            }
//        });
    }

}