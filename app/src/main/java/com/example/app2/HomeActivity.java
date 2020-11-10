package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG,"oncreate");
        //get intent
        Intent intent = getIntent();
        //from intent get extras
        Bundle extras = intent.getExtras();
        //from extras get the string with key=name
        String data = extras.getString("name");
        //putting data
        TextView resTextView = findViewById(R.id.button2);
        resTextView.setText(data);
    }
}