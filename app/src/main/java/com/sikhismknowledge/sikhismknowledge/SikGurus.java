package com.sikhismknowledge.sikhismknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import com.sikhismknowledge.sikhismknowledge.R;

public class SikGurus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sik_gurus);

        TextView guruText1 = findViewById(R.id.guruText);
        guruText1.setText(Html.fromHtml(getString(R.string.gurus)));


    }
}
