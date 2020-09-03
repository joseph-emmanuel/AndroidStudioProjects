package com.joseph.day_7_2.DB.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.joseph.day_7_2.DB.Entity.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Query("Select * from User")
    LiveData<List<User>> getUsers();
    @Query("select first_name from user where uid= :uid")
    String firstName(int uid);
    @Query("select first_name from user")
    List<String> firstNames();

    @Insert
    void insert(User...users);//insert(user1,user2,user3 or just one)
    @Delete
    void delete(User user);
}
