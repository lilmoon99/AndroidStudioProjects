package com.example.lesson_3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Counter implements Parcelable {
    private int value;
    private double doubleValue;

    public Counter() {

    }

    protected Counter(Parcel in) {
        value = in.readInt();
        doubleValue = in.readDouble();
    }

    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

    public void increase(){
        value++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(value);
        dest.writeDouble(doubleValue);
    }
}
