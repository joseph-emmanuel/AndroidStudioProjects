package com.joseph.day_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.main_listView);
       String[] nameArray= getResources().getStringArray(R.array.names);
        ArrayAdapter<String> myAdapterStringForList=new ArrayAdapter<String>(this,R.layout.custom_view,R.id.customName,nameArray);
        listView.setAdapter(myAdapterStringForList);

    }
}