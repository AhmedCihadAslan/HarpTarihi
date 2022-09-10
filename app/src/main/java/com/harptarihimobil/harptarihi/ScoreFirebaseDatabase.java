package com.harptarihimobil.harptarihi;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

        db.child(username).setValue(score).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Log.d("TAG", "onSuccess: ");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("TAG", "onFailure: " + e);
            }
        });
    }


}
