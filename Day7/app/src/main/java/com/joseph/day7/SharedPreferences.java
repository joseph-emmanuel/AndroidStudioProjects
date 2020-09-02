package com.joseph.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedPreferences extends AppCompatActivity {

    final  String SHARED_PREFERENCES_FILE="com.joseph.day7";
    final String FIRST_NAME_KEY="firstName";
    android.content.SharedPreferences sharedPreferences;
    EditText firstName;
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
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(FIRST_NAME_KEY, firstName.getText().toString());
        editor.apply();//asynchronously
    }
    public void ResetButton(View view){
        firstName.setText("");
        android.content.SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.remove(FIRST_NAME_KEY);//removes only one kay/value pair
        editor.clear();//Remove all sharedPreferences key/values
    }
}