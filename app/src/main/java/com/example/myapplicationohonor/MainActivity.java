package com.example.myapplicationohonor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear(View view){
        TextView txtName = (TextView)findViewById(R.id.editTextTextPersonName);
        TextView txtAge = (TextView)findViewById(R.id.editTextTextPersonName2);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio);
        txtName.setText("");
        txtAge.setText("");
        radioGroup.clearCheck();
    }

    public void send(View view){
        TextView txtName = (TextView)findViewById(R.id.editTextTextPersonName);
        TextView txtAge = (TextView)findViewById(R.id.editTextTextPersonName2);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio);
        RadioButton radioButton = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("name", txtName.getText());
        intent.putExtra("age", txtAge.getText());
        intent.putExtra("gender", radioButton.getText());
        startActivity(intent);
    }
}