package com.example.anubhav.quizoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.androidl.quizoid.MainActivity;
import com.example.androidl.quizoid.R;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
    public void cpro(View v)
    {
        Intent i=new Intent(Options.this, MainActivity.class);
        startActivity(i);
    }
    public void apro(View v)
    {
        Intent i=new Intent(Options.this,Aptitude.class);
        startActivity(i);
    }
}
