package com.example.lesson_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    private static final String KEY_COUNTER = "counter";
    private Counter counter;

    private TextView counterTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        counterTxt = findViewById(R.id.counter);
        if (savedInstanceState != null) {
            counter =  savedInstanceState.getParcelable(KEY_COUNTER);
            Log.d("CounterAct", "onCreate recreate");
        } else {
            counter = new Counter();
            Log.d("CounterAct", "onCreate first time");
        }
        showResult();
        findViewById(R.id.increase).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter.increase();

                showResult();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putParcelable(KEY_COUNTER, counter);
        super.onSaveInstanceState(outState);

        Log.d("CounterAct", "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter =  savedInstanceState.getParcelable(KEY_COUNTER);
        Log.d("CounterAct", "onRestoreInstanceState");
    }

    private void showResult() {
        counterTxt.setText(String.valueOf(counter.getValue()));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CounterAct", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CounterAct", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CounterAct", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CounterAct", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CounterAct", "onDestroy");
    }
}