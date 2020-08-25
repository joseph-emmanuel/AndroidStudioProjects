package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Email_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email__second);
        Intent ActivityCalled=getIntent();
        if(ActivityCalled.hasExtra("to")||ActivityCalled.hasExtra("subject")||ActivityCalled.hasExtra("body")){

            TextView text1=(TextView) findViewById(R.id.second_firstTxt);
            TextView text2=(TextView) findViewById(R.id.second_secondTxt);
            text1.setText(ActivityCalled.getStringExtra("to")+" : "+ActivityCalled.getStringExtra("subject"));
            text2.setText(ActivityCalled.getStringExtra("body"));

        }
    }
}