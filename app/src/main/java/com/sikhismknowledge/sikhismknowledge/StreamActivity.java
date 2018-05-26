package com.sikhismknowledge.sikhismknowledge;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

import dyanamitechetan.vusikview.VusikView;

public class StreamActivity extends AppCompatActivity implements MediaPlayer.OnBufferingUpdateListener,MediaPlayer.OnCompletionListener{

    private ImageButton btn_play_pause;


    private VusikView musicView;

    private String url = "";

    private MediaPlayer mediaPlayer;



    StreamTask streamTask = new StreamTask();

    ProgressDialog mDialog;

    private boolean isStreamNotRunning = true;
    private boolean isNotPaused = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);

        Intent i =getIntent();
        url = i.getExtras().getString("url");


        musicView = (VusikView)findViewById(R.id.musicView);


        btn_play_pause = (ImageButton) findViewById(R.id.btn_play_pause);
        btn_play_pause.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {

               if(isStreamNotRunning) {
                    streamTask.execute(url);
                    musicView.start();
                    isStreamNotRunning = false;
                }
                else if(isNotPaused){

                    mediaPlayer.pause();
                    btn_play_pause.setImageResource(R.drawable.icon_play);
                    isNotPaused = false;
                }
                else {
                    mediaPlayer.start();
                    btn_play_pause.setImageResource(R.drawable.icon_pause);
                    isNotPaused = true;
                }

            }

        });

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnBufferingUpdateListener(this);
        mediaPlayer.setOnCompletionListener(this);


    }



    @Override
    public void onBufferingUpdate(MediaPlayer mp, int percent) {

    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        btn_play_pause.setImageResource(R.drawable.icon_play);
        musicView.stopNotesFall();
            isStreamNotRunning = true;



    }

    protected void onDestroy(){
        super.onDestroy();
        if(mediaPlayer.isPlaying() || !isNotPaused) {
            streamTask.cancel(true);
            mediaPlayer.stop();
            mediaPlayer.release();



        }

    }




   private class StreamTask extends AsyncTask<String,String,String>  {





        protected void onPreExecute() {
            mDialog = new ProgressDialog(StreamActivity.this);
            mDialog.setMessage("Loading...");
            mDialog.show();
            btn_play_pause.setEnabled(false);

            DialogInterface.OnCancelListener cancelListener=new DialogInterface.OnCancelListener(){
                @Override
                public void onCancel(DialogInterface arg0){
                    streamTask.cancel(true);
                    finish();
                }
            };

            mDialog.setCancelable(true);
            mDialog.setOnCancelListener(cancelListener);


        }



        protected String doInBackground(String... params) {
            try{
                mediaPlayer.setDataSource(params[0]);
                mediaPlayer.prepare();
            }
            catch (Exception ex)
            {

            }
            if(isCancelled()){
                mediaPlayer.stop();
            }

            return "";
        }


        protected void onPostExecute(String s) {

            if(!mediaPlayer.isPlaying())
            {
                mediaPlayer.start();
                btn_play_pause.setImageResource(R.drawable.icon_pause);
            }
            else
            {
                mediaPlayer.pause();
                btn_play_pause.setImageResource(R.drawable.icon_play);
            }

            mDialog.dismiss();
            btn_play_pause.setEnabled(true);
        }
    }


}





