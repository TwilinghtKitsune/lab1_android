package com.example.myapplicationohonor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private int bck = R.drawable.bk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView txtName = (TextView)findViewById(R.id.textView6);
        TextView txtAge = (TextView)findViewById(R.id.textView8);
        TextView txtGender = (TextView)findViewById(R.id.textView10);
        Bundle arguments = getIntent().getExtras();
        txtName.setText(arguments.get("name").toString());
        txtAge.setText(arguments.get("age").toString());
        txtGender.setText(arguments.get("gender").toString());
    }

    public void background(View view){
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        if(bck == R.drawable.bk){
            layout.setBackgroundResource(R.drawable.bk2);
            bck = R.drawable.bk2;
        }
        else{
            layout.setBackgroundResource(R.drawable.bk);
            bck = R.drawable.bk;
        }
    }

    public void send(View view){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}