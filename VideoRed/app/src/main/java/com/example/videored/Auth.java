package com.example.videored;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Auth extends Activity {
    private EditText login;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth);
        login=(EditText) findViewById(R.id.editTextLogin);
        password=(EditText) findViewById(R.id.editTextPassword);
    }

    public void enter_OnClick(View view) {
        if (login.getText().toString().equals("user")&&password.getText().toString().equals("12345"))
        {
            Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this, Menu.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Неправильный логин или пароль!",Toast.LENGTH_SHORT).show();
        }
    }
}