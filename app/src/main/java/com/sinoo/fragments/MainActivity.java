package com.sinoo.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFirst, btnSecond;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst = findViewById(R.id.button_first);
        btnSecond = findViewById(R.id.button_second);

        btnFirst.setOnClickListener(view -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.fragment_layout, firstFragment);
            fragmentTransaction.commit();
        });

        btnSecond.setOnClickListener(view -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.fragment_layout, secondFragment);
            fragmentTransaction.commit();
        });
    }


}