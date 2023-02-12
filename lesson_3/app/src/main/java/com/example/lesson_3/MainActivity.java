package com.example.lesson_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
findViewById(R.id.open_second).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
});

findViewById(R.id.open_counter).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,CounterActivity.class);
        startActivity(intent);
    }
});
        Log.d("MainAct","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainAct","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainAct","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainAct","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainAct","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainAct","onDestroy");
    }
}