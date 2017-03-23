package com.sazib.alphabet;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnAlpha, btnMath, btnImageLearning;

    Typeface tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        SpannableString s = new SpannableString("বর্ণমালা");
//        s.setSpan(new TypefaceSpan(this, "fonts/solaimanlipinormal.ttf"), 0, s.length(),
//                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        // Update the action bar title with the TypefaceSpan instance
//        android.app.ActionBar actionBar = getActionBar();
//        actionBar.setTitle(s);

        btnAlpha = (Button) findViewById(R.id.alphabet);
        btnMath = (Button) findViewById(R.id.math);
        btnImageLearning = (Button) findViewById(R.id.picture);

        tf = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");

        btnImageLearning.setTypeface(tf);
        btnImageLearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, PicActivity.class));
                finish();
            }
        });

        btnAlpha.setTypeface(tf);
        btnMath.setTypeface(tf);
        btnImageLearning.setTypeface(tf);

        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, QuestionActivity.class));
                finish();
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
                finish();
            }
        });
    }
}
