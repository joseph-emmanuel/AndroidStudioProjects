package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]={R.drawable.csharp,R.drawable.java,R.drawable.js,R.drawable.php,R.drawable.python,R.drawable.r,R.drawable.ruby,R.drawable.sql,R.drawable.swift,R.drawable.swift};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.programming_languages);
        s2=getResources().getStringArray(R.array.description);

        Myadpater myadpater=new Myadpater(this,s1,s2,images);
        recyclerView.setAdapter(myadpater);
        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
    }
}