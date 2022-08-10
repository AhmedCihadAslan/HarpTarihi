package com.harptarihimobil.harptarihi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.harptarihimobil.harptarihi.databinding.ActivityAnaMenuBinding;

public class AnaMenuActivity extends AppCompatActivity {

    private ActivityAnaMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnaMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.imgOyna.setOnClickListener(v -> {
            Intent intent = new Intent(AnaMenuActivity.this, MainActivity.class);
            startActivity(intent);
        });

        binding.imgSiteyeGit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.harptarihi.net/"));
            startActivity(intent);
        });

        binding.imgJokerAl.setOnClickListener(v -> {
            Intent intent = new Intent(AnaMenuActivity.this, SkorTablosuActivity.class);
            startActivity(intent);
        });
    }
}