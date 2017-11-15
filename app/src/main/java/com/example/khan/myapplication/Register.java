package com.example.khan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

    }
    public void sendtomain (View view)
    {
        Intent intent = new Intent();
        intent.setClass(Register.this, MainActivity.class);
        startActivity(intent);
    }

}
