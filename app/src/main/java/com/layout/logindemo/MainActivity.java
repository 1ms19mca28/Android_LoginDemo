package com.layout.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private EditText un;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText) findViewById(R.id.username);
        pass=(EditText) findViewById(R.id.password);
        login =(Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String username= String.valueOf(un.getText());
                String password=String.valueOf(pass.getText());
                if(username.equals("admin") && password.equals("admin")){
                    Intent intent1=new Intent(getApplicationContext(), MainActivity2.class);
                    intent1.putExtra("username",username);
                    startActivity(intent1);
                }else
                {
                    unsActivity();
                    un.setText("");
                    pass.setText("");
                    un.requestFocus();
                }

            }
        });
    }

    public void unsActivity(){
        Toast.makeText(this, "Login incorrect, Try again!!", Toast.LENGTH_SHORT).show();

    }
}