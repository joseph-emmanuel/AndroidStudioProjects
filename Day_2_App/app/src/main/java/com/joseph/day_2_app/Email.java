//package com.joseph.day_2_app;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class    Email extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_email);
//        Button sendButton=findViewById(R.id.emailsendBtn);
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText toText=(EditText) findViewById(R.id.email_toText);
//                EditText subjectText=(EditText) findViewById(R.id.email_subjectText);
//                EditText bodyText=(EditText) findViewById(R.id.email_bodyText);
//
//                Intent intent=new Intent(Email.this,Email_Second.class);
//                intent.putExtra("to",toText.getText().toString());
//                intent.putExtra("subject",subjectText.getText().toString());
//                intent.putExtra("body",bodyText.getText().toString());
//                startActivity(intent);
//                Log.e("To",toText.getText().toString());
//                Log.e("Subject",subjectText.getText().toString());
//                Log.e("Body",bodyText.getText().toString());
//
//                finish();
//            }
//        });
//    }
//}