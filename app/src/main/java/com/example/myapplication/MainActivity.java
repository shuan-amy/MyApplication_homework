package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//              類別名稱     延伸 (MainActivity  繼承 AppCompatActivity )
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = this.getClass().getSimpleName();  // 常數(不會變)

    // 類別  參照

    //Button bt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "enter onCreate()");

    }



    //public MainActivity() {
    //    super();
    //}

    @Override
    protected void onStart() {
        super.onStart();
        // 找到view root，然後設定click監聽
        findViewById(android.R.id.content).setOnClickListener(this);
        Log.d(TAG, "enter onStart()");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop()");
        super.onStop();
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
        switch(v.getId()){
            case android.R.id.content:
                startActivity(new Intent(this, Bookkeeping.class ));

                // 增加過場動畫
                overridePendingTransition(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                //強迫activity中止
                MainActivity.this.finish();

        }
    }
}


