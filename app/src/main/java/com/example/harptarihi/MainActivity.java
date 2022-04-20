package com.example.harptarihi;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private AppCompatImageView butonYariYariya;
    private AppCompatTextView button1;
    private AppCompatTextView button2;
    private AppCompatTextView button3;
    private AppCompatTextView button4;
    private AppCompatImageView butonDegistir;
    private AppCompatImageView butonCevabiGor;

    private Sorularvecevaplar cagır;

    private Random random;
    private int aynısoru;
    private int rnd;
    private String Sorular[];
    private String cevap[];

    //**************************************************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        SoruCevap();
    }

    //**************************************************************************************************

    public void SoruCevap() {
        Sorular = new String[6];
        cevap = new String[24];

        cagır.SetCevaplar(cevap);
        cagır.SetSorular(Sorular);

        cagır.SorularveCevaplar();

        if (aynısoru == rnd) {
            rnd = random.nextInt(6);
        }

        aynısoru = rnd;


        int i = 0;

        while (i != Sorular.length + 1) {

            int a = i * 4;

            if (i == rnd) {

                textView.setText(Sorular[i]);

                button1.setText(cevap[a]);
                button2.setText(cevap[a + 1]);
                button3.setText(cevap[a + 2]);
                button4.setText(cevap[a + 3]);

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
        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (aynısoru == rnd) {
            rnd = random.nextInt(6);
        }

        SoruCevap();
    }


    //**************************************************************************************************


    public void B(View view) {

        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (aynısoru == rnd) {
            rnd = random.nextInt(6);
        }

        SoruCevap();
    }


    //**************************************************************************************************


    public void C(View view) {
        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (aynısoru == rnd) {
            rnd = random.nextInt(6);
        }

        SoruCevap();
    }


    //**************************************************************************************************


    public void D(View view) {
        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (aynısoru == rnd) {
            rnd = random.nextInt(6);
        }
        SoruCevap();
    }


    //**************************************************************************************************


    public void yarıyarıya(View view) {
        butonYariYariya.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
    }


    public void degıstır(View view) {
        aynısoru = rnd;
        rnd = random.nextInt(6);
        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if (aynısoru == rnd) {
            rnd = random.nextInt(6);
        }

        SoruCevap();
        butonDegistir.setVisibility(View.INVISIBLE);
    }

    public void cevabıgor(View view) {
        button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
        butonCevabiGor.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
    }

    private void setViews() {
        textView = findViewById(R.id.textView);

        butonYariYariya = findViewById(R.id.buton_yari_yariya);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        butonDegistir = findViewById(R.id.buton_degistir);
        butonCevabiGor = findViewById(R.id.buton_cevabi_gor);

        cagır = new Sorularvecevaplar();

        random = new Random();
        rnd = random.nextInt(6);
    }

}