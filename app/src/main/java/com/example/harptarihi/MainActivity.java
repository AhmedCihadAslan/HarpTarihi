package com.example.harptarihi;

import androidx.appcompat.app.AppCompatActivity;

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
    Random random;
    int aynısoru;
    int rnd;
    String Sorular [];
    String cevap [];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        random = new Random();
        rnd = random.nextInt(5);

         SoruCevap();



    }

    public void SoruCevap(){



      aynısoru = rnd;

      Sorular  = new String[5];
        Sorular [0] = "kaç yasındasınız";
        Sorular [1] = "Turkıyenın kurucusu kımdır";
        Sorular [2] = "İstanbulu kım fethetmıstır";
        Sorular [3] = "pi sayısı kactır";
        Sorular [4] = "Selcuklunun kurucusu kımdır";

      cevap = new String[] {"12","15","22","23","Osman gazı","Ataturk","Ismet ınonu","Adnan menderes","Fatıh","Metehan","Halıd bın velıd","Tansuhan","3,14","5","6","2,85",
              "Tugrul bey","Nasuh efendı","Aslıcan Hatun","Semrahan"};


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


    public void A(View view){

        aynısoru = rnd;
        rnd = random.nextInt(5);

        if(aynısoru == rnd){

            rnd = random.nextInt(5);
            SoruCevap();

        }else{

            SoruCevap();
        }


        SoruCevap();
    }

    public void B(View view){

        aynısoru = rnd;
        rnd = random.nextInt(5);

        if(aynısoru == rnd){

            rnd = random.nextInt(5);
            SoruCevap();

        }
        else{

            SoruCevap();
        }
    }

    public void C(View view){

        aynısoru = rnd;
        rnd = random.nextInt(5);

        if(aynısoru == rnd){

            rnd = random.nextInt(5);
            SoruCevap();

            //sd
        }
        else{

            SoruCevap();
        }
    }
    public void D(View view){

        aynısoru = rnd;
        rnd = random.nextInt(5);

        if(aynısoru == rnd){

            rnd = random.nextInt(5);
            SoruCevap();

        }
        else{

            SoruCevap();
        }


    }


}