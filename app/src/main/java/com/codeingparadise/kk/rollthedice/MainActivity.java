package com.codeingparadise.kk.rollthedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDice;
    private ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollDice = (Button)findViewById(R.id.rollDices);
        imageView1 = (ImageView)findViewById(R.id.imageview1);
        imageView2 = (ImageView)findViewById(R.id.imageview2);

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = randomDiceValue();
                int value2 = randomDiceValue();

                int res1 = getResources().getIdentifier("dice" + value1, "drawable","com.codeingparadise.kk.rollthedice");
                int res2 = getResources().getIdentifier("dice" + value2, "drawable", "com.codeingparadise.kk.rollthedice");

                imageView1.setImageResource(res1);
                imageView2.setImageResource(res2);
            }
        });
    }
    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }
}