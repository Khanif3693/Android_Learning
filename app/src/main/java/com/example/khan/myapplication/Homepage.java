package com.example.khan.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Homepage extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private Toolbar mtool;
    private ViewPager mviewpager;
    private SectionPagerAdapter mSectionPagerAdapter;
    private TabLayout mtablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        mtool = (Toolbar)findViewById(R.id.appbar);
        setSupportActionBar(mtool);
        getSupportActionBar().setTitle("OSU Messanger");
        mviewpager = (ViewPager)findViewById(R.id.viewpagertabs);
        mSectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        mviewpager.setAdapter(mSectionPagerAdapter);
        mtablayout = (TabLayout) findViewById(R.id.main_tabs);
        mtablayout.setupWithViewPager(mviewpager);

        mAuth = FirebaseAuth.getInstance();
       /* mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
       */



    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
       /* updateUI(currentUser);
        /*mAuth.addAuthStateListener(mAuthListener);*/
        if (currentUser == null) {
            Intent logintintent = new Intent(Homepage.this, Login.class);
            startActivity(logintintent);
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
