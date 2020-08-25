package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        int clicked=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button changeToFirst=findViewById(R.id.btnChangeSecondActivity);
        changeToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                clicked++;
                Intent intent=new Intent(SecondAcivity.this,MainActivity.class);
                Person myteacher=new Person("reza","Malbadi");
                Person iam=new Person("Joseph","Emmanuel");
                intent.putExtra("Myteacher",myteacher);
                intent.putExtra("me",iam);
//                intent.putExtra("name","Joseph");
//                intent.putExtra("age","30");

                startActivity(intent);
                finish();
//                Uri telephone=Uri.parse("tel:5148939133");
//                Intent composeTel=new Intent(Intent.ACTION_DIAL,telephone);
//                startActivity(composeTel);
            }
        });

    }
}