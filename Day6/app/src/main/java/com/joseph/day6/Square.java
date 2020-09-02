package com.joseph.day6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class Square extends View,AppCompatActivity {
    ShapeDrawable myshape;

    public Square(Context context) {
        super(context);
        initilize();
    }

    private void initilize() {
        myshape
    }

    public Square(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}