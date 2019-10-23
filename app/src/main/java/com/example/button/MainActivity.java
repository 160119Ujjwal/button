package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.btnabc);
        button2=findViewById(R.id.two);
        button3=findViewById(R.id.three);
        button4=findViewById(R.id.four);
        button5=findViewById(R.id.five);
        button6=findViewById(R.id.six);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.five){
            Intent intent = new Intent(this, table.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.six){
            Intent intent = new Intent(this, frame_layout.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.four){
            Intent intent = new Intent(this, constraint.class);
            startActivity(intent);
        }

    }
}
