package com.example.youmatter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void tospeech(View view)
    {
        Button button =  findViewById(R.id.speechbutton);
        Intent intent = new Intent(this,SpeechToText.class);
        startActivity(intent);
    }
    public void toar(View view)
    {
        Button button =  findViewById(R.id.arbutton);
        Intent intent = new Intent(this,ARScreen.class);
        startActivity(intent);
    }
    public void tohand(View view)
    {
        Button button =  findViewById(R.id.handbutton);
        Intent intent = new Intent(this,HandGesture.class);
        startActivity(intent);
    }public void tochat(View view)
    {
        Button button =  findViewById(R.id.chatbotbutton);
        Intent intent = new Intent(this,Symphony.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}