package com.sikhismknowledge.sikhismknowledge.gurbani;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sikhismknowledge.sikhismknowledge.R;

/**
 * Created by Maruf on 20-May-18.
 */

public class TavPrasadSavaiyeMorning645AM extends AppCompatActivity {

    Button alarmButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_view);

        alarmButton = findViewById(R.id.alarmButton);
        alarmButton.setText(" Set Alarm at 6.45 AM ");


        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
                i.putExtra(AlarmClock.EXTRA_MESSAGE, "Tav Prasad Savaiye Morning");
                i.putExtra(AlarmClock.EXTRA_HOUR, 6);
                i.putExtra(AlarmClock.EXTRA_MINUTES, 45);
                startActivity(i);
                finish();

            }
        });


    }
}
