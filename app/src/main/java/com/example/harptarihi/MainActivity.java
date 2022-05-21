package com.example.harptarihi;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity{


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

    Random random;
    int aynısoru;
    int rnd;
    String Sorular [];
    String cevap [];
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
        random = new Random();
        puan = 0;

        liste.SetSorulistesi(Sorular2);
        liste.SetCevaplistesi(Cevaplar2);
        liste.SoruCevap();
        sorularSize = Sorular2.size();

        rnd = random.nextInt(sorularSize);

        SoruCevap();

    }

    //**************************************************************************************************

    public void SoruCevap(){


      /* Sorular  = new String[6];
      cevap = new String [24];


        cagır.SetCevaplar(cevap);
        cagır.SetSorular(Sorular);

        cagır.SorularveCevaplar();  */

        button3.setClickable(true);

        if(aynısoru == rnd){

            rnd = random.nextInt(sorularSize);

        }

        aynısoru = rnd;

        int i = 0;


      while (i != Sorular2.size()+1){

          int a = i*4;

           if(i == rnd){

             textView.setText(Sorular2.get(i));

              textView2.setText(Cevaplar2.get(a));
              textView3.setText(Cevaplar2.get(a+1));
              textView4.setText(Cevaplar2.get(a+2));
              textView5.setText(Cevaplar2.get(a+3));

              break;


          }

          else if(i > rnd){

              i--;

          }
          else if (i < rnd){

              i++;


          }

      }
    }



    //**************************************************************************************************


    public void A(View view){







    }


    //**************************************************************************************************


    public void B(View view){





    }


    //**********************************************************************************************


    public void C(View view){


        if(Sorular2.get(0) == "Meskûkât bilimi neye denir?" && rnd == 0){

            puan += 10;

            textView6.setText("PUAN:"+puan);
            button3.setBackgroundColor(Color.parseColor("#00a000"));



        }

        button3.setClickable(false);


    }


    //**********************************************************************************************


    public void D(View view){




    }

    //**********************************************************************************************


    public void sıradakısoru(View view){



        button1.setBackgroundColor(Color.parseColor("#8000bf"));
        button2.setBackgroundColor(Color.parseColor("#8000bf"));
        button3.setBackgroundColor(Color.parseColor("#8000bf"));
        button4.setBackgroundColor(Color.parseColor("#8000bf"));

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);


        button3.setClickable(true);

        if(Sorular2.size() == 1) {

            Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
            return;

        }

        liste.SoruCevapSil(rnd);
        sorularSize--;

        aynısoru = rnd;
        rnd = random.nextInt(sorularSize);

        if(aynısoru == rnd){

            rnd = random.nextInt(sorularSize);

            SoruCevap();

        }else{

            SoruCevap();
        }



    }


    //**************************************************************************************************



    public void yarıyarıya(View view){


            button.setVisibility(View.INVISIBLE);
            button1.setVisibility(View.INVISIBLE);
            button4.setVisibility(View.INVISIBLE);



    }


    public void degıstır(View view){


        button1.setBackgroundColor(Color.parseColor("#8000bf"));
        button2.setBackgroundColor(Color.parseColor("#8000bf"));
        button3.setBackgroundColor(Color.parseColor("#8000bf"));
        button4.setBackgroundColor(Color.parseColor("#8000bf"));

        button3.setClickable(true);

        aynısoru = rnd;
        rnd = random.nextInt(sorularSize);


        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if(aynısoru == rnd){


            rnd = random.nextInt(sorularSize);
            button5.setVisibility(View.INVISIBLE);
            SoruCevap();

            if(Sorular2.size() == 1) {

                Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
                return;

            }

            liste.SoruCevapSil(rnd);
            sorularSize--;

        }
        else{

            button5.setVisibility(View.INVISIBLE);
            SoruCevap();

            if(Sorular2.size() == 1) {

                Toast.makeText(this, "Sorular bitti", Toast.LENGTH_SHORT).show();
                return;

            }

            liste.SoruCevapSil(rnd);
            sorularSize--;

        }



    }

    public void cevabıgor(View view){

        //#660099
        button4.setBackgroundColor(Color.parseColor("#66CC33"));
        button6.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);


    }






}