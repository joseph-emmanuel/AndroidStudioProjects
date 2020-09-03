package com.joseph.day_7_2.DB.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "first_name")
    private  String firstName;
    @ColumnInfo(name = "last_name")
    private String lastName;
    public User(@NonNull String firstName,@NonNull String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
