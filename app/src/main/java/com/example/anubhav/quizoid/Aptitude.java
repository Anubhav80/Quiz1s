package com.example.anubhav.quizoid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.androidl.quizoid.R;

public class Aptitude extends AppCompatActivity {
    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
  fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.container,new qa1(),"QA1");
        ft.commit();
    }



}
