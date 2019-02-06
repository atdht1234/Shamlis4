package com.example.android.shamlis4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Code extends AppCompatActivity implements View.OnClickListener {

    TextView code;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        code = findViewById(R.id.code);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        int x =(int) (Math.random()*100001)+1;

        code.setText(x);
    }

    @Override
    public void onClick(View view) {
        if(view == button){
            Intent intent = new Intent(this,Lobi.class);
            startActivity(intent);
        }
    }
}
