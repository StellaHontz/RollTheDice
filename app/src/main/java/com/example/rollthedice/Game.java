package com.example.rollthedice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game extends AppCompatActivity {

    ImageView dice1,dice2;
    CardView button;
    List<Integer> dice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        dice1= findViewById(R.id.dice1);
        dice2= findViewById(R.id.dice2);
        button= findViewById(R.id.button);

        dice= new ArrayList<>();
        for(int i=1;i<=6;i++){
            dice.add(getResources().getIdentifier("dice"+i,"drawable",getPackageName()));
        }

        button.setOnClickListener(v->{
            dice1.setImageResource(dice.get(new Random().nextInt(dice.size())));
            dice2.setImageResource(dice.get(new Random().nextInt(dice.size())));
        });
    }


}