package com.example.a10119189latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

//Reza Kurnia IF5 10119189, 26 APRIL 2022
public class register extends AppCompatActivity {

    private RadioGroup genderGroup;
    private RadioButton gender;
    private Spinner blood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        blood = (Spinner) findViewById(R.id.bloodType);
    }

    public void onClick(View v){
        int selectedId = genderGroup.getCheckedRadioButtonId();

        gender = (RadioButton) findViewById(selectedId);
    }

    public void listBlood(View view){
        Toast.makeText(register.this,"Selected"+blood.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }


    public void back(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void register(View v){
        Intent intent = new Intent(this, verif.class);
        startActivity(intent);
    }
}