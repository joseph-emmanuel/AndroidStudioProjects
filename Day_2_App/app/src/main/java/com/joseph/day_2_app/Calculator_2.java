package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator_2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_2);

    }
    public void numberGotClicked(View whoGotCLicked){
        Button btn = (Button)whoGotCLicked;
        String buttonText = btn.getText().toString();
        Log.e("/", "numberGotClicked: "+buttonText);
        TextView textView=(TextView) findViewById(R.id.MainTextView);
        final String textViewInitiaslText=textView.getText().toString();
        Log.e("/", "text view text: "+textView.getText().toString());

        textView.append(buttonText);

    }
    public void clearGotClicked(View whoGotCLicked){

        Button btn = (Button)whoGotCLicked;
        String buttonText = btn.getText().toString();
        Log.e("/", "numberGotClicked: "+buttonText);
        TextView textView=(TextView) findViewById(R.id.MainTextView);
        textView.setText("");
        final String textViewInitiaslText=textView.getText().toString();
        Log.e("/", "text view text: "+textView.getText().toString());
        textView.setText("");

    }

}