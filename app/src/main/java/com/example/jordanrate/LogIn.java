package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    DBHelper DB;
    EditText username, Password;
    Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        username = (EditText) findViewById(R.id.UserName);
        Password = (EditText) findViewById(R.id.PassWord);
        DB = new DBHelper(this);
    }
    public void onClick(View view){
        String btn_txt;
        String user = username.getText().toString();
        String pass=Password.getText().toString();
        btn_txt = ((Button) view).getText().toString();
        if(user.equals("") || pass.equals(""))
            Toast.makeText(LogIn.this, "please enter your information", Toast.LENGTH_SHORT).show();
        else{
            Boolean checkuserpass=DB.checkusernamepassword(user,pass);
            if (checkuserpass==true){
                if (btn_txt.equals("LogIn"))
                {
                    Intent allShoes=new Intent(this, allShoes.class);
                    startActivity(allShoes);
                }
            }
            else{
                Toast.makeText(LogIn.this, "invalid information", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
