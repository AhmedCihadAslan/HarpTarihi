package com.example.harptarihi;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    Sorucevaplist liste;
    //Sorularvecevaplar cagır;
    ArrayList<String> Sorular2;
    ArrayList<String> Cevaplar2;
    ArrayList<String> Dogru;

    Random random;
    int aynısoru;
    int rnd;
    String Sorular[];
    String cevap[];
    int sorularSize;
    int puan;

    //**************************************************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        //cagır = new Sorularvecevaplar();
        button1.setBackgroundColor(Color.parseColor("#8000bf"));
        button2.setBackgroundColor(Color.parseColor("#8000bf"));
        button3.setBackgroundColor(Color.parseColor("#8000bf"));
        button4.setBackgroundColor(Color.parseColor("#8000bf"));

        liste = new Sorucevaplist();
        Sorular2 = new ArrayList(6);
        Cevaplar2 = new ArrayList();
        Dogru = new ArrayList<>();

        random = new Random();
        puan = 0;

        liste.SetDogruCevap(Dogru);
        liste.SetSorulistesi(Sorular2);
        liste.SetCevaplistesi(Cevaplar2);
        liste.SoruCevap();
        sorularSize = Sorular2.size();

        rnd = random.nextInt(sorularSize);

        SoruCevap();

    }

    //**************************************************************************************************

    public void SoruCevap() {


      /* Sorular  = new String[6];
      cevap = new String [24];


        cagır.SetCevaplar(cevap);
        cagır.SetSorular(Sorular);

        cagır.SorularveCevaplar();  */


        if (aynısoru == rnd) {

            rnd = random.nextInt(sorularSize);

        }

        aynısoru = rnd;

        int i = 0;


        while (i != Sorular2.size() + 1) {

            int a = i * 4;

            if (i == rnd) {

                textView.setText(Sorular2.get(i));

                textView2.setText(Cevaplar2.get(a));
                textView3.setText(Cevaplar2.get(a + 1));
                textView4.setText(Cevaplar2.get(a + 2));
                textView5.setText(Cevaplar2.get(a + 3));

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
        if (Dogru.get(rnd).equals("A")) {

            button1.setBackgroundColor(Color.parseColor("#00a000"));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

        }
    }


    //**************************************************************************************************


    public void B(View view) {
        if (Dogru.get(rnd).equals("B")) {

            button2.setBackgroundColor(Color.parseColor("#00a000"));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

        }
    }


    //**********************************************************************************************


    public void C(View view) {
        if (Dogru.get(rnd).equals("C")) {

            button3.setBackgroundColor(Color.parseColor("#00a000"));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        }
    }


    //**********************************************************************************************


    public void D(View view) {
        if (Dogru.get(rnd).equals("D")) {

            button4.setBackgroundColor(Color.parseColor("#00a000"));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        }

    }

    //**********************************************************************************************


    public void sıradakısoru(View view) {
        if (Sorular2.size() == 1) {
            Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
            return;
        }

        button1.setBackgroundColor(Color.parseColor("#8000bf"));
        button2.setBackgroundColor(Color.parseColor("#8000bf"));
        button3.setBackgroundColor(Color.parseColor("#8000bf"));
        button4.setBackgroundColor(Color.parseColor("#8000bf"));

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);

        liste.SoruCevapSil(rnd);
        sorularSize--;

        if(sorularSize < 1) {
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
        button.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
    }


    public void degıstır(View view) {
        if (Sorular2.size() == 1) {
            Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
            return;
        }

        liste.SoruCevapSil(rnd);
        sorularSize--;


        button1.setBackgroundColor(Color.parseColor("#8000bf"));
        button2.setBackgroundColor(Color.parseColor("#8000bf"));
        button3.setBackgroundColor(Color.parseColor("#8000bf"));
        button4.setBackgroundColor(Color.parseColor("#8000bf"));


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

        //#660099
        button4.setBackgroundColor(Color.parseColor("#66CC33"));
        button6.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);


    }


}