package com.example.android.shamlis4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==btn1){

          Intent intent = new Intent(this,CreateActivity.class);
          startActivity(intent);
        }

        if(v==btn2){

            Intent intenter = new Intent(this,familycode.class);
            startActivity(intenter);
        }
    }




}
