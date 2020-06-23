package com.example.random02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;


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
        //Ham random
        //random tu 0 -> 5 so le
        //double valueRandom = Math.random() * 5;
        //Log.d("BBB","Gia tri random la " + valueRandom);

        //random tu 0 -> 5 so nguyen
        //Random random = new Random();
        //for (int i = 0; i < 100 ; i++) {
          //  int value = random.nextInt(5);
            //Log.d("BBB", value + "");
       // }
        //random tu 0 -> 15 so nguyen
        Random random = new Random();
        for (int i = 0; i < 100 ; i++) {
            // so max -  so min + 1 (vi tu từ 5 den 15 thi lay 15 - 5 +1)
         int value = random.nextInt(15 - 5 + 1) + 5;
        Log.d("BBB", value + "");
        }
    }
}


