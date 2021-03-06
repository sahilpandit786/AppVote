package com.example.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView textView = findViewById(R.id.txtVoted);

        Intent intent = getIntent(); // I recieve the intent I created on previous page
        String name = intent.getExtras().getString("name");
        String id = intent.getExtras().getString("id");
        String cName = intent.getExtras().getString("cName");

        textView.setText("Your Name: "+name+" \n Your Id: "+id+" \n Voted Candidate: "+cName);
    }
}