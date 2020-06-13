package com.example.eletricafacil.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    private SharedPreferences mSharedPreferences;

    public SecurityPreferences(Context mContext) {
        this.mSharedPreferences = mContext.getSharedPreferences("resultado", Context.MODE_PRIVATE);
    }

    public void storeLampada(String key, double value) {
        this.mSharedPreferences.edit().putString(key, String.valueOf(value)).apply();
    }

    public void storeDisjuntor(String key, int value) {
        this.mSharedPreferences.edit().putInt(key, value).apply();
    }

    public String getStoredLampada(String key) {
        return this.mSharedPreferences.getString(key, "");
    }

    public int getStoredDisjuntor(String key) {
        return this.mSharedPreferences.getInt(key, Integer.parseInt(""));
    }
}
