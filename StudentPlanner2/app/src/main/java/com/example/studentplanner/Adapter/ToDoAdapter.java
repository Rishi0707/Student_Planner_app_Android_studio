package com.example.studentplanner.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.recyclerview.widget.RecyclerView;
import com.example.studentplanner.AddNewTask;
import com.example.studentplanner.Model.ToDoModel;
import com.example.studentplanner.R;
import com.example.studentplanner.Utils.DatabaseHandler;
import com.example.studentplanner.todo;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder> {

    private List<ToDoModel> todoList;
    private todo activity;
    private DatabaseHandler db;

    public ToDoAdapter(DatabaseHandler db, todo activity){
        this.db = db;
        this.activity = activity;
    }



    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tasklayout,parent,false);
        return new ViewHolder(itemView);
    }

    public void onBindViewHolder (final ViewHolder holder, int pos){
        db.openDatabase();
        final ToDoModel item = todoList.get(pos);
        holder.task.setText(item.getTask());
        holder.task.setChecked(todobool(item.getStatus()));//accepts boolean val only
        holder.task.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    db.updateStatus(item.getId(),1);
                }
                else{
                    db.updateStatus(item.getId(),0);
                }
            }
        });
    }

    public int getItemCount(){
        return todoList.size();
    }

    //converts status to bool
    private boolean todobool(int n ){
        return n!=0;
    }

    public void setTask(List<ToDoModel> todoList){
        this.todoList = todoList;
        notifyDataSetChanged();
    }

    public Context getContext() {
        return activity;
    }

    public void deleteItem(int position) {
        ToDoModel item = todoList.get(position);
        db.deleteTask(item.getId());
        todoList.remove(position);
        notifyItemRemoved(position);
    }


    public void editItem(int pos){
        ToDoModel item = todoList.get(pos);
        Bundle bundle = new Bundle();
        bundle.putInt("id",item.getId());
        bundle.putString("task", item.getTask());
        AddNewTask fragment = new AddNewTask();
        fragment.setArguments(bundle);
        fragment.show(activity.getSupportFragmentManager(),AddNewTask.TAG);

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox task;

        ViewHolder(View view){
            super(view);
            task = view.findViewById(R.id.todoCheckbox);
        }
    }
}
