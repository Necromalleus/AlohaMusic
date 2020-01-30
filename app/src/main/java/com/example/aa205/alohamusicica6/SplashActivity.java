package com.example.aa205.alohamusicica6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }// end run
        }; // end new TimerTask

        // schedule splash screen to be displayed for 5 seconds (= 5000 ms)
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    } // end onCreate
}
