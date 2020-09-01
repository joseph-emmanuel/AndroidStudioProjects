package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[];
    int images[]={R.drawable.dog,R.drawable.cat,R.drawable.dog,R.drawable.cat,R.drawable.dog,R.drawable.cat,R.drawable.dog,R.drawable.cat,R.drawable.dog,R.drawable.cat};
    int icons[]={R.drawable.likeblank,R.drawable.likered,R.drawable.likered,R.drawable.likeblank,R.drawable.likered,R.drawable.likeblank,R.drawable.likered,R.drawable.likered,R.drawable.likeblank,R.drawable.likered};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        s1=getResources().getStringArray(R.array.programming_languages);

        Myadpater myadpater=new Myadpater(this,s1,icons,images);
        recyclerView.setAdapter(myadpater);
        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
    }
}