package com.joseph.day_7_2.recyclerView;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joseph.day_7_2.DB.AppDatabase;
import com.joseph.day_7_2.DB.DAO.UserDAO;
import com.joseph.day_7_2.DB.Entity.User;
import com.joseph.day_7_2.R;

public class UserViewHolder extends RecyclerView.ViewHolder {

    private final TextView firstName;
    private final TextView lastName;
    private final Button delete;
    private final UserDAO   userDAO;

    public UserViewHolder(@NonNull View layoutView) {
        super(layoutView);

        firstName = layoutView.findViewById(R.id.custom_firstName);
        lastName = layoutView.findViewById(R.id.custom_LastName);
        delete = layoutView.findViewById(R.id.custom_Delete);
        userDAO= AppDatabase.getDatabaseInstance(layoutView.getContext()).userDAO();
    }
    public  void bind(User user){
        //Add data and TextViews
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
    }

}
