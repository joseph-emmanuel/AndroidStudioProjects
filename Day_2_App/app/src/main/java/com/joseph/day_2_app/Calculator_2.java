package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator_2 extends AppCompatActivity {

    boolean xx;
    float op1=0,op2=0,answer=0;
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
    public void opGotclicked(View v){
        Button btn = (Button)v;
        TextView textView=(TextView) findViewById(R.id.MainTextView);
        String buttonText = btn.getText().toString();
        op1=Float.parseFloat(textView.getText().toString());
        Log.e("TAG", "opGotclicked: "+buttonText );
        textView.setText("");
        if(buttonText!="+")
            xx=true;
        else
            xx=false;
        Log.e("TAG", "value of xx : "+xx);

    }
    public void equalGotClicked(View v) {
        TextView textView = (TextView) findViewById(R.id.MainTextView);
        Log.w("TAG", textView.getText().toString());
        String oper2=textView.getText().toString();

        if (xx == true) {
            answer = op1 - Float.parseFloat(oper2);
        } else
            answer = op1 + op2;

        textView.setText(String.valueOf(answer));
    }

    public static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
//public float answer(float a){
//
//    op2=a;
//    if(op1!=0||op2!=0){
//        Log.e("TAG", "equalGotClicked: hhahahahahhah");
//    }
//    else{
//
//        if(xx==true){
//            answer=op1-op2;
//        }
//        else
//            answer=op1+op2;
//
//    }
//    return  answer;
//}
}