package com.joseph.day_2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        final TextView textView=findViewById(R.id.MainTextView);
        final String textViewInitiaslText=textView.getText().toString();
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        Button btn3=findViewById(R.id.btn3);
        Button btn4=findViewById(R.id.btn4);
        Button btn5=findViewById(R.id.btn5);
        Button btn6=findViewById(R.id.btn6);
        Button btn7=findViewById(R.id.btn7);
        Button btn8=findViewById(R.id.btn8);
        Button btn9=findViewById(R.id.btn9);
        Button btn0=findViewById(R.id.btn0);
        Button btneq=findViewById(R.id.btneq);
        Button btnmin=findViewById(R.id.btnmin);
        Button btnplus=findViewById(R.id.btnplus);
        Button btndot=findViewById(R.id.btndot);
        Button btnc=findViewById(R.id.btnc);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("/", textViewInitiaslText );
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("9");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("+");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append(".");
            }
        });

        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("-");
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().toString()==textViewInitiaslText)
                    textView.setText("");
                textView.append("=");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textViewInitiaslText);
            }
        });
    }
//    public void setValueForView(string )
}