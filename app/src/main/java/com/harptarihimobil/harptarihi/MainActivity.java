package com.harptarihimobil.harptarihi;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView6;
    AppCompatImageView button;
    AppCompatTextView button1;
    AppCompatTextView button2;
    AppCompatTextView button3;
    AppCompatTextView button4;
    AppCompatImageView button5;
    AppCompatImageView button6;
    AppCompatTextView buttonSiradakiSoru;

    Sorucevaplist liste;
    ArrayList<String> Sorular2;
    ArrayList<String> Cevaplar2;
    ArrayList<String> Dogru;

    Random random;
    Random yarı;
    int aynısoru;
    int rnd;
    int sorularSize;
    int puan;
    int yarısilme;
    int degıssilme;
    int cvpgörsilme;
    int cozulensoru;

    AppCompatImageView imgYanlisCevap;
    AppCompatTextView textYanlisCevapUyari;
    AppCompatImageView textTekrarOyna;
    AppCompatImageView textAnaMenu;
    AppCompatImageView yanlisCevapTitle;

    private InterstitialAd mRewardedInterstitial;
    private InterstitialAd mInterstitialAd;
    private AdRequest adRequest;

    private int interstitialAdCount = 1;

    private MediaPlayer playerYanlis;
    private MediaPlayer playerDogru;

    private ScoreFirebaseDatabase database;
    private SharedPrefsStorage sharedPrefs;

    //**************************************************************************************************

    private CountDownTimer countDownTimer;
    private boolean isRunning = false;
    private ProgressBar progressBarCountdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setRewardedAd();

        database = new ScoreFirebaseDatabase(this);
        sharedPrefs = new SharedPrefsStorage(this);

        liste = new Sorucevaplist();
        Sorular2 = new ArrayList(6);
        Cevaplar2 = new ArrayList();
        Dogru = new ArrayList<>();

        random = new Random();
        yarı = new Random();
        puan = 0;
        buttonSiradakiSoru.setVisibility(View.INVISIBLE);
        liste.SetDogruCevap(Dogru);
        liste.SetSorulistesi(Sorular2);
        liste.SetCevaplistesi(Cevaplar2);
        liste.SoruCevap();
        sorularSize = Sorular2.size();

        rnd = random.nextInt(sorularSize);
        yarısilme = 0;
        cvpgörsilme = 0;
        degıssilme = 0;
        cozulensoru = 0;

        SoruCevap();

        setCountdown();
        startCountdown();
    }

    private void setCountdown() {
        countDownTimer = new CountDownTimer(20000L, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                progressBarCountdown.setProgress((int) (millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                button1.setClickable(false);
                button2.setClickable(false);
                button3.setClickable(false);
                button4.setClickable(false);
                buttonSiradakiSoru.setVisibility(View.INVISIBLE);

                switch (Dogru.get(rnd)) {
                    case "A":
                        button1.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.icon_dogru));
                        break;
                    case "B":
                        button2.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.icon_dogru));
                        break;
                    case "C":
                        button3.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.icon_dogru));
                        break;
                    case "D":
                        button4.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.icon_dogru));
                        break;
                }

                playYanlis();
                titrestir();

                delay();
            }
        };
    }

    private void startCountdown() {
        if (!isRunning) {
            progressBarCountdown.setProgress(20);
            countDownTimer.start();
            isRunning = true;
        }
    }

    private void stopTimer() {
        if (isRunning) {
            countDownTimer.cancel();
            isRunning = false;
        }
    }

    //**************************************************************************************************

    public void SoruCevap() {

        if (aynısoru == rnd) {
            rnd = random.nextInt(sorularSize);
        }
        aynısoru = rnd;

        int i = 0;

        while (i != Sorular2.size() + 1) {

            int a = i * 4;

            if (i == rnd) {

                textView.setText(Sorular2.get(i));

                button1.setText(Cevaplar2.get(a));
                button2.setText(Cevaplar2.get(a + 1));
                button3.setText(Cevaplar2.get(a + 2));
                button4.setText(Cevaplar2.get(a + 3));

                break;


            } else if (i > rnd) {

                i--;

            } else if (i < rnd) {

                i++;


            }

        }
    }

    //**************************************************************************************************

    public void A(View view) {
        buttonSiradakiSoru.setVisibility(View.VISIBLE);

        stopTimer();

        if (Dogru.get(rnd).equals("A")) {
            playDogru();

            button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button6.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button.setClickable(false);
            button5.setClickable(false);

        } else {

            playYanlis();
            titrestir();

            puan -= 10;
            button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            buttonSiradakiSoru.setVisibility(View.INVISIBLE);

            switch (Dogru.get(rnd)) {
                case "D":
                    button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "B":
                    button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "C":
                    button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
            }

            delay();
        }


    }


    //**************************************************************************************************


    public void B(View view) {
        buttonSiradakiSoru.setVisibility(View.VISIBLE);

        stopTimer();

        if (Dogru.get(rnd).equals("B")) {
            playDogru();

            button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button6.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button.setClickable(false);
            button5.setClickable(false);

        } else {
            playYanlis();
            titrestir();

            puan -= 10;
            button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            buttonSiradakiSoru.setVisibility(View.INVISIBLE);

            switch (Dogru.get(rnd)) {
                case "A":
                    button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "D":
                    button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "C":
                    button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
            }

            delay();
        }
    }


    //**********************************************************************************************


    public void C(View view) {
        buttonSiradakiSoru.setVisibility(View.VISIBLE);

        stopTimer();

        if (Dogru.get(rnd).equals("C")) {
            playDogru();

            button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);
            button6.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button.setClickable(false);
            button5.setClickable(false);
        } else {
            playYanlis();
            titrestir();

            puan -= 10;
            button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            buttonSiradakiSoru.setVisibility(View.INVISIBLE);

            switch (Dogru.get(rnd)) {
                case "A":
                    button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "B":
                    button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "D":
                    button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
            }

            delay();
        }
    }


    //**********************************************************************************************


    public void D(View view) {
        buttonSiradakiSoru.setVisibility(View.VISIBLE);

        stopTimer();

        if (Dogru.get(rnd).equals("D")) {
            playDogru();

            button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button6.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button.setClickable(false);
            button5.setClickable(false);
        } else {
            playYanlis();
            titrestir();

            puan -= 10;
            button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            buttonSiradakiSoru.setVisibility(View.INVISIBLE);

            switch (Dogru.get(rnd)) {
                case "A":
                    button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "B":
                    button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
                case "C":
                    button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
                    break;
            }

            delay();
        }
    }

    private void delay() {
        Handler handler = new Handler();
        handler.postDelayed(this::yanlis, 3000);
    }

    //**********************************************************************************************


    public void sıradakısoru(View view) {
        startCountdown();
        showInterstitialAd(interstitialAdCount);

        buttonSiradakiSoru.setVisibility(View.INVISIBLE);

        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (Sorular2.size() == 1) {
            Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
            return;
        }

        button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button.setClickable(true);
        button.setClickable(true);
        button5.setClickable(true);
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button6.setClickable(true);
        button5.setClickable(true);
        liste.SoruCevapSil(rnd);
        sorularSize--;

        if (sorularSize < 1) {
            return;
        }

        aynısoru = rnd;

        rnd = random.nextInt(sorularSize);

        if (aynısoru == rnd) {
            rnd = random.nextInt(sorularSize);
        }


        SoruCevap();
    }

    //**************************************************************************************************

    public void yarıyarıya(View view) {

        yarısilme = 1;

        if (Dogru.get(rnd).equals("A")) {
            button.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);
        }

        if (Dogru.get(rnd).equals("B")) {
            button.setVisibility(View.INVISIBLE);
            button1.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
        }
        if (Dogru.get(rnd).equals("C")) {
            button.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
            button1.setVisibility(View.INVISIBLE);
        }
        if (Dogru.get(rnd).equals("D")) {
            button.setVisibility(View.INVISIBLE);
            button3.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.INVISIBLE);
        }
    }


    public void degıstır(View view) {
        stopTimer();
        startCountdown();

        showInterstitialAd(interstitialAdCount);

        degıssilme = 1;
        buttonSiradakiSoru.setVisibility(View.INVISIBLE);

        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (Sorular2.size() == 1) {
            Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
            return;
        }

        liste.SoruCevapSil(rnd);
        sorularSize--;


        button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));


        aynısoru = rnd;
        rnd = random.nextInt(sorularSize);


        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (aynısoru == rnd) {
            rnd = random.nextInt(sorularSize);
        }

        button5.setVisibility(View.INVISIBLE);
        SoruCevap();

        if (Sorular2.size() == 1) {

            Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
            return;

        }

        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
    }

    public void cevabıgor(View view) {
        stopTimer();

        playDogru();
        //#660099
        cvpgörsilme = 1;
        button6.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        buttonSiradakiSoru.setVisibility(View.VISIBLE);

        if (Dogru.get(rnd).equals("A")) {

            button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);
            button.setClickable(false);
            button5.setClickable(false);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

        }
        if (Dogru.get(rnd).equals("B")) {

            button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);
            button.setClickable(false);
            button5.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

        }
        if (Dogru.get(rnd).equals("C")) {

            button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);
            button.setClickable(false);
            button5.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        }
        if (Dogru.get(rnd).equals("D")) {

            button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);
            button.setClickable(false);
            button5.setClickable(false);
            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        }

    }


    public void anaMenu(View view) {
        showInterstitialAd(10);

        int highScore = sharedPrefs.getHighScore();

        if (puan > highScore) {
            database.setScore(puan);
            sharedPrefs.saveHighScore(puan);
        }

        finish();
    }

    public void devamEt(View view) {
        stopTimer();
        showRewardedInterstitial();
    }

    private void showRewardedInterstitial() {
        if (mRewardedInterstitial != null) {
            setmInterstitialAdListener();
            mRewardedInterstitial.show(this);
        } else {
            loadRewardedInterstitial();
        }
    }

    private void setRewardedAd() {
        MobileAds.initialize(this);
        adRequest = new AdRequest.Builder().build();

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView bannerAdView = findViewById(R.id.adView);
        bannerAdView.loadAd(adRequest);

        AdView bannerAd = new AdView(this);
        bannerAd.setAdSize(AdSize.BANNER);
        bannerAd.setAdUnitId("ca-app-pub-7801799448157966/5481786844");

        loadInterstitialAd();
    }

    private void showInterstitialAd(int count) {
        if (mInterstitialAd != null) {
            if (interstitialAdCount % 10 == 0 || count % 10 == 0) {
                mInterstitialAd.show(this);
                //setmInterstitialAdListener();
            }
            interstitialAdCount++;
        } else loadInterstitialAd();
    }

    private void setmInterstitialAdListener() {
        mRewardedInterstitial.setFullScreenContentCallback(new FullScreenContentCallback() {
            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override
            public void onAdDismissedFullScreenContent() {
                super.onAdDismissedFullScreenContent();
                onRewardedAdFinished();
            }

            @Override
            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                super.onAdFailedToShowFullScreenContent(adError);
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }

            @Override
            public void onAdShowedFullScreenContent() {
                super.onAdShowedFullScreenContent();
            }
        });
    }


    private void loadInterstitialAd() {
        InterstitialAd.load(this, "ca-app-pub-7801799448157966/7693797469", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        //stopTimer();
                        showInterstitialAd(interstitialAdCount);
                        //setmInterstitialAdListener();
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }

    private void loadRewardedInterstitial() {
        InterstitialAd.load(this, "ca-app-pub-7801799448157966/2370739786", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mRewardedInterstitial = interstitialAd;
                        setmInterstitialAdListener();
                        showRewardedInterstitial();
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mRewardedInterstitial = null;
                    }
                });
    }

    private void onRewardedAdFinished() {
        textView.setVisibility(View.VISIBLE);
        button.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        progressBarCountdown.setVisibility(View.VISIBLE);
        buttonSiradakiSoru.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.VISIBLE);

        imgYanlisCevap.setVisibility(View.INVISIBLE);
        textYanlisCevapUyari.setVisibility(View.INVISIBLE);
        textTekrarOyna.setVisibility(View.INVISIBLE);
        textAnaMenu.setVisibility(View.INVISIBLE);
        yanlisCevapTitle.setVisibility(View.INVISIBLE);

        if (yarısilme == 1) {

            button.setVisibility(View.INVISIBLE);

        }
        if (cvpgörsilme == 1) {

            button6.setVisibility(View.INVISIBLE);

        }
        if (degıssilme == 1) {

            button5.setVisibility(View.INVISIBLE);


        }


        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));
        button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.secenek));

        SoruCevap();

        startCountdown();
    }

    private void yanlis() {
        stopTimer();
        textView.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        buttonSiradakiSoru.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);

        imgYanlisCevap.setVisibility(View.VISIBLE);
        textYanlisCevapUyari.setVisibility(View.VISIBLE);
        textTekrarOyna.setVisibility(View.VISIBLE);
        textAnaMenu.setVisibility(View.VISIBLE);
        yanlisCevapTitle.setVisibility(View.VISIBLE);
        progressBarCountdown.setVisibility(View.INVISIBLE);
    }

    public void playYanlis() {
        if (playerYanlis == null) {
            playerYanlis = MediaPlayer.create(this, R.raw.wrong_sound);
            playerYanlis.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayerYanlis();
                }
            });
        }

        playerYanlis.start();
    }

    private void stopPlayerYanlis() {
        if (playerYanlis != null) {
            playerYanlis.release();
            playerYanlis = null;
        }
    }

    public void playDogru() {
        if (playerDogru == null) {
            playerDogru = MediaPlayer.create(this, R.raw.correct_sound);
            playerDogru.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayerYanlis();
                }
            });
        }

        playerDogru.start();
    }

    private void stopPlayerDogru() {
        if (playerDogru != null) {
            playerDogru.release();
            playerDogru = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayerYanlis();
        stopPlayerDogru();
    }

    private void titrestir() {
        Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            vibrator.vibrate(500);
        }
    }


    private void init() {
        textView = findViewById(R.id.textView);

        button = findViewById(R.id.buton_yari_yariya);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.buton_degistir);
        button6 = findViewById(R.id.buton_cevabi_gor);
        buttonSiradakiSoru = findViewById(R.id.button_siradaki_soru);
        textView6 = findViewById(R.id.tv_score);
        imgYanlisCevap = findViewById(R.id.layout_yanlis_cevap_uyari);
        textYanlisCevapUyari = findViewById(R.id.text_view_yanlis_cevap_uyari);
        textTekrarOyna = findViewById(R.id.buton_devam_et);
        textAnaMenu = findViewById(R.id.buton_ana_menu);
        yanlisCevapTitle = findViewById(R.id.text_yanlis_cevap_title);

        progressBarCountdown = findViewById(R.id.progress_horizontal);
    }

    @Override
    protected void onDestroy() {
        stopTimer();
        stopPlayerDogru();
        stopPlayerYanlis();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopTimer();
    }

    @Override
    protected void onResume() {
        super.onResume();
        startCountdown();
    }
}