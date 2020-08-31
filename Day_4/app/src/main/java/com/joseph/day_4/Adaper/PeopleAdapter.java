package com.joseph.day_4.Adaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder> {
    private ArrayList<People> people;
    public PeopleAdapter(ArrayList<People> people){
        this.people=people;
    }


    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int customVIewtype) {
        View custom_v=LayoutInflater.
                from(parent.getContext())
                .inflate(customVIewtype,parent,false);
        PeopleViewHolder customViewHolder=new PeopleViewHolder(custom_v);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
