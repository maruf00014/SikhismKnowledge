package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.sikhismknowledge.sikhismknowledge.SikHistory.Other;
import com.sikhismknowledge.sikhismknowledge.SikHistory.SikGurus;


public class SikhHistory extends AppCompatActivity {



    Button SikhGurus,Piare,WaddeSahibzaade,ChhoteSahibzaade,SikhismGlossary,
            other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikh_history);



        SikhGurus = findViewById(R.id.SikhGurus);
        SikhGurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,com.sikhismknowledge.sikhismknowledge.SikHistory.SikGurus.class);
                startActivity(intent);
            }
        });

        Piare = findViewById(R.id.Piare);
        Piare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this, com.sikhismknowledge.sikhismknowledge.SikHistory.Piare.class);
                startActivity(intent);
            }
        });

        WaddeSahibzaade = findViewById(R.id.WaddeSahibzaade);
        WaddeSahibzaade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this, com.sikhismknowledge.sikhismknowledge.SikHistory.WaddeSahibzaade.class);
                startActivity(intent);
            }
        });

        ChhoteSahibzaade = findViewById(R.id.ChhoteSahibzaade);
        ChhoteSahibzaade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this, com.sikhismknowledge.sikhismknowledge.SikHistory.ChhoteSahibzaade.class);
                startActivity(intent);
            }
        });

        SikhismGlossary = findViewById(R.id.SikhismGlossary);
        SikhismGlossary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this, com.sikhismknowledge.sikhismknowledge.SikHistory.SikhismGlossary.class);
                startActivity(intent);
            }
        });



        other = findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,Other.class);
                startActivity(intent);
            }
        });

    }

}






