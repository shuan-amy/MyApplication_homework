package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//              類別名稱     延伸 (MainActivity  繼承 AppCompatActivity )
public class Bookkeeping extends AppCompatActivity implements View.OnClickListener {
    final String TAG = this.getClass().getSimpleName();  // 常數(不會變)

    // 類別  參照
    TextView theDate , theTime ;
    //Button bt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookkeeping_contraintlayout);

        Log.d(TAG, "enter onCreate()");
        uiInit();
    }

    private void uiInit() {
        theDate = findViewById(R.id.textView6);
        theTime = findViewById(R.id.textView7);
    }

    //public MainActivity() {
    //    super();
    // }

    @Override
    protected void onStart() {
        super.onStart();
        varInit();
        setUiListener();
        Log.d(TAG, "enter onStart()");
    }

    private void setUiListener() {
        theDate.setOnClickListener(this);
        theTime.setOnClickListener(this);
    }

    private void varInit() {
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop()");
        releaseUiListener();
        super.onStop();
    }

    private void releaseUiListener() {
        theDate.setOnClickListener(null);
        theTime.setOnClickListener(null);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "enter onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "enter onPause()");
        super.onPause();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, "enter onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "enter onRestart()");
    }

    @Override
    public void onClick(View v) {

    }
}


