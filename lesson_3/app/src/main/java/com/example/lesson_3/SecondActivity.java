package com.example.lesson_3;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainAct2","onCreate");
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainAct2","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainAct2","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainAct2","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainAct2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainAct2","onDestroy");
    }
}
