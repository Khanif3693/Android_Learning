package com.example.khan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button Signup_button;//Signup button
    private Button Login_button;// Login button



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Loginfunc (View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Login.class);
        startActivity(intent);
    }
    public void Signupfunc (View view)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Register.class);
        startActivity(intent);
    }



}
