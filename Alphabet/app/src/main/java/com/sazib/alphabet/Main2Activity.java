package com.sazib.alphabet;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    Typeface tf1, tf2, tf3;

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

        btn1 = (Button) findViewById(R.id.alphabet);
        btn2 = (Button) findViewById(R.id.math);
        btn3 = (Button) findViewById(R.id.picture);

        tf1 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        tf2 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");
        tf3 = Typeface.createFromAsset(getAssets(), "fonts/solaimanlipinormal.ttf");

        btn1.setTypeface(tf1);
        btn2.setTypeface(tf2);
        btn3.setTypeface(tf3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });
    }
}
