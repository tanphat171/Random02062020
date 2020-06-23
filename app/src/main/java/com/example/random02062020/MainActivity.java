package com.example.random02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // public , private, protected, default
        // class, object
        //Builtin function
        //Ham lam tron
        //Ham tron len
        //Ham lam tron xuong
        double c = 5.99;
        double newC = Math.floor(c);
        Log.d("BBB","Ket qua c la: " + newC);
        }

    }



