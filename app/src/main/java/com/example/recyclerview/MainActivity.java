package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViews = findViewById(R.id.recycler);

        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Asmita Kasulawot","9861717787",R.drawable.asmita));
        contactsList.add(new Contacts("Shreya Shakya","9861717787",R.drawable.sia));
        contactsList.add(new Contacts("Shyam Hada","9861717787",R.drawable.shyam));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerViews.setAdapter(contactsAdapter);
        recyclerViews.setLayoutManager(new LinearLayoutManager(this));

    }
}