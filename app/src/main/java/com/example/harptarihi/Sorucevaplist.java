package com.example.harptarihi;

import java.util.ArrayList;

public class Sorucevaplist {

    ArrayList <String> Sorulistesi;
    ArrayList <String> Cevaplistesi;


    public  void SetSorulistesi (ArrayList <String> sorulistesi){

        this.Sorulistesi = sorulistesi;

    }

    public ArrayList <String> GetSorulistesi(){

        return  Sorulistesi;


    }



    public  void SetCevaplistesi (ArrayList <String> cevaplistesi){

        this.Cevaplistesi = cevaplistesi;

    }

    public ArrayList <String> GetCevaplistesi(){

        return  Cevaplistesi;


    }

    public void SoruCevapSil(int a){

        Sorulistesi.remove(a);
        Cevaplistesi.remove((a*4)+3);
        Cevaplistesi.remove((a*4)+2);
        Cevaplistesi.remove((a*4)+1);
        Cevaplistesi.remove(a*4);


    }

    public void SoruCevap(){

        Sorulistesi.add("Meskûkât bilimi neye denir?");

        Cevaplistesi.add("Savaş Bilimi");
        Cevaplistesi.add("Irk Bilimi");
        Cevaplistesi.add("Para Bilimi");
        Cevaplistesi.add("Doğa Bilimi");



        Sorulistesi.add("Melikşah adına düzenlenen takvim hangisidir?");

        Cevaplistesi.add("Kameri Takvim");
        Cevaplistesi.add("Rumi Takvim");
        Cevaplistesi.add("Hicri Takvim");
        Cevaplistesi.add("Miladi Takvim");


        Sorulistesi.add("İstanbulu kım fethetmıstır?");

        Cevaplistesi.add("Fatıh");
        Cevaplistesi.add("Osman");
        Cevaplistesi.add("Süleyman");
        Cevaplistesi.add("Ali");


        Sorulistesi.add("Armaları ve simgeleri inceleyen bilimin adı nedir?");

        Cevaplistesi.add("Epigrafi");
        Cevaplistesi.add("Heraldik");
        Cevaplistesi.add("Toponomi");
        Cevaplistesi.add("Paleografya");


        Sorulistesi.add("Hititlerde önemli devlet meselelerinin görüşüldüğü meclise ne denir?");

        Cevaplistesi.add("Rizale");
        Cevaplistesi.add("Pankuş");
        Cevaplistesi.add("Fericat");
        Cevaplistesi.add("Surrak");



        Sorulistesi.add("Hicaz Demir yolu hangi padişah döneminde yapılmıştır?");

        Cevaplistesi.add("Yıldırım Bayezid");
        Cevaplistesi.add("II. Abdulhamit");
        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("IV. Murad");




    }

































}
