package com.example.android.shamlis4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Lobi extends AppCompatActivity implements View.OnClickListener {

    Button btnchore, btncalender, btncall, btnlocation;
Menu menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobi);




        btnchore = findViewById(R.id.btnchore);
        btnchore.setOnClickListener(this);

        btncalender = findViewById(R.id.btncalender);
        btncalender.setOnClickListener(this);

        btncall = findViewById(R.id.btncall);
        btncall.setOnClickListener(this);

        btnlocation = findViewById(R.id.btnlocation);
        btnlocation.setOnClickListener(this);


    }

    @Override
    public MenuInflater getMenuInflater() {

        return super.getMenuInflater();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = this.getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.options)
        {

            Intent intent = new Intent(this, Options.class);
            startActivity(intent);

        }
        if(item.getItemId() == R.id.about)
        {

            Intent intent = new Intent(this, About.class);
            startActivity(intent);

        }

        if(item.getItemId() == R.id.logout)
        {

            Intent intent = new Intent(this, googleup.class);
            startActivity(intent);

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if(v==btnchore){

            Intent intent = new Intent(this,Choers.class);
            startActivity(intent);

        }

        if(v==btncalender) {

            Intent intent = new Intent(this, Callender.class);
            startActivity(intent);

        }

        if(v==btncall) {

            Intent intent = new Intent(this, Callender.class);
            startActivity(intent);

        }

        if(v==btnlocation) {

            Intent intent = new Intent(this, Callender.class);
            startActivity(intent);

        }

    }
}
