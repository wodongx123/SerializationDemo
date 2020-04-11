package com.example.serializationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra("user");

        User2 user2 = intent.getParcelableExtra("user2");

        //Log.i(TAG, "onCreate: " + user.getId() + " " + user.getName());
        Log.i(TAG, "onCreate: " + user2.getId() + " " + user2.getName());
    }
}
