package com.sikhismknowledge.sikhismknowledge.gurbani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sikhismknowledge.sikhismknowledge.R;

/**
 * Created by Maruf on 20-May-18.
 */

public class JapjiSahibEnglish extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view);

        textView = findViewById(R.id.text_view);
        textView.setText(R.string.JapjiSahibEnglish);
    }
}
