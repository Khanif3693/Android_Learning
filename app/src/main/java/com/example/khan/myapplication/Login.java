package com.example.khan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

     };




    public void sendtohomepage (View view)
    {
        Intent intent = new Intent();
        intent.setClass(Login.this, Homepage.class);
        startActivity(intent);
    }

    public void sendtomain (View view)
    {
        Intent intent = new Intent();
        intent.setClass(Login.this, MainActivity.class);
        startActivity(intent);
    }


}
