package com.example.harptarihi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    Sorularvecevaplar cagır;

    Random random;
    int aynısoru;
    int rnd;
    String Sorular [];
    String cevap [];

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

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

         cagır = new Sorularvecevaplar();


        random = new Random();
        rnd = random.nextInt(6);

            SoruCevap();



    }

    //**************************************************************************************************

    public void SoruCevap(){


     Sorular  = new String[6];
      cevap = new String [24];


        cagır.SetCevaplar(cevap);
        cagır.SetSorular(Sorular);

        cagır.SorularveCevaplar();


        if(aynısoru == rnd) {

            rnd = random.nextInt(6);
        }

        aynısoru = rnd;


      int i = 0;


      while (i != Sorular.length+1){

          int a = i*4;

           if(i == rnd){

             textView.setText(Sorular[i]);

              textView2.setText(cevap[a]);
              textView3.setText(cevap[a+1]);
              textView4.setText(cevap[a+2]);
              textView5.setText(cevap[a+3]);

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

        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if(aynısoru == rnd){

            rnd = random.nextInt(6);
            SoruCevap();

        }else{

            SoruCevap();
        }



    }


    //**************************************************************************************************


    public void B(View view){

        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if(aynısoru == rnd){

            rnd = random.nextInt(6);
            SoruCevap();

        }
        else{

            SoruCevap();
        }
    }


    //**************************************************************************************************


    public void C(View view){

        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if(aynısoru == rnd){

            rnd = random.nextInt(6);
            SoruCevap();


        }
        else{

            SoruCevap();
        }
    }


    //**************************************************************************************************


    public void D(View view){

        aynısoru = rnd;
        rnd = random.nextInt(6);

        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if(aynısoru == rnd){

            rnd = random.nextInt(6);
            SoruCevap();

        }
        else{

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

        aynısoru = rnd;
        rnd = random.nextInt(6);
        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        if(aynısoru == rnd){

            rnd = random.nextInt(6);
            SoruCevap();

            button5.setVisibility(View.INVISIBLE);

        }
        else{

            SoruCevap();
            button5.setVisibility(View.INVISIBLE);

        }



    }

    public void cevabıgor(View view){


        button4.setBackgroundColor(Color.parseColor("#66CC33"));
        button6.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);


    }






}