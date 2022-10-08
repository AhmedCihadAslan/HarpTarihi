package com.harptarihimobil.harptarihi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.harptarihimobil.harptarihi.databinding.ActivityAnaMenuBinding;

public class AnaMenuActivity extends AppCompatActivity {

    private ActivityAnaMenuBinding binding;
    public AdRequest adRequest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnaMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MobileAds.initialize(this);
        adRequest2 = new AdRequest.Builder().build();

        AdView bannerAdView2 = findViewById(R.id.adView2);
        bannerAdView2.loadAd(adRequest2);

        AdView bannerAd = new AdView(this);
        bannerAd.setAdSize(AdSize.BANNER);
        bannerAd.setAdUnitId("ca-app-pub-7801799448157966/7895465335");


        binding.imgOyna.setOnClickListener(v -> {
            Intent intent = new Intent(AnaMenuActivity.this, MainActivity.class);
            startActivity(intent);
        });

        binding.imgSiteyeGit.setOnClickListener(v -> {
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.harptarihi.net/"));
//            startActivity(intent);
            Toast.makeText(this, "Çok yakında sizlerle.", Toast.LENGTH_SHORT).show();
        });

        binding.imgJokerAl.setOnClickListener(v -> {
            Intent intent = new Intent(AnaMenuActivity.this, SkorTablosuActivity.class);
            startActivity(intent);
        });
    }
}