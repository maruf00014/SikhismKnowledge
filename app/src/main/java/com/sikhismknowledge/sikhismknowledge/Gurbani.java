package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gurbani extends AppCompatActivity {
    Button alarmButton,JapjiSahibPunjabi,ShabadHazaarePunjabi,JaapSahibPunjabi,TavParsaadSavaiyeePunjabi,
            AnandSahibPunjabi,RehraasSahibPunjabi,KirtanSohilaPunjabi,BarahmaahaPunjabi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurbani);

        alarmButton = findViewById(R.id.alarmButton);
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
                startActivity(i);


            }
        });

        JapjiSahibPunjabi = findViewById(R.id.JapjiSahibPunjabi);
        JapjiSahibPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.JapjiSahibPunjabi.class);
                startActivity(i);


            }
        });

        ShabadHazaarePunjabi = findViewById(R.id.ShabadHazaarePunjabi);
        ShabadHazaarePunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.ShabadHazaarePunjabi.class);
                startActivity(i);


            }
        });

        JaapSahibPunjabi = findViewById(R.id.JaapSahibPunjabi);
        JaapSahibPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.JaapSahibPunjabi.class);
                startActivity(i);


            }
        });

        TavParsaadSavaiyeePunjabi = findViewById(R.id.TavParsaadSavaiyeePunjabi);
        TavParsaadSavaiyeePunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.TavParsaadSavaiyeePunjabi.class);
                startActivity(i);


            }
        });

        RehraasSahibPunjabi = findViewById(R.id.RehraasSahibPunjabi);
        RehraasSahibPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.RehraasSahibPunjabi.class);
                startActivity(i);


            }
        });

        RehraasSahibPunjabi = findViewById(R.id.RehraasSahibPunjabi);
        RehraasSahibPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.RehraasSahibPunjabi.class);
                startActivity(i);


            }
        });

        KirtanSohilaPunjabi = findViewById(R.id.KirtanSohilaPunjabi);
        KirtanSohilaPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.KirtanSohilaPunjabi.class);
                startActivity(i);


            }
        });

        BarahmaahaPunjabi = findViewById(R.id.BarahmaahaPunjabi);
        BarahmaahaPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.BarahmaahaPunjabi.class);
                startActivity(i);


            }
        });
        AnandSahibPunjabi = findViewById(R.id.AnandSahibPunjabi);
        AnandSahibPunjabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.AnandSahibPunjabi.class);
                startActivity(i);


            }
        });
    }
}
