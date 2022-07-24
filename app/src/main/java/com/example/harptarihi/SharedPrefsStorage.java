package com.example.harptarihi;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsStorage {

    private SharedPreferences sharedPreferences;

    public SharedPrefsStorage(Context context) {
        sharedPreferences = context.getSharedPreferences("sharedprefs", Context.MODE_PRIVATE);
    }

    public void saveUsername(String username) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.apply();
    }

    public String getUsername() {
        return sharedPreferences.getString("username", "");
    }

}
