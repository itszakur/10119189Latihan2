package com.example.a10119189latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
////26 April 2022, 10119173, Reza Kurnia IF5
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void register (View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}