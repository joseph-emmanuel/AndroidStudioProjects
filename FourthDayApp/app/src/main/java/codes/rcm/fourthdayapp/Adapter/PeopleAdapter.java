package codes.rcm.fourthdayapp.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

import codes.rcm.fourthdayapp.R;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder> {

    private ArrayList<People> people;

    //Constructor: Bind the data.
    //Reminder: More information can be passed through the constructor
    public PeopleAdapter(ArrayList<People> people)
    {
        this.people = people;
    }


    //Inflate the CustomView
    //Pass the CustomView to the ViewHolder (Manages your Activity)
    //Returns ViewHolder to RecyclerView
    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int customViewType) {
        View customView = LayoutInflater
                .from(parent.getContext())
                .inflate(customViewType, parent, false);
        PeopleViewHolder customViewHolder = new PeopleViewHolder(customView);
        return customViewHolder;
    }

    //Give Data to ViewHolder
    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        holder.bind(people.get(position));
    }

    @Override
    public int getItemCount() {
        return people.size();
    }

    //Which view should i use for this position
    @Override
    public int getItemViewType(int position) {
        return people.get(position).customView;
//        if (position % 2 == 0)
//            return R.layout.custom_recycler_view_1;
//        else
//            return R.layout.custom_recycler_view_2;
    }
}
