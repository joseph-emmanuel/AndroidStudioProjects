package com.joseph.day_7_2.DB;

import android.content.Context;

import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.joseph.day_7_2.DB.DAO.UserDAO;
import com.joseph.day_7_2.DB.Entity.User;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDAO userDAO();


    private static final int NUMBER_OF_THREADS=4;
    public static final ExecutorService databaseWriterExecutor= Executors.newFixedThreadPool(NUMBER_OF_THREADS);




    //volatile will enforce main thread,means ut is going to read and write from main thread
    private static volatile AppDatabase instance;

    public static AppDatabase getDatabaseInstance(final Context context){
        if(instance==null){
            synchronized (AppDatabase.class){
                if (instance==null){
                    instance= Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class,
                            "app_database")
                            .fallbackToDestructiveMigration().build();
                }
            }
        }
        return instance;
    }
}
