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
        //Ham so sanh
        int a = 5;
        int b = 6;
        int solonnhat = Math.max(a, b);
        int sonhonhat = Math.min(a, b);
        Log.d("BBB", "So lon nhat la " + solonnhat);
        Log.d("BBB", "So nho nhat la " + sonhonhat);

    }
}


