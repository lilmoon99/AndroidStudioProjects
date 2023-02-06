package com.example.lesson_1_homework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CalendarView myCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        code for edit_text_layout
//        setContentView(R.layout.edit_text_layout);

//        code for activity_main
        setContentView(R.layout.activity_main);
        myCalendar = findViewById(R.id.calendar);
        myCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), "Год: " + year + "\n"  +
                        "Месяц:" + (month +1) + "\n" +
                        "День:" + dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });
    }
}