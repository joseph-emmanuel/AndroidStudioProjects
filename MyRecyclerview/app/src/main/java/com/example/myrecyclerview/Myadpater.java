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
    String data1[],data2[];
    int images[];
    Context context;
    public Myadpater(Context ct,String s1[],String s2[],int img[]){
        context=ct;
        data1=s1;
        data2=s2;
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
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position ]);

        holder.myImage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Log.e("/", holder.myText1.getText().toString() );
                holder.myImage.setImageResource(R.drawable.google);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myText1,myText2;
        ImageView myImage;
        ConstraintLayout mainLayout;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1=itemView.findViewById(R.id.myText1);
            myText2=itemView.findViewById(R.id.myText2);
            myImage=itemView.findViewById(R.id.myImageView);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}
