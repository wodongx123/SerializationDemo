package com.example.serializationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                User user = new User();
                user.setId("1111");
                user.setName("2222");
                intent.putExtra("user", user);

                User2 user2 = new User2();
                user2.setId("3333");
                user2.setName("4444");
                intent.putExtra("user2", user2);


                startActivity(intent);
            }
        });


    }
}
