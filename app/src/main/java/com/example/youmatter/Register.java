package com.example.youmatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    public void loginagain(View view)
    {
        Toast.makeText(this, "USER CREATED!", Toast.LENGTH_SHORT).show();
        Button button =  findViewById(R.id.regbutton);
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}