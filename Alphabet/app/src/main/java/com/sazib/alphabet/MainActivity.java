package com.sazib.alphabet;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnNext, btnBack, btnHome;

    Typeface tf;

    ImageView imageViewSmall, imageViewBig;
    private int currentImage = 0;
    int[] images = { R.drawable.b_1, R.drawable.b_2, R.drawable.b_3, R.drawable.b_4, R.drawable.b_5,
            R.drawable.b_6, R.drawable.b_7, R.drawable.b_8, R.drawable.b_9, R.drawable.b_10, R.drawable.b_11,
            R.drawable.b_12, R.drawable.b_12, R.drawable.b_13, R.drawable.b_14, R.drawable.b_15, R.drawable.b_16,
            R.drawable.b_17, R.drawable.b_18, R.drawable.b_19,R.drawable.b_20, R.drawable.b_21, R.drawable.b_22,
            R.drawable.b_23, R.drawable.b_24, R.drawable.b_25, R.drawable.b_26, R.drawable.b_27, R.drawable.b_27,
            R.drawable.b_28, R.drawable.b_29, R.drawable.b_30, R.drawable.b_30, R.drawable.b_31, R.drawable.b_32,
            R.drawable.b_33, R.drawable.b_34, R.drawable.b_35, R.drawable.b_36, R.drawable.b_37, R.drawable.b_38,
            R.drawable.b_39, R.drawable.b_40, R.drawable.b_41, R.drawable.b_41, R.drawable.b_42, R.drawable.b_43,
            R.drawable.b_44, R.drawable.b_45, R.drawable.b_46, R.drawable.b_47, R.drawable.b_48, R.drawable.b_49,
            R.drawable.b_50 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBack = (Button) findViewById(R.id.btn_next);
        btnHome = (Button) findViewById(R.id.btn_home);
        btnNext = (Button) findViewById(R.id.btn_back);

        tf = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");

        btnNext.setTypeface(tf);
        btnHome.setTypeface(tf);
        btnBack.setTypeface(tf);

        imageViewSmall = (ImageView) findViewById(R.id.image_small_alpha);
        imageViewBig = (ImageView) findViewById(R.id.image_big_alpha);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentImage--;
                currentImage = (currentImage + images.length) % images.length;
                imageViewBig.setImageResource(images[currentImage]);
                imageViewSmall.setImageResource(images[currentImage]);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentImage++;
                currentImage = currentImage % images.length;
                imageViewBig.setImageResource(images[currentImage]);
                imageViewSmall.setImageResource(images[currentImage]);

            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                finish();
            }
        });
    }
}
