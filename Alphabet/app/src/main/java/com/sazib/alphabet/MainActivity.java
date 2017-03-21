package com.sazib.alphabet;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    String[] itemname ={
            "Alphabet",
            "Camera",
            "Global",
            "FireFox"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.listview,
                R.id.Itemname,itemname));
    }
}
