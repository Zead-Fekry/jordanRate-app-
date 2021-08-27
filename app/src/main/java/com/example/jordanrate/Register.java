package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DBHelper DB;
    EditText Name,phone,Email,Password;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name = (EditText) findViewById(R.id.Namee);
        phone=(EditText) findViewById(R.id.Numbeer);
        Email=(EditText) findViewById(R.id.Emaail);
        Password=(EditText) findViewById(R.id.passwordd);
        Register=(Button) findViewById(R.id.button2);
        DB=new DBHelper(this);
    }
    public void onClick(View view) {
        String btn_txt;
        String user=Name.getText().toString();
        String pass=Password.getText().toString();
        String email=Email.getText().toString();
        String number=phone.getText().toString();
        btn_txt = ((Button) view).getText().toString();
        if(user.equals("")||pass.equals("")||email.equals("")||number.equals(""))
            Toast.makeText(Register.this,"please enter all information", Toast.LENGTH_SHORT).show();
        else
        if (btn_txt.equals("Register")) {
            Intent MainActivity = new Intent(this, MainActivity.class);
            startActivity(MainActivity);
        }
    }
}