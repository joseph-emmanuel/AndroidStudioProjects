package com.example.recycler.List;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recycler.R;

public class CustomData {
    private String title;
    private  String description;
    private int pictureId;
    public CustomData(String title,String description,int pictureID){
        this.title=title;
        this.description=description;
        this.pictureId=pictureID;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPictureId() {
        return pictureId;
    }
}
