package com.example.diceroller;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final Random RANDOM = new Random();
    private final ThreadLocal<Button> rollDices = ThreadLocal.withInitial(() -> (Button) findViewById(R.id.rollDices));
    private ImageView imageView1, imageView2;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        rollDices.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("dice_" + value1, "drawable", "com.example.dicer");
                int res2 = getResources().getIdentifier("dice_" + value2, "drawable", "com.example.dicer");
            }
        }
    }
