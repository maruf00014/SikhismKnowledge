package com.sikhismknowledge.sikhismknowledge.gurbani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sikhismknowledge.sikhismknowledge.R;

public class TavParsaadSavaiyeePunjabi extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view);

        textView = findViewById(R.id.text_view);
        textView.setText(R.string.TavParsaadSavaiyeePunjabi);
    }
}
