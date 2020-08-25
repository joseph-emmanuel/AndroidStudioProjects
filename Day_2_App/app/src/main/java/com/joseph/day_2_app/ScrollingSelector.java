package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ScrollingSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_selector);
        final ImageView imageViewOne=findViewById(R.id.imageOne);
        final  ImageView imageViewMain=findViewById(R.id.mainImage);
        final ImageView imageViewTwo=findViewById(R.id.imageTwo);
        final ImageView imageViewThree=findViewById(R.id.imageThree);
        final ImageView imageViewFour=findViewById(R.id.imageFour);
        final ImageView imageViewFive=findViewById(R.id.imageFive);
        final ImageView imageViewSix=findViewById(R.id.imageSix);
        imageViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewMain.setImageResource(R.drawable.a1);
            }
        });
        imageViewTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("checking/", "onClick: changes");
                imageViewMain.setImageResource(R.drawable.a2);
            }
        });


        imageViewThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("checking/", "onClick: changes");
                imageViewMain.setImageResource(R.drawable.a3);
            }
        });
        imageViewFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("checking/", "onClick: changes");
                imageViewMain.setImageResource(R.drawable.a4);
            }
        });
        imageViewFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("checking/", "onClick: changes");
                imageViewMain.setImageResource(R.drawable.a5);
            }
        });
        imageViewSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("checking/", "onClick: changes");
                imageViewMain.setImageResource(R.drawable.a6);
            }
        });


    }
}