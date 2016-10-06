package edu.orangecoastcollege.cs273.rorellana2.alohamusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask mediaTask = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MusicActivity.class));
            }
        };

        //Create a timer object that launches task //after 3-5 sec
        Timer timer = new Timer();
        timer.schedule(mediaTask, 5000);
        // Database resources to load


    }
}
