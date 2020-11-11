package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AsyncActivity extends AppCompatActivity {

    private static final String TAG = AsyncActivity.class.getSimpleName();
    ProgressBar progressBar;
    TextView mBookInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);
        progressBar = findViewById(R.id.progressBar);
        mBookInput = findViewById(R.id.bookinput);
        String queryString = mBookInput.getText().toString();
    }

    public void handleClick(View view) {
        Log.i(TAG,"handleClick");
        //download something from internet
        DownloadTask downloadTask = new DownloadTask(progressBar);
        downloadTask.execute("https://urlForimagetobedownloaded");
        //show the download progress on the progressbar
    }
}