package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


                new Handler().postDelayed(new Runnable(){
                    @Override
                    public  void run(){

                        Intent splash = new Intent(WelcomeScreen.this, MainActivity.class);
                        startActivity(splash);
                        finish();
                    }

                },SPLASH_TIME_OUT );

    }
}


