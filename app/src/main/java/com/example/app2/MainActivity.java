package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickevent(View view) {
        Log.e(TAG,"clickevent");
        Intent hintent = new Intent(MainActivity.this,HomeActivity.class);
        hintent.putExtra("name","viswa");
        startActivity(hintent);
    }
}