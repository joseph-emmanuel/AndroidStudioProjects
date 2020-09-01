package codes.rcm.fourthdayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import codes.rcm.fourthdayapp.Adapter.People;
import codes.rcm.fourthdayapp.Adapter.PeopleAdapter;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recycler_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);


        ArrayList<People> data = new ArrayList<>();
        data.add(new People(R.drawable.dog, R.drawable.likeblank, "2", R.layout.custom_recycler_view_1));
        data.add(new People(R.drawable.cat, R.drawable.likered, "11", R.layout.custom_recycler_view_1));
        data.add(new People(R.drawable.dog, R.drawable.likeblank, "14", R.layout.custom_recycler_view_2));
        data.add(new People(R.drawable.cat, R.drawable.likered, "74", R.layout.custom_recycler_view_1));
        data.add(new People(R.drawable.dog, R.drawable.likeblank, "0", R.layout.custom_recycler_view_2));
        data.add(new People(R.drawable.cat, R.drawable.likered,"12", R.layout.custom_recycler_view_1));
        data.add(new People(R.drawable.dog, R.drawable.likeblank, "5", R.layout.custom_recycler_view_2));
        data.add(new People(R.drawable.cat, R.drawable.likeblank, "6", R.layout.custom_recycler_view_2));

        PeopleAdapter peopleAdapter = new PeopleAdapter(data);
        recyclerView.setAdapter(peopleAdapter);
    }
}