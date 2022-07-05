package com.example.rollthedice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView icon,logo;
    Animation top_anim, bottom_anim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top_anim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom_anim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        icon = findViewById(R.id.icon); //dice icon
        logo = findViewById(R.id.logo); //app name

        //put animations to views
        logo.setAnimation(top_anim);
        icon.setAnimation(bottom_anim);
        Intent intent= new Intent(this,Game.class);

        //redirect with delay
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            // Do something after 3s = 3000ms
            startActivity(intent);
            this.finish();
        }, 3000);



    }
}