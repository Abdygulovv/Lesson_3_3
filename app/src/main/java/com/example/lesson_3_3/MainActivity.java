package com.example.lesson_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lesson_3_3.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayListNames = new ArrayList<>();
    ContactAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListNames.add("Madina");
        arrayListNames.add("Yryskeldi");
        arrayListNames.add("Chyngyz");
        arrayListNames.add("Chyngyz2");
        arrayListNames.add("Radmir");
        arrayListNames.add("Kamaljon");
        arrayListNames.add("Iskender");
        arrayListNames.add("Almanbet");

        adapter = new ContactAdapter(arrayListNames);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }
}