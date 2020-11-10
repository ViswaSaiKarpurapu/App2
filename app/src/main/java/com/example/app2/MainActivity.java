package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickevent(View view) {
        switch (view.getId()){
            case R.id.button:
                   startHome();
                   break;
            case R.id.button2:
                    Intent dintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://srivasaviengg.ac.in/"));
                    startActivity(dintent);
        }

    }

    private void startHome() {

        Log.e(TAG,"clickevent");
        Intent hintent = new Intent(MainActivity.this, HomeActivity.class);
        hintent.putExtra("name","viswa");
        startActivity(hintent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }
}