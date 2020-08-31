package com.example.recycler.List;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.recycler.R;

import java.util.ArrayList;

public class CustomView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        ArrayList<CustomData> rowData = new ArrayList<>();
        rowData.add(new CustomData("Universe 1", "The Universe ", R.drawable.a1));
        rowData.add(new CustomData("Universe 2", "The Universe ", R.drawable.a2));
        rowData.add(new CustomData("Universe 3", "The Universe ", R.drawable.a3));
        rowData.add(new CustomData("Universe 4", "The Universe ", R.drawable.a4));
        rowData.add(new CustomData("Universe 5", "The Universe ", R.drawable.a1));
        rowData.add(new CustomData("Universe 6", "The Universe ", R.drawable.a2));
        rowData.add(new CustomData("Universe 7", "The Universe ", R.drawable.a3));
        rowData.add(new CustomData("Universe 8", "The Universe ", R.drawable.a5));
        CustomAdapter customAdapter=new CustomAdapter(this,R.layout.activity_custom_view,rowData);

    }

}