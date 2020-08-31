package com.joseph.day_4.Adaper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import  codes.rcm.
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleViewHolder extends RecyclerView.ViewHolder {
    ImageView profileImage;
    TextView firstName;
    TextView lastName;
    public  PeopleViewHolder(@NonNull View customActivity){
        super(customActivity);
//        profileImage=customActivity.findViewById(R.id.dog1)
//
    }
    public void bind(People people){

    }
}
