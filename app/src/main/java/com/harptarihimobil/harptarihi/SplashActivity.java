package com.harptarihimobil.harptarihi;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.harptarihimobil.harptarihi.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        check();
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void retry(View view) {
        binding.imgLogo.setVisibility(View.VISIBLE);
        binding.buttonRetry.setVisibility(View.GONE);
        binding.textViewNoInternetUyari.setVisibility(View.GONE);
        binding.noInternetRoot.setVisibility(View.GONE);

        check();
    }

    private void check() {
        new Handler().postDelayed(() -> {
            if (!isNetworkAvailable()) {
                binding.buttonRetry.setVisibility(View.VISIBLE);
                binding.textViewNoInternetUyari.setVisibility(View.VISIBLE);
                binding.noInternetRoot.setVisibility(View.VISIBLE);
                binding.imgLogo.setVisibility(View.GONE);
            } else {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, 3000L);
    }
}