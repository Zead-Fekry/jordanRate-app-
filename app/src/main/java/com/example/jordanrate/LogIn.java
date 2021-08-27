package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    EditText email , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword2);


    }
    public void onClick(View view) {
        String btn_txt;
        btn_txt = ((Button) view).getText().toString();
        if (btn_txt.equals("LogIn")) {
            if(email.getText().toString().trim().isEmpty() || password.getText().toString().trim().isEmpty()) {
                Toast.makeText(LogIn.this, " please inter your data ", Toast.LENGTH_SHORT).show();
            }
            else {
                if(email.getText().toString().trim().equals(getIntent().getStringExtra("email")) && password.getText().toString().trim().equals(getIntent().getStringExtra("password"))) {
                    Intent allshoes = new Intent(this, allShoes.class);
                    startActivity(allshoes);
                }
                else {
                    Toast.makeText(LogIn.this, " invalid data pleas try again", Toast.LENGTH_SHORT).show();
                    password.setText("");
                }
            }
        }
    }
}