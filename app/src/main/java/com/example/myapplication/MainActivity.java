package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<ContactModel>  contactModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this)); //layout manager for recyclerview

        contactModels.add(new ContactModel(R.drawable.img1 , "99127283", "Shelly"));
        contactModels.add(new ContactModel(R.drawable.img2 , "99127283", "abs"));
        contactModels.add(new ContactModel(R.drawable.img3 , "99127283", "ramesh"));
        contactModels.add(new ContactModel(R.drawable.img1 , "99127283", "kaloo"));
        contactModels.add(new ContactModel(R.drawable.img3 , "99127283", "robin"));
        contactModels.add(new ContactModel(R.drawable.img2 , "99127283", "rakesh"));
        contactModels.add(new ContactModel(R.drawable.img1 , "99127283", "raju"));
        contactModels.add(new ContactModel(R.drawable.img3 , "99127283", "shelloo"));


    }


}