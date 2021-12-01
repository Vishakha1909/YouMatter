package com.example.youmatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public void tomain(View view)
    {
        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
        Button button =  findViewById(R.id.loginbutton);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}