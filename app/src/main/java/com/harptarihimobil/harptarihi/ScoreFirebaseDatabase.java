package com.harptarihimobil.harptarihi;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ScoreFirebaseDatabase {

    private DatabaseReference db;
    private SharedPrefsStorage sharedPrefs;

    public ScoreFirebaseDatabase(Context context) {
        db = FirebaseDatabase.getInstance().getReference("scoreboard").child("scores");
        sharedPrefs = new SharedPrefsStorage(context);
    }

    public DatabaseReference getDb() {
        return db;
    }

    public void setScore(int score) {
        String username = sharedPrefs.getUsername();

        db.child(username).setValue(score);
    }


}
