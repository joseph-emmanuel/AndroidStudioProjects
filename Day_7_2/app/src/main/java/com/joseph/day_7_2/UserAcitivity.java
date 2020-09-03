package com.joseph.day_7_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.joseph.day_7_2.DB.AppDatabase;
import com.joseph.day_7_2.DB.DAO.UserDAO;
import com.joseph.day_7_2.DB.Entity.User;
import com.joseph.day_7_2.recyclerView.UserAdapter;

import java.util.List;

public class UserAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_acitivity);


        //Bind variables
        final EditText firstName= findViewById(R.id.user_firstName);
        final EditText lastName= findViewById(R.id.user_lastName);
        Button save= findViewById(R.id.user_savebtn);
        RecyclerView userList= findViewById(R.id.user_userList);



        //RecyclerView
        userList.setHasFixedSize(false);
        userList.setLayoutManager(new LinearLayoutManager(this));
        final UserAdapter userAdapter=new UserAdapter(this);///need to complete
        userList.setAdapter(userAdapter);


        //Database stuff

        AppDatabase database=AppDatabase.getDatabaseInstance(this);
        final UserDAO userDAO=database.userDAO();



        userDAO.getUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                userAdapter.setUsers(users);
            }
        });
        //save firstname and last name to db
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String fn=firstName.getText().toString();
                final String ln=lastName.getText().toString();

                AppDatabase.databaseWriterExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        User user=new User(fn,ln);
                        userDAO.insert(user);
                    }
                });
            }
        });

    }
}