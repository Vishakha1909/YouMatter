package com.example.youmatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User extends AppCompatActivity {
    public void toregister(View view)
    {
        Button button =  findViewById(R.id.returning);
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }
    public void tologin(View view)
    {
        Button button =  findViewById(R.id.newbutton);
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}