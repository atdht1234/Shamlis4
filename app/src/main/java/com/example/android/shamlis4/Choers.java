package com.example.android.shamlis4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choers extends AppCompatActivity implements View.OnClickListener {

    Button hang, fold, clean, dishes, wash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choers);

        hang = findViewById(R.id.hang);
        hang.setOnClickListener(this);

        fold = findViewById(R.id.fold);
        fold.setOnClickListener(this);

        clean = findViewById(R.id.clean);
        clean.setOnClickListener(this);

        dishes = findViewById(R.id.dishes);
        dishes.setOnClickListener(this);

        wash = findViewById(R.id.wash);
        wash.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {



    }
}
