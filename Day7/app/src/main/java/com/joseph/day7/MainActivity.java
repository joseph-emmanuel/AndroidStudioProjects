package com.joseph.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private  final  String SHARED_PREFERENCES_FILE="codes.jemmanue.day7";
    private final String FIRST_NAME_KEY="firstName";
    private SharedPreferences sharedPreferences;
    private EditText firstName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences=getSharedPreferences(SHARED_PREFERENCES_FILE,MODE_PRIVATE);
        firstName=findViewById(R.id.main_firstName);
        String prefFirstName=sharedPreferences.getString(FIRST_NAME_KEY,"");
        firstName.setText(prefFirstName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FIRST_NAME_KEY, firstName.getText().toString());
        editor.apply();
    }
    public void ResetButton(View view){
        firstName.setText("0");
        android.content.SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.remove(FIRST_NAME_KEY);//removes only one kay/value pair
        editor.clear();//Remove all sharedPreferences key/values
    }
    public void Incrementbtn(View view){
        String value=firstName.getText().toString();
        int value1=Integer.parseInt(value);
        Log.e("TAG", "Incrementbtn: "+value1 );
        value1=value1+1;
        firstName.setText(String.valueOf(value1));
    }
    public void Decrementbtn(View view){
        String value=firstName.getText().toString();
        int value1=Integer.parseInt(value);
        Log.e("TAG", "Incrementbtn: "+value1 );
        value1=value1-1;
        firstName.setText(String.valueOf(value1));
    }
    public void Randombtn(View view){
        int min=0,max=100,x=0;
        Random r = new Random();
        x=r.nextInt((max - min) + 1) + min;
        Log.d("TAG", "Randombtn: "+x);
        firstName.setText(String.valueOf(x));
    }
}