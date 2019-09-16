package com.example.ver1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main1Activity extends AppCompatActivity {
    Button btnm,btnc;

    /*private Context context;

    public Main1Activity(Context context) {
        this.context = context;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);
        btnm = findViewById(R.id.b1);
        btnc = findViewById(R.id.b2);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(Main1Activity.this,Main2Activity.class);
                startActivity(m);
            }
        });
//        btnm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent m = new Intent(Main1Activity.this,Main2Activity.class);
//                startActivity(m);
//            }
//        });

        btnc.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Main1Activity.this,Main3Activity.class);
                startActivity(c);
                //context.startActivity(c);
            }
        });
    }
}
