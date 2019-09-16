package com.example.ver1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class Main2Activity extends AppCompatActivity {
    private Button btn;
    private EditText ed1,ed2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        btn=findViewById(R.id.b12);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);



    }
}
