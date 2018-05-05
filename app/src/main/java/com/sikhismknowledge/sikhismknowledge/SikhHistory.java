package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SikhHistory extends AppCompatActivity {

    Button SikhGurus,Piare,WaddeSahibzaade,ChhoteSahibzaade,SikhismGlossary,SikhRehetMaryada,
            other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikh_history);

        SikhGurus = findViewById(R.id.SikhGurus);
        SikhGurus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,SikGurus.class);
                startActivity(intent);
            }
        });

        Piare = findViewById(R.id.Piare);
        Piare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,Piare.class);
                startActivity(intent);
            }
        });

        WaddeSahibzaade = findViewById(R.id.WaddeSahibzaade);
        WaddeSahibzaade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,WaddeSahibzaade.class);
                startActivity(intent);
            }
        });

        ChhoteSahibzaade = findViewById(R.id.ChhoteSahibzaade);
        ChhoteSahibzaade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,ChhoteSahibzaade.class);
                startActivity(intent);
            }
        });

        SikhismGlossary = findViewById(R.id.SikhismGlossary);
        SikhismGlossary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SikhHistory.this,SikhismGlossary.class);
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






