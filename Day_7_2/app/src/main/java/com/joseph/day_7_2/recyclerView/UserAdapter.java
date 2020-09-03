package com.joseph.day_7_2.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.joseph.day_7_2.DB.Entity.User;

import java.util.ArrayList;
import java.util.List;
import com.joseph.day_7_2.R;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private List<User> users;
    private final LayoutInflater inflater;
    public UserAdapter(Context context){
        inflater=LayoutInflater.from(context);
        users=new ArrayList<>();
    }
    public void setUsers(List<User> users){
        this.users=users;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View customView=inflater.inflate(viewType,parent,false);
        UserViewHolder userViewHolder=new UserViewHolder(customView);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.bind(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    @Override
    public int getItemViewType(int position) {
        return R.layout.custom_user;
    }
}
