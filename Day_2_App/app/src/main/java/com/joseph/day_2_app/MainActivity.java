package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );
//        Toast.makeText(this,"Oncreate has ran",Toast.LENGTH_SHORT).show();
        final Button btnChangeActivity=findViewById(R.id.main_btnChangeActivity);
        final ImageView IviewChange=findViewById(R.id.main_IviewToast);
        IviewChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"The image view has clicked",Toast.LENGTH_SHORT).show();

            }
        });
        btnChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SecondAcivity.class);
                startActivity(intent);
                finish();
//                btnChangeActivity.setText("I got clicked");
            }
        });
        Intent ActivityCalled=getIntent();
        if(ActivityCalled.hasExtra("me")){
            Person teacher=(Person)getIntent().getSerializableExtra("Myteacher");
            Person me=(Person)getIntent().getSerializableExtra("me");
            Toast.makeText(this, "Name is "+me.getFirstName(), Toast.LENGTH_SHORT).show();
        }
    }

//    public void imgGotClicked(View viewThatGotClicked) {
//        Toast.makeText(this,"I think thid is a nice  work",Toast.LENGTH_SHORT).show();
//    }
}