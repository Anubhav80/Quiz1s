package com.example.anubhav.quizoid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.androidl.quizoid.MainActivity;
import com.example.androidl.quizoid.R;

public class OpeningActivity extends AppCompatActivity  {
FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.middle,new Loginfs(),"TAG_FS");
        ft.addToBackStack("first");
        ft.commit();
    }
    public void faculty(View v)
    {
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.replace(R.id.middle,new Loginf(),"TAG_F");
        ft.addToBackStack("second");
        ft.commit();
    }
    public void student(View v)
    {
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.replace(R.id.middle,new Logins(),"TAG_S");
        ft.addToBackStack("third");
        ft.commit();
    }

    public void slogin(View v)
    {
        Intent i=new Intent(OpeningActivity.this,Options.class);
        startActivity(i);
    }

    /*@Override
    public void com(String as, String ds) {
             Toast.makeText(getApplicationContext(),"Str 1 "+as,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Str 1 "+ds,Toast.LENGTH_LONG).show();
    }*/
}
