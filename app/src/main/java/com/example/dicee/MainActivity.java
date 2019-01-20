package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button)findViewById(R.id.RollButton);
        final ImageView leftdice = (ImageView)findViewById(R.id.left_dice);
        final ImageView rightdice = (ImageView)findViewById(R.id.right_dice);
        final int[] diceArray = {
                R.drawable.dice1 ,
                R.drawable.dice2 ,
                R.drawable.dice3 ,
                R.drawable.dice4 ,
                R.drawable.dice5 ,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","You have pressed the Roll button");
                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(6);
                Log.d("Dicee", "The random munber is: "+number);
                leftdice.setImageResource(diceArray[number]);
                number = randomnumbergenerator.nextInt(6);
                rightdice.setImageResource(diceArray[number]);
            }
        });



    }
}
