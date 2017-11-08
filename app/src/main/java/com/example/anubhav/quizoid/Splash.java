package com.example.anubhav.quizoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidl.quizoid.R;

public class Splash extends AppCompatActivity implements Animation.AnimationListener {
    private ImageView imageView3;
    private ImageView imageView4;

    private Button button1;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView3=(ImageView) findViewById(R.id.imageView3);
        imageView4=(ImageView) findViewById(R.id.imageView4);

        button1=(Button) findViewById(R.id.button1);
        textView=(TextView) findViewById(R.id.textView);


        imageView4.setVisibility(View.GONE);

        button1.setVisibility(View.GONE);
        textView.setVisibility(View.GONE);

        Animation move_fb_logoAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_fb_logo);
        move_fb_logoAnimation.setFillAfter(true);
        move_fb_logoAnimation.setAnimationListener(this);
        imageView3.startAnimation(move_fb_logoAnimation);

    }
    public void play(View v)
    {
        Intent i=new Intent(Splash.this,OpeningActivity.class);
        startActivity(i);
    }
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        imageView4.setAlpha(0f);
        imageView4.setVisibility(View.VISIBLE);

        button1.setAlpha(0f);
        button1.setVisibility(View.VISIBLE);
        textView.setAlpha(0f);
        textView.setVisibility(View.VISIBLE);


        int mediumAnimationTime=getResources().getInteger(android.R.integer.config_mediumAnimTime);


        button1.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);

        textView.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);

        imageView4.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        imageView3.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }


}
