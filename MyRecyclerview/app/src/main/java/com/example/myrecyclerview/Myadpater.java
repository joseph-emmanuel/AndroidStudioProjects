package com.example.myrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Myadpater extends RecyclerView.Adapter<Myadpater.MyViewHolder> {
    String data1[];
    int images[],icons[];
    Context context;
    public Myadpater(Context ct,String s1[],int ico[],int img[]){
        context=ct;
        data1=s1;
        icons=ico;
        images=img;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        holder.myText1.setText(data1[position]);
        holder.myIcon.setImageResource(icons[position]);
        holder.myImage.setImageResource(images[position ]);

        holder.myImage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                holder.myImage.setImageResource(R.drawable.google);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myText1;
        ImageView myImage,myIcon;
        ConstraintLayout mainLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1=itemView.findViewById(R.id.like);
            myIcon=itemView.findViewById(R.id.heartblank);
            myImage=itemView.findViewById(R.id.customRecycler_image);
            mainLayout=itemView.findViewById(R.id.recyclerView);
        }
    }
}
