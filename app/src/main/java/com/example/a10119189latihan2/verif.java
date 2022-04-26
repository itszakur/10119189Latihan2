package com.example.a10119189latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
////26 April 2022, 10119189 IF5
public class verif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verif);
    }

    public void verifyCode (View view) {
        Intent intent = new Intent(this, verify_code.class);
        startActivity(intent);
    }
}
