package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoldenTemple extends AppCompatActivity {
    Button ArtandArchitecture,Maryada,Jalau,MaharajaRanjitSingh,AkalTakhtSahib,
            BerBabaBuddhaJi,Kaulsar,DukhbhanjaniBeri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golden_temple);




        ArtandArchitecture = findViewById(R.id.ArtandArchitecture);
        ArtandArchitecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this,com.sikhismknowledge.sikhismknowledge.goldenTemple.ArtandArchitecture.class);
                startActivity(intent);
            }
        });

        Maryada = findViewById(R.id.Maryada);
        Maryada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this, com.sikhismknowledge.sikhismknowledge.goldenTemple.Maryada.class);
                startActivity(intent);
            }
        });

        Jalau = findViewById(R.id.Jalau);
        Jalau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this, com.sikhismknowledge.sikhismknowledge.goldenTemple.Jalau.class);
                startActivity(intent);
            }
        });

        MaharajaRanjitSingh = findViewById(R.id.MaharajaRanjitSingh);
        MaharajaRanjitSingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this, com.sikhismknowledge.sikhismknowledge.goldenTemple.MaharajaRanjitSingh.class);
                startActivity(intent);
            }
        });

        AkalTakhtSahib = findViewById(R.id.AkalTakhtSahib);
        AkalTakhtSahib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this, com.sikhismknowledge.sikhismknowledge.goldenTemple.AkalTakhtSahib.class);
                startActivity(intent);
            }
        });



        BerBabaBuddhaJi = findViewById(R.id.BerBabaBuddhaJi);
        BerBabaBuddhaJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this,com.sikhismknowledge.sikhismknowledge.goldenTemple.BerBabaBuddhaJi.class);
                startActivity(intent);
            }
        });

        Kaulsar = findViewById(R.id.Kaulsar);
        Kaulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this,com.sikhismknowledge.sikhismknowledge.goldenTemple.Kaulsar.class);
                startActivity(intent);
            }
        });

        DukhbhanjaniBeri = findViewById(R.id.DukhbhanjaniBeri);
        DukhbhanjaniBeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoldenTemple.this,com.sikhismknowledge.sikhismknowledge.goldenTemple.DukhbhanjaniBeri.class);
                startActivity(intent);
            }
        });



    }
}
