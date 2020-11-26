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
    static int count = 0 ; // 靜態變數  用來計算應用程式有多少物件


    @Override
    protected void onCreate(Bundle savedInstanceState) { // function,函式
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count++; //遞增運算子 : 等於count = count + 1;

        Log.d(TAG, "enter onCreate(). #" + count ); // 3+4, +:運算子  3、4 運算元

    }



    //public MainActivity() {
    //    super();
    //}

    @Override
    protected void onStart() {
        super.onStart();
        // 找到view root，然後設定click監聽
        findViewById(android.R.id.content).setOnClickListener(this);
        Log.d(TAG, "enter onStart(). #" + count );
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "enter onStop(). #" + count );
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Log.d(TAG, "enter onDestroy(). #" + count );
        count--;
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "enter onPause(). #" + count );
        super.onPause();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, "enter onResume(). #" + count );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "enter onRestart(). #" + count );
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case android.R.id.content:
                startActivity(new Intent(this, Bookkeeping.class )); // 建立一個新的Activity

                // 增加過場動畫
                overridePendingTransition(android.R.anim.slide_in_left,
                        android.R.anim.slide_out_right);
                //強迫activity中止
                MainActivity.this.finish();
                break;

        }
    }
}


