package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second );
        Toast.makeText(this,"Oncreate has ran",Toast.LENGTH_SHORT).show();
        Button btnChangeActivity=findViewById(R.id.main_btnChangeActivity);
        btnChangeActivity.setText("Change");
    }
}