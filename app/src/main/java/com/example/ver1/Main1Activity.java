package com.example.ver1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main1Activity extends AppCompatActivity {
    Button btnm,btnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);
        final Intent intent1 = new Intent(getApplicationContext(),Main2Activity.class);
        final Intent intent2 = new Intent(getApplicationContext(),Main3Activity.class);
        btnm = findViewById(R.id.b1);
        btnc = findViewById(R.id.b2);

        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent1);
            }
       });

        btnc.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent2);

            }
        });
    }
}
