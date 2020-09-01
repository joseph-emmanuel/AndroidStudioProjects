package com.joseph.day5;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton implements View.OnClickListener,View.OnTouchListener {
    Context context;
    public CustomButton(@NonNull Context context) {
        super(context);
        this.context=context;
        setOnClickListener(this);
    }
    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        setOnClickListener(this);
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onClick(View view) {
        Log.e("/", "button clicked" );
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("CustomButtonTouch : ", "Action Down");
            case MotionEvent.ACTION_MOVE:
                Log.e("CustomButtonMove : ", "Action Move");
            case MotionEvent.ACTION_UP:
                Log.e("CustomButtonup : ", "Action Up");
        }
        Log.e("CustomButtonTouch : ", "Action Nothing");
        return false;
    }
}
