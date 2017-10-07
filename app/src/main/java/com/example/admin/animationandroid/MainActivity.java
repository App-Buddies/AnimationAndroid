package com.example.admin.animationandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button animationButton;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationButton = findViewById(R.id.animationButton);

    }

    public void alphaanimation(View view) {
        animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animationButton.startAnimation(animation);
    }

    public void scaleanimation(View view) {
        animation = AnimationUtils.loadAnimation(this, R.anim.scale);
        animationButton.startAnimation(animation);
    }

    public void transalteanimation(View view) {
        animation = AnimationUtils.loadAnimation(this, R.anim.trans);
        animationButton.startAnimation(animation);

    }

    public void rotateanimaton(View view) {
        animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animationButton.startAnimation(animation);
    }

}
