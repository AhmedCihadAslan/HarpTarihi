package com.harptarihimobil.harptarihi;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ScoreFirebaseDatabase {

    private DatabaseReference db;
    private SharedPrefsStorage sharedPrefs;

    public ScoreFirebaseDatabase(Context context) {
        db = FirebaseDatabase.getInstance().getReference("scoreboard").child("scores");
        sharedPrefs = new SharedPrefsStorage(context);
    }

    public void setScore(int score) {
        String username = sharedPrefs.getUsername();

        db.child(username).setValue(score);
    }

}
