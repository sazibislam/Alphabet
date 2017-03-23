package com.sazib.alphabet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

            int[] imagesA = { R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5,
            R.drawable.s6, R.drawable.s7, R.drawable.s8, R.drawable.s9, R.drawable.s10, R.drawable.s11,
            R.drawable.s12, R.drawable.s13,  R.drawable.s15, R.drawable.s18,
            R.drawable.s19,  R.drawable.s20, R.drawable.s21, R.drawable.s22, R.drawable.s70 };
        String [] name = {"কলা", "ইদুর","গরু", " কাক", "তলোয়ার", "আম", "হাতি", " গাছ", "তরমুজ", "গাড়ি","গোলাপ",
        "ঘোড়া", "চাঁদ", "ঘড়ি", "জাহাজ", "ডিম", "মাছ", "পাখি", "হাস", "ছাতা"};


    }
}
