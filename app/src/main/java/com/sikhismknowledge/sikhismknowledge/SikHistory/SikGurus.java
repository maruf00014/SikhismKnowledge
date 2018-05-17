package com.sikhismknowledge.sikhismknowledge.SikHistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.sikhismknowledge.sikhismknowledge.R;
import com.sikhismknowledge.sikhismknowledge.SikhHistory;

public class SikGurus extends AppCompatActivity {

    Button SriGuruNanakDevJi,SriGuruAngadDevJi,SriGuruAmardasJi,SriGuruRamDaasJi,
            SriGuruArjanDevJi,SriGuruHargobindSahibJi,SriGuruHarRaiJi,SriGuruHarkrishanJi,
            SriGuruTegBahadurJi, SriGuruGobindSinghJi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sik_gurus);


        SriGuruNanakDevJi = findViewById(R.id.SriGuruNanakDevJi);
        SriGuruNanakDevJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this,com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruNanakDevJi.class);
                startActivity(intent);
            }
        });

        SriGuruAngadDevJi = findViewById(R.id.SriGuruAngadDevJi);
        SriGuruAngadDevJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this, com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruAngadDevJi.class);
                startActivity(intent);
            }
        });

        SriGuruAmardasJi = findViewById(R.id.SriGuruAmardasJi);
        SriGuruAmardasJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this, com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruAmardasJi.class);
                startActivity(intent);
            }
        });

        SriGuruRamDaasJi = findViewById(R.id.SriGuruRamDaasJi);
        SriGuruRamDaasJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this, com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruRamDaasJi.class);
                startActivity(intent);
            }
        });

        SriGuruArjanDevJi = findViewById(R.id.SriGuruArjanDevJi);
        SriGuruArjanDevJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this, com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruArjanDevJi.class);
                startActivity(intent);
            }
        });



        SriGuruHargobindSahibJi = findViewById(R.id.SriGuruHargobindSahibJi);
        SriGuruHargobindSahibJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this,com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruHargobindSahibJi.class);
                startActivity(intent);
            }
        });

        SriGuruHarRaiJi = findViewById(R.id.SriGuruHarRaiJi);
        SriGuruHarRaiJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this,com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruHarRaiJi.class);
                startActivity(intent);
            }
        });

        SriGuruHarkrishanJi = findViewById(R.id.SriGuruHarkrishanJi);
        SriGuruHarkrishanJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this,com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruHarkrishanJi.class);
                startActivity(intent);
            }
        });

        SriGuruTegBahadurJi = findViewById(R.id.SriGuruTegBahadurJi);
        SriGuruTegBahadurJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this,com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruTegBahadurJi.class);
                startActivity(intent);
            }
        });

        SriGuruGobindSinghJi = findViewById(R.id.SriGuruGobindSinghJi);
        SriGuruGobindSinghJi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikGurus.this,com.sikhismknowledge.sikhismknowledge.SikHistory.sikGurus.SriGuruGobindSinghJi.class);
                startActivity(intent);
            }
        });

    }
}
