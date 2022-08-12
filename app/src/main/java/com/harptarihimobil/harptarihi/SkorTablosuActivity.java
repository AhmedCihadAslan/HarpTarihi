package com.harptarihimobil.harptarihi;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.harptarihimobil.harptarihi.databinding.ActivitySkorTablosuBinding;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SkorTablosuActivity extends AppCompatActivity {

    private ActivitySkorTablosuBinding binding;

    private ScoreFirebaseDatabase database;
    private SharedPrefsStorage sharedPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySkorTablosuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = new ScoreFirebaseDatabase(this);
        sharedPrefs = new SharedPrefsStorage(this);

        if (sharedPrefs.getHighScore() != -1) {
            binding.tvEnYuksekPuan.setText(sharedPrefs.getHighScore() + " Puan");
        }

        getHighScores();
    }

    private void getHighScores() {
        database.getDb().addListenerForSingleValueEvent(new ValueEventListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                TreeMap<String, Integer> items = new TreeMap<>();
                for (DataSnapshot dsp : dataSnapshot.getChildren()) {
                    items.put(String.valueOf(dsp.getKey()), dsp.getValue(Integer.class));
                }

                Map<String, Integer> items2 = sortByValue(items);

                setHighScores(items2);
            }

            @Override
            public void onCancelled(DatabaseError firebaseError) {

            }
        });
    }

    public void geriDon(View view) {
        finish();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void setHighScores(Map<String, Integer> items) {
        int index = 1;

        for (Map.Entry<String, Integer> set : items.entrySet()) {
            switch (index) {
                case 1: {
                    binding.puan1.setText(set.getKey() + ": \t\t\t" + set.getValue());
                    break;
                }
                case 2: {
                    binding.puan2.setText(set.getKey() + ": \t\t\t" + set.getValue());
                    break;
                }
                case 3: {
                    binding.puan3.setText(set.getKey() + ": \t\t\t" + set.getValue());
                    break;
                }
                case 4: {
                    binding.puan4.setText(set.getKey() + ": \t\t\t" + set.getValue());
                    break;
                }
                case 5: {
                    binding.puan5.setText(set.getKey() + ": \t\t\t" + set.getValue());
                    break;
                }
            }
            index++;
        }
    }


    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable<V>) ((Map.Entry<K, V>) (o2)).getValue()).compareTo(((Map.Entry<K, V>) (o1)).getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}