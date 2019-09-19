package com.example.ver1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    TextView signin;
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(getApplicationContext(),SignIn.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        signin = findViewById(R.id.sign_in);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }

    }

