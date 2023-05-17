package com.example.lesson_3_3.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson_3_3.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView textViewName;
    ImageView icon;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String name){
        textViewName = itemView.findViewById(R.id.textView_name);
        icon = itemView.findViewById(R.id.imageView_icon);

        textViewName.setText(name);

    }
}
