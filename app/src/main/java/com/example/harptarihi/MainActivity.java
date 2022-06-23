package com.example.harptarihi;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

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
    AppCompatTextView button7;

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

    AppCompatImageView imgYanlisCevap;
    AppCompatTextView textYanlisCevapUyari;
    AppCompatImageView textTekrarOyna;
    AppCompatImageView textAnaMenu;
    AppCompatImageView yanlisCevapTitle;


    //**************************************************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.buton_yari_yariya);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.buton_degistir);
        button6 = findViewById(R.id.buton_cevabi_gor);
        button7 = findViewById(R.id.button_siradaki_soru);
        textView6 = findViewById(R.id.tv_score);
        imgYanlisCevap = findViewById(R.id.layout_yanlis_cevap_uyari);
        textYanlisCevapUyari = findViewById(R.id.text_view_yanlis_cevap_uyari);
        textTekrarOyna = findViewById(R.id.buton_devam_et);
        textAnaMenu = findViewById(R.id.buton_ana_menu);
        yanlisCevapTitle = findViewById(R.id.text_yanlis_cevap_title);

        liste = new Sorucevaplist();
        Sorular2 = new ArrayList(6);
        Cevaplar2 = new ArrayList();
        Dogru = new ArrayList<>();

        random = new Random();
        yarı = new Random();
        puan = 0;
        button7.setVisibility(View.INVISIBLE);
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

        button7.setVisibility(View.VISIBLE);

        if (Dogru.get(rnd).equals("A")) {

            button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

        } else {

            puan -= 10;
            button1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

            yanlis();
        }


    }


    //**************************************************************************************************


    public void B(View view) {

        button7.setVisibility(View.VISIBLE);

        if (Dogru.get(rnd).equals("B")) {

            button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

        } else {

            puan -= 10;
            button2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

            yanlis();
        }
    }


    //**********************************************************************************************


    public void C(View view) {

        button7.setVisibility(View.VISIBLE);

        if (Dogru.get(rnd).equals("C")) {

            button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        } else {

            puan -= 10;
            button3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

            yanlis();
        }
    }


    //**********************************************************************************************


    public void D(View view) {
        button7.setVisibility(View.VISIBLE);

        if (Dogru.get(rnd).equals("D")) {

            button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_dogru));
            puan += 10;

            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
        } else {

            puan -= 10;
            button4.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.icon_yanlis));
            textView6.setText("PUAN:" + puan);

            button1.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);

            yanlis();
        }
    }

    private void yanlis() {
        textView.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);

        imgYanlisCevap.setVisibility(View.VISIBLE);
        textYanlisCevapUyari.setVisibility(View.VISIBLE);
        textTekrarOyna.setVisibility(View.VISIBLE);
        textAnaMenu.setVisibility(View.VISIBLE);
        yanlisCevapTitle.setVisibility(View.VISIBLE);
        //aa
    }

    //**********************************************************************************************


    public void sıradakısoru(View view) {
        button7.setVisibility(View.INVISIBLE);

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
        button5.setClickable(true);
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);

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

        button7.setVisibility(View.INVISIBLE);

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
        //#660099
        button6.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);

        button7.setVisibility(View.VISIBLE);

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
        finish();
    }

    public void devamEt(View view) {
        recreate();
    }
}