package com.sikhismknowledge.sikhismknowledge.gurbani;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sikhismknowledge.sikhismknowledge.R;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Maruf on 20-May-18.
 */

public class AnandSahibMorning7AM extends AppCompatActivity  {

    Button alarmButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_view);

        alarmButton = findViewById(R.id.alarmButton);
        alarmButton.setText(" Set Alarm at 7 AM ");


        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
                    i.putExtra(AlarmClock.EXTRA_MESSAGE, "Anand Sahib Morning");
                    i.putExtra(AlarmClock.EXTRA_HOUR, 7);
                    i.putExtra(AlarmClock.EXTRA_MINUTES, 0);
                    startActivity(i);
                    finish();

            }
        });


    }
}
