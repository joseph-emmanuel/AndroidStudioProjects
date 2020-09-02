package com.joseph.day6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonVibrate;

    android.os.Vibrator Vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonVibrate = (Button)findViewById(R.id.vibrate);
        Vibrator = (Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);
        buttonVibrate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                smallVibration();
                largeVibration();
                smallVibration();
            }

    });
    }
    public void smallVibration(){
            for (int i=0;i<3;i++){
                Vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                Log.e("TAG", "smallVibration: "+i);
            }
    }
    public void largeVibration(){
        for (int i=0;i<3;i++){
            Vibrator.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
            Log.e("TAG", "largeVibration: "+i );
        }
    }

}