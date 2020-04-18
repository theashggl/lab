package com.database.lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b1=(Button)findViewById(R.id.a2);
b2=(Button)findViewById(R.id.a3);
b3=(Button)findViewById(R.id.a4);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i1=new Intent(MainActivity.this,A2.class);
        startActivity(i1);
    }
});
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i2=new Intent(MainActivity.this,A3.class);
    startActivity(i2);
    }
});
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i3=new Intent(MainActivity.this,A4.class);
        startActivity(i3);
    }
});
}}