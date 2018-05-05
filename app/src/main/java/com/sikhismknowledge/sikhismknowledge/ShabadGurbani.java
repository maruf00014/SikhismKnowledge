package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShabadGurbani extends AppCompatActivity {
    Button satnam,kab,har,jhiva,tumere,tum,taati,tumwith,jogia,bahut,
    meriPatia,naamBina,kirpa,harJio,karKirpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shabad_gurbani);
        meriPatia = findViewById(R.id.MeriPatia);
        meriPatia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://sikhismknowledge.com/shabad_gurbani/meri_patia.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

       naamBina = findViewById(R.id.NaamBina);
       naamBina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://sikhismknowledge.com/shabad_gurbani/naam_bina.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        kirpa = findViewById(R.id.KirpaKaro);
        kirpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://sikhismknowledge.com/shabad_gurbani/kirpaa_karo_hare.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        harJio = findViewById(R.id.HarJioNimanya);
        harJio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.sikhismknowledge.com/shabad_gurbani/Har_Jio_Bhai_Davinder_Singh.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        karKirpa = findViewById(R.id.KarKirpa);
        karKirpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://sikhismknowledge.com/shabad_gurbani/Kar_Kirpa_Tere_Gun_Gaavan_Bhai_Satinderbir_Singh.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });


        satnam = findViewById(R.id.satnam);
        satnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Satnaam_Shri_WaheGuru.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

       kab = findViewById(R.id.kab);
        kab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Kab_Gal_Lavangay.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        har = findViewById(R.id.har);
        har.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/HAR_JIYO.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        jhiva = findViewById(R.id.jhiva);
        jhiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Jhiva_Ek_Kavan_Gun_Kahiye.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        tumere = findViewById(R.id.tumere);
        tumere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Tu_Mera_Pita.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        tum = findViewById(R.id.tum);
       tum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Tum_Sarnai_Aya_Thakur.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        taati = findViewById(R.id.taati);
        taati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Taati_Vao_Na_Lagaee.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        tumwith = findViewById(R.id.tumWith);
        tumwith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Tum_karo_daya.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        jogia = findViewById(R.id.jogia);
        jogia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Jogia_Matvaro_Ray.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        bahut = findViewById(R.id.bahut);
        bahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.bestwebsiteinindia.com/Music/Gurbani/Bahut_Pher_Pye_Kirpan_Kou.mp3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });


    }
}
