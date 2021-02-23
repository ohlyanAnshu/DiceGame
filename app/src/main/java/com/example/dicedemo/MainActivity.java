package com.example.dicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView playerDice = findViewById(R.id.user);
        final ImageView computerDice = findViewById(R.id.computer);
        Button HigherButton = findViewById(R.id.higher);
        Button LowerButton = findViewById(R.id.lower);

        final TextView result = findViewById(R.id.result);

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        HigherButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Random rand = new Random();
               int playerD = rand.nextInt(6);
               int computerD = rand.nextInt(6);

               playerDice.setImageResource(diceArray[playerD]);
               computerDice.setImageResource(diceArray[computerD]);

               if(playerD > computerD){
                    result.setText(getResources().getString(R.string.user));
               }

               else if(playerD < computerD){
                   result.setText(getResources().getString(R.string.comp));
               }

               else{
                   result.setText(getResources().getString(R.string.tie));
               }

           }
       });

        LowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int playerD = rand.nextInt(6);
                int computerD = rand.nextInt(6);

                playerDice.setImageResource(diceArray[playerD]);
                computerDice.setImageResource(diceArray[computerD]);

                if(playerD < computerD){
                    result.setText(getResources().getString(R.string.user));
                }

                else if(playerD > computerD){
                    result.setText(getResources().getString(R.string.comp));
                }

                else{
                    result.setText(getResources().getString(R.string.tie));
                }



            }
        });
    }



}
