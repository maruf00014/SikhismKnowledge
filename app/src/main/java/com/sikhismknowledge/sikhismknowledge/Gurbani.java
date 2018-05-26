package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gurbani extends AppCompatActivity {
    Button JapjiSahibPunjabi,ShabadHazaarePunjabi,JaapSahibPunjabi,TavParsaadSavaiyeePunjabi,
            AnandSahibPunjabi,RehraasSahibPunjabi,KirtanSohilaPunjabi,BarahmaahaPunjabi
            ,JapjiSahibMorning6AM,JaapSahibMorning615AM,TavPrasadSavaiyeMorning645AM,
    AnandSahibMorning7AM,RehraasSahibEvening630PM,SohilaEvening10PM,JapjiSahibEnglish,
            AnandSahibEnglish,RehraasSahibEnglish,KirtanSohilaEnglish,BarahmaahaEnglish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurbani);





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

        JapjiSahibEnglish = findViewById(R.id.JapjiSahibEnglish);
        JapjiSahibEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.JapjiSahibEnglish.class);
                startActivity(i);


            }
        });

        AnandSahibEnglish = findViewById(R.id.AnandSahibEnglish);
        AnandSahibEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.AnandSahibEnglish.class);
                startActivity(i);


            }
        });

        RehraasSahibEnglish = findViewById(R.id.RehraasSahibEnglish);
        RehraasSahibEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.RehraasSahibEnglish.class);
                startActivity(i);


            }
        });

        KirtanSohilaEnglish = findViewById(R.id.KirtanSohilaEnglish);
        KirtanSohilaEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.KirtanSohilaEnglish.class);
                startActivity(i);


            }
        });

        BarahmaahaEnglish = findViewById(R.id.BarahmaahaEnglish);
        BarahmaahaEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.BarahmaahaEnglish.class);
                startActivity(i);


            }
        });

        JapjiSahibMorning6AM = findViewById(R.id.JapjiSahibMorning6AM);
        JapjiSahibMorning6AM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.JapjiSahibMorning6AM.class);
                startActivity(i);


            }
        });


        JaapSahibMorning615AM = findViewById(R.id.JaapSahibMorning615AM);
        JaapSahibMorning615AM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.JaapSahibMorning615AM.class);
                startActivity(i);


            }
        });

        TavPrasadSavaiyeMorning645AM = findViewById(R.id.TavPrasadSavaiyeMorning645AM);
        TavPrasadSavaiyeMorning645AM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.TavPrasadSavaiyeMorning645AM.class);
                startActivity(i);


            }
        });

        AnandSahibMorning7AM = findViewById(R.id.AnandSahibMorning7AM);
        AnandSahibMorning7AM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.AnandSahibMorning7AM.class);
                startActivity(i);


            }
        });

        RehraasSahibEvening630PM = findViewById(R.id.RehraasSahibEvening630PM);
        RehraasSahibEvening630PM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.RehraasSahibEvening630PM.class);
                startActivity(i);


            }
        });

        SohilaEvening10PM = findViewById(R.id.SohilaEvening10PM);
        SohilaEvening10PM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Gurbani.this, com.sikhismknowledge.sikhismknowledge.gurbani.SohilaEvening10PM.class);
                startActivity(i);


            }
        });

    }
}
