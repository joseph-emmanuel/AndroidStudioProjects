package com.example.recycler.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.recycler.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter <CustomData>{

    private List<CustomData> data;
    private  Context context;
    private int customId;
    public CustomAdapter(@NonNull Context context, int customViewID, @NonNull List<CustomData> data) {
        super(context, customViewID, data);
        this.context=context;
        this.customId=customViewID;
        this.data=data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CustomData rowData=data.get(position);

        LayoutInflater inflater=((Activity)context).getLayoutInflater();
        View rowView=inflater.inflate(customId,parent,false);
        ImageView rowImage=rowView.findViewById(R.id.custom_image);
        TextView rowTitle=rowView.findViewById(R.id.custom_title);
        TextView rowDescriptoipn=rowView.findViewById(R.id.custom_description);

        rowImage.setImageResource(rowData.getPictureId());
        rowTitle.setText(rowData.getTitle());
        rowDescriptoipn.setText(rowData.getDescription());
        return rowView;
    }
}
