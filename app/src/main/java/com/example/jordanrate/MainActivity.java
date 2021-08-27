package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DB=new DBHelper(this);
    }
    public void onClick(View view){
        String btn_txt;
        btn_txt=((Button)view).getText().toString();
        if(btn_txt.equals("LogIn"))
        {
            Intent login = new Intent(this,LogIn.class);
            startActivity(login);
        }
        else if(btn_txt.equals("Register"))
        {
            Intent register = new Intent(this,Register.class);
            startActivity(register);
        }

    }
}
