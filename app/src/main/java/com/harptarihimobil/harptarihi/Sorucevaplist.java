package com.harptarihimobil.harptarihi;

import java.util.ArrayList;

public class Sorucevaplist {

    ArrayList <String> Sorulistesi;
    ArrayList <String> Cevaplistesi;
    ArrayList <String> DogruListesi;

    public  void SetSorulistesi (ArrayList <String> sorulistesi){

        this.Sorulistesi = sorulistesi;
    }

    public ArrayList <String> GetSorulistesi(){

        return  Sorulistesi;
    }

    public void SetDogruCevap(ArrayList <String> DogruListesi){

        this.DogruListesi = DogruListesi;
    }

    public ArrayList <String> GetDogruListesi() {

        return DogruListesi;
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

        DogruListesi.remove(a);
    }

    public void SoruCevap(){

        Sorulistesi.add("Meskûkât bilimi neye denir?");

        Cevaplistesi.add("Savaş Bilimi");
        Cevaplistesi.add("Irk Bilimi");
        Cevaplistesi.add("Para Bilimi");
        Cevaplistesi.add("Doğa Bilimi");

        DogruListesi.add("C");

        Sorulistesi.add("Melikşah adına düzenlenen takvim hangisidir?");

        Cevaplistesi.add("Kameri Takvim");
        Cevaplistesi.add("Miladi Takvim");
        Cevaplistesi.add("Hicri Takvim");
        Cevaplistesi.add("Rumi Takvim");

        DogruListesi.add("D");


        Sorulistesi.add("Bursa hangi padişah döneminde fethedilmiştir?");

        Cevaplistesi.add("Yıldırım Beyazid");
        Cevaplistesi.add("Orhan Gazi");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("Murad Hüdavendigar");

        DogruListesi.add("B");


        Sorulistesi.add("Armaları ve simgeleri inceleyen bilimin adı nedir?");

        Cevaplistesi.add("Epigrafi");
        Cevaplistesi.add("Heraldik");
        Cevaplistesi.add("Toponomi");
        Cevaplistesi.add("Paleografya");

        DogruListesi.add("B");

        Sorulistesi.add("Hititlerde önemli devlet meselelerinin görüşüldüğü meclise ne denir?");

        Cevaplistesi.add("Rizale");
        Cevaplistesi.add("Pankuş");
        Cevaplistesi.add("Fericat");
        Cevaplistesi.add("Surrak");

        DogruListesi.add("B");


        Sorulistesi.add("Hicaz Demir yolu hangi padişah döneminde yapılmıştır?");

        Cevaplistesi.add("II. Abdulhamit");
        Cevaplistesi.add("II.Selim");
        Cevaplistesi.add("I.Ahmed");
        Cevaplistesi.add("IV. Murad");

        DogruListesi.add("A");


        Sorulistesi.add("Hangi Türk devleti daha önce kurulmuştur?");

        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Hunlar");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Karahanlılar");

        DogruListesi.add("B");


        Sorulistesi.add("Sultan Alparslan hangi devletin yöneticisiydi?");

        Cevaplistesi.add("Osmanlılar");
        Cevaplistesi.add("Harezmşahlar");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Akkoyunlular");

        DogruListesi.add("C");


        Sorulistesi.add("Yavuz Sultan Selim'in dedesi kimdir?");

        Cevaplistesi.add("II.Beyazıd");
        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("II.Murat");
        Cevaplistesi.add("Fatih Sultan Mehmet");

        DogruListesi.add("D");


        Sorulistesi.add("Onluk sistem adı verilen askeri teşkilatı ilk defa kuran Türk komutan kimdir?");

        Cevaplistesi.add("Mete Han");
        Cevaplistesi.add("Attila");
        Cevaplistesi.add("Alp Er Tunga");
        Cevaplistesi.add("Sultan Alp Arslan");

        DogruListesi.add("A");

        Sorulistesi.add("Türklerin kullandığı ilk alfabe hangisidir?");

        Cevaplistesi.add("Hun Alfabesi");
        Cevaplistesi.add("Göktürk Alfabesi");
        Cevaplistesi.add("Uygur Alfabesi");
        Cevaplistesi.add("İskit Alfabesi");

        DogruListesi.add("B");


        Sorulistesi.add("Orhun Kitabeleri hangi Türk topluluğundan kalmıştır?");

        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Hunlar");
        Cevaplistesi.add("Sakalar");

        DogruListesi.add("B");


        Sorulistesi.add("Maniheizm inancına sahip Türk topluluğu hangisidir?");

        Cevaplistesi.add("Karahanlılar");
        Cevaplistesi.add("Sakalar");
        Cevaplistesi.add("Hunlar");
        Cevaplistesi.add("Uygurlar");

        DogruListesi.add("D");

        Sorulistesi.add("Museviliği kabul eden ilk Türk topluluğu hangisidir?");

        Cevaplistesi.add("Hazarlar");
        Cevaplistesi.add("Harezmşahlar");
        Cevaplistesi.add("Avrupa Hunları");
        Cevaplistesi.add("Uygurlar");

        DogruListesi.add("A");

        Sorulistesi.add("İslamiyeti kabul eden ilk Türk boyu hangisidir?");

        Cevaplistesi.add("Peçenekler");
        Cevaplistesi.add("Karluklar");
        Cevaplistesi.add("Kayılar");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("B");


        Sorulistesi.add("Nizamülmük hangi Türk devleti döneminde vezirlik yapmıştır?");

        Cevaplistesi.add("Karahanlılar");
        Cevaplistesi.add("Osmanlılar");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("C");

        Sorulistesi.add("Türk tarihinin ilk donanmasını kuran ilk amirali kabul edilen komutan kimdir?");

        Cevaplistesi.add("Uzun Hasan");
        Cevaplistesi.add("Barbaros Hayrettin Paşa");
        Cevaplistesi.add("Piri Reis");
        Cevaplistesi.add("Çaka Bey");

        DogruListesi.add("D");

        Sorulistesi.add("Anadolu'da Türkçe'yi ilk resmi dil olarak kabul eden kişi kimdir?");

        Cevaplistesi.add("Karamanoğlu Mehmet Bey");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("Alaaddin Keykubat");

        DogruListesi.add("A");

        Sorulistesi.add("Hangi şehir Selçuklu Devleti'ne başkentlik yapmamıştır?");

        Cevaplistesi.add("Bursa");
        Cevaplistesi.add("Konya");
        Cevaplistesi.add("İznik");
        Cevaplistesi.add("Nişabur");

        DogruListesi.add("A");

        Sorulistesi.add("Osmanlı padişahları arasında Sultan lakabını ilk hangisi kullanmıştır?");

        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("I.Beyazıt");
        Cevaplistesi.add("I.Mehmet");
        Cevaplistesi.add("I.Selim");

        DogruListesi.add("A");

        Sorulistesi.add("Celali İsyanları hangi padişah döneminde başlamıştır?");

        Cevaplistesi.add("I.Mustafa");
        Cevaplistesi.add("Fatih Sultan Mehmed");
        Cevaplistesi.add("Genç Osman");
        Cevaplistesi.add("Yavuz Sultan Selim");

        DogruListesi.add("D");

        Sorulistesi.add("Halifelik ünvanını ilk kullanan Osmanlı padişahı hangisidir?");

        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("Fatih Sultan Mehmed");
        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("II.Abdulhamit Han");

        DogruListesi.add("A");

        Sorulistesi.add("Hangi şehir Osmanlı'ya başkentlik yapmamıştır?");

        Cevaplistesi.add("Bursa");
        Cevaplistesi.add("İstanbul");
        Cevaplistesi.add("Edirne");
        Cevaplistesi.add("Eskişehir");

        DogruListesi.add("D");

        Sorulistesi.add("Yeniçerilik hangi padişah döneminde kaldırıldı?");

        Cevaplistesi.add("II. Mustafa");
        Cevaplistesi.add("II. Mahmud");
        Cevaplistesi.add("I. Ahmed");
        Cevaplistesi.add("Genç Osman");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı devletindeki ilk toprak kaybı hangi antlaşmayla olmuştur?");

        Cevaplistesi.add("Pasarofça Antlaşması");
        Cevaplistesi.add("Ankara Antlaşması");
        Cevaplistesi.add("Karlofça Antlaşması");
        Cevaplistesi.add("İstanbul Antlaşması");

        DogruListesi.add("C");


        Sorulistesi.add("Hangi Padişah içki ve sigara yasağını getirmiştir?");

        Cevaplistesi.add("II.Murad");
        Cevaplistesi.add("III.Murad");
        Cevaplistesi.add("IV.Murad");
        Cevaplistesi.add("II.Mahmud");

        DogruListesi.add("C");


        Sorulistesi.add("Dönemindeki Avrupalılar arasında 'Tanrının kırbacı' olarak bilinen Türk hükümdar kimdir?");

        Cevaplistesi.add("Attila");
        Cevaplistesi.add("Celaleddin Harezmşah");
        Cevaplistesi.add("Mete Han");
        Cevaplistesi.add("Cengiz Han");

        DogruListesi.add("A");

        Sorulistesi.add("Türklerin efsane Kürşad Ayaklanması hangi millete karşı yapılmıştır?");

        Cevaplistesi.add("Ruslar");
        Cevaplistesi.add("Moğollar");
        Cevaplistesi.add("Çinliler");
        Cevaplistesi.add("Persler");

        DogruListesi.add("C");


        Sorulistesi.add("Ülkemize Türkiye ismini tarihte ilk veren millet hangisidir?");

        Cevaplistesi.add("İngilizler");
        Cevaplistesi.add("İtalyanlar");
        Cevaplistesi.add("Çinliler");
        Cevaplistesi.add("Fransızlar");

        DogruListesi.add("B");

        Sorulistesi.add(" Hangisi I.Dünya Savaşı'nda Osmanlı'nın müttefiklerindendi?");

        Cevaplistesi.add("Bulgaristan");
        Cevaplistesi.add("Portekiz");
        Cevaplistesi.add("Arnavutluk");
        Cevaplistesi.add("Fransızlar");

        DogruListesi.add("A");


        Sorulistesi.add("Hangisi Milli Mücadele döneminde yapılmış bir savaştır?");

        Cevaplistesi.add("Sebeş Savaşı");
        Cevaplistesi.add("Kut'ul Amare Savaşı");
        Cevaplistesi.add("Çanakkale Savaşı");
        Cevaplistesi.add("I. İnönü Savaşı");

        DogruListesi.add("D");


        Sorulistesi.add("Onbinlerce Osmanlı askerinin öldüğü Sarıkamış Felaketi sırasında Milli Savunma Bakanı kimdi?");

        Cevaplistesi.add("Talat Paşa");
        Cevaplistesi.add("Enver Paşa");
        Cevaplistesi.add("Cemal Paşa");
        Cevaplistesi.add("Ekrem Paşa");

        DogruListesi.add("B");


        Sorulistesi.add(" I.Dünya Savaşı sonrası İtilaf Devletlerinin ilk işgal ettiği Osmanlı toprağı neresidir?");

        Cevaplistesi.add("İzmir");
        Cevaplistesi.add("Ardahan");
        Cevaplistesi.add("Boğazlar");
        Cevaplistesi.add("Hatay");

        DogruListesi.add("C");


        Sorulistesi.add("Türk mitolojisinde kutsal hayvan ve ulusal sembol olan Bozkurt hangi banknotun üzerine basılmıştır?");

        Cevaplistesi.add("10 Lira - 1955");
        Cevaplistesi.add("20 Lira - 1972");
        Cevaplistesi.add("100 Lira - 2005");
        Cevaplistesi.add("5 Lira - 1927");

        DogruListesi.add("D");



        Sorulistesi.add("Osmanlı İmparatorluğuna en çok toprak kazandıran padişahın ismi nedir?");

        Cevaplistesi.add("IV.Murad");
        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("Kanuni Sultan Süleyman");

        DogruListesi.add("B");


        Sorulistesi.add("Bugünkü sınırlarımızın çizildiği Lozan Antlaşması hangi tarihte imzalanmıştır?");

        Cevaplistesi.add("16 Eylül 1923");
        Cevaplistesi.add("24 Temmuz 1923");
        Cevaplistesi.add("15 Temmuz 1922");
        Cevaplistesi.add("24 Aralık 1920");

        DogruListesi.add("B");



        Sorulistesi.add("I. Meşrutiyet hangi padişah döneminde ilan edilmiştir?");

        Cevaplistesi.add("Vahdettin");
        Cevaplistesi.add("III. Osman");
        Cevaplistesi.add("II. Abdulhamit");
        Cevaplistesi.add("I. Abdülhamid");

        DogruListesi.add("C");


        Sorulistesi.add("Islahat Fermanının amacı neydi?");

        Cevaplistesi.add("Sanayiye teşvik vermek");
        Cevaplistesi.add("İthalatın azalması");
        Cevaplistesi.add("Azınlık isyanlarını engellemek");
        Cevaplistesi.add("Yönetim değişikliği");

        DogruListesi.add("C");


        Sorulistesi.add("Hangi padişah yeniçeriler tarafından boğularak öldürülmüştür?");

        Cevaplistesi.add("IV. Mehmed");
        Cevaplistesi.add("Genç Osman");
        Cevaplistesi.add("Sultan III.Murad");
        Cevaplistesi.add("İbrahim");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı ilk dış borcunu hangi savaşta ve hangi devletten almıştır?");

        Cevaplistesi.add("Suğdak Seferi-İngiltere");
        Cevaplistesi.add("I.Dünya Savaşı-Amerika");
        Cevaplistesi.add("Sebeş Savaşı-Avusturya");
        Cevaplistesi.add("Kırım Savaşı-İngiltere");

        DogruListesi.add("D");


        Sorulistesi.add("Medine’nin savunmasız kısımlarına geniş ve derin hendekler kazılarak savunulmasını öneren kimdir?");

        Cevaplistesi.add("Hz.Ömer");
        Cevaplistesi.add("Hz.Ebu Bekir");
        Cevaplistesi.add("Halid Bin Velid");
        Cevaplistesi.add("Selman-ı Farisi");

        DogruListesi.add("D");



        Sorulistesi.add("Medine Sözleşmesini bozan yahudilerin gönderildiği yer?");

        Cevaplistesi.add("Hayber");
        Cevaplistesi.add("Habeş");
        Cevaplistesi.add("Roma");
        Cevaplistesi.add("İran");

        DogruListesi.add("A");


        Sorulistesi.add("1402 Ankara Savaşı Kimlerin arasında olmuştur?");

        Cevaplistesi.add("Timur-Beyazid");
        Cevaplistesi.add("Timur-Çelebi Mehmed");
        Cevaplistesi.add("Fatih-Uzun Hasan");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı'da ilk kardeş katli hangi padişah döneminde gerçekleşmiştir?");

        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("Yıldırım Bayezid");
        Cevaplistesi.add("II.Murat");
        Cevaplistesi.add("Sultan Süleyman");

        DogruListesi.add("B");


        Sorulistesi.add("Fatih Sultan Mehmet'in babası kimdir?");

        Cevaplistesi.add("I.Mehmet");
        Cevaplistesi.add("Yıldırım Bayezid");
        Cevaplistesi.add("II.Murat");
        Cevaplistesi.add("Sultan Süleyman");

        DogruListesi.add("C");


        Sorulistesi.add("İtalya'nın Otranto şehri hangi padişah döneminde fethedilmiştir?");

        Cevaplistesi.add("I.Mehmet");
        Cevaplistesi.add("Yıldırım Bayezid");
        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("Sultan Süleyman");

        DogruListesi.add("C");

        Sorulistesi.add("Trabzon hangi padişah döneminde fethedilmiştir?");

        Cevaplistesi.add("I.Ahmed");
        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("IV. Murad");
        Cevaplistesi.add("Fatih Sultan Mehmet");

        DogruListesi.add("D");


        Sorulistesi.add("Osmanlı'da kurulan ilk siyasi parti hangisidir?");

        Cevaplistesi.add("Hürriyet ve İtilaf Partisi");
        Cevaplistesi.add("Sulh-i Cihan Partisi");
        Cevaplistesi.add("Ahrar Fırkası");
        Cevaplistesi.add("İttihat ve Terakki Partisi");

        DogruListesi.add("D");


        Sorulistesi.add("Viyana ilk defa hangi padişah tarafından kuşatılmıştır?");

        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("Genç Osman");
        Cevaplistesi.add("I.İbrahim");

        DogruListesi.add("A");



        Sorulistesi.add("İslam öncesi Türk topluluklarının dini inancı nedir?");

        Cevaplistesi.add("İsevilik");
        Cevaplistesi.add("Şintoizm");
        Cevaplistesi.add("Tengrizm");
        Cevaplistesi.add("Paganizm");

        DogruListesi.add("C");


        Sorulistesi.add("Türklerin en bilinen savaş taktiği hangisidir? ");

        Cevaplistesi.add("Hilal Taktiği");
        Cevaplistesi.add("Sal Piyade Taktiği");
        Cevaplistesi.add("Kalkan Duvarı");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("A");


        Sorulistesi.add("Tarihte kaç adet büyük Türk Devleti vardır?");

        Cevaplistesi.add("14");
        Cevaplistesi.add("18");
        Cevaplistesi.add("16");
        Cevaplistesi.add("21");

        DogruListesi.add("C");



        Sorulistesi.add("Kürşad Ayaklanması'nda, Kürşad kaç asker ile birlikte Chiu-ch'eng Sarayı'na saldırmıştır?");

        Cevaplistesi.add("40");
        Cevaplistesi.add("30");
        Cevaplistesi.add("500");
        Cevaplistesi.add("41");

        DogruListesi.add("A");



        Sorulistesi.add("Kutalmış oğlu Süleyman Şah hangi devletin kurucusudur?");

        Cevaplistesi.add("Gazneliler");
        Cevaplistesi.add("Harezmşahlar");
        Cevaplistesi.add("Anadolu Selçuklu");
        Cevaplistesi.add("Akkoyunlular");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlı Devletinde yoksulların ve öğrencilerin de yararlandığı yerlere ne ad verilirdi?");

        Cevaplistesi.add("Ribat");
        Cevaplistesi.add("İmarethane");
        Cevaplistesi.add("Dergah");
        Cevaplistesi.add("Daru’ş Şifa");

        DogruListesi.add("B");

        Sorulistesi.add("Aşağıdaki olayların hangisi ile Osmanlılar Rumeli’ye ilk kez geçmişlerdir?");

        Cevaplistesi.add("Bursa fethi");
        Cevaplistesi.add("Edirne fethi");
        Cevaplistesi.add("Çimpe fethi");
        Cevaplistesi.add("Koyunhisar Savaşı");

        DogruListesi.add("C");

        Sorulistesi.add("Anadolu'da 2. beylikler döneminin başlamasına neden olan savaş hangisidir?");

        Cevaplistesi.add("Kösedağ Savaşı");
        Cevaplistesi.add("Maltepe Savaşı");
        Cevaplistesi.add("Koyunhisar Savaşı");
        Cevaplistesi.add("Malazgirt Savaşı");

        DogruListesi.add("A");

        Sorulistesi.add("Haçlılarla yapılan ilk savaş hangisidir?");

        Cevaplistesi.add("I. Kosova Savaşı");
        Cevaplistesi.add("Koyunhisar Savaşı");
        Cevaplistesi.add("Sırpsındığı Savaşı");
        Cevaplistesi.add("Sazlıdere Savaşı");

        DogruListesi.add("C");

        Sorulistesi.add("Osmanlı Devleti'ne katılan ilk beylik hangisidir?");

        Cevaplistesi.add("Karesioğulları");
        Cevaplistesi.add("Karamanoğulları");
        Cevaplistesi.add("Hamitoğulları");
        Cevaplistesi.add("Germiyanoğulları");

        DogruListesi.add("A");

        Sorulistesi.add("Fetret Devri hangi savaştan sonra yaşanmıştır?");

        Cevaplistesi.add("Ankara Savaşı");
        Cevaplistesi.add("Kösedağ Savaşı");
        Cevaplistesi.add("Ridaniye Savaşı");
        Cevaplistesi.add("Mohaç Meydan Muharebesi");

        DogruListesi.add("A");

        Sorulistesi.add("Hangisi Osmanlı Devleti'nde divan üyesi değildir?");

        Cevaplistesi.add("Defterdar");
        Cevaplistesi.add("Sadrazam");
        Cevaplistesi.add("Vezir");
        Cevaplistesi.add("Tımarlı Sipahi");

        DogruListesi.add("D");

        Sorulistesi.add("Hangisi Avrupa'da İslamiyeti kabul eden ilk Türk Devletidir?");

        Cevaplistesi.add("İtil Bulgarları");
        Cevaplistesi.add("Hazarlar");
        Cevaplistesi.add("Peçenekler");
        Cevaplistesi.add("Kıpçaklar");

        DogruListesi.add("A");


        Sorulistesi.add("Hangisi Hindistan'da kurulmuş Türk hanedanlarından birisidir?");

        Cevaplistesi.add("Altın Orda Devleti");
        Cevaplistesi.add("Babür İmparatorluğu");
        Cevaplistesi.add("Kırım Kağanlığı");
        Cevaplistesi.add("Tolunoğulları");

        DogruListesi.add("B");


        Sorulistesi.add("Kıbrıs Barış harekatı hangi tarihte gerçekleşmiştir?");

        Cevaplistesi.add("1970");
        Cevaplistesi.add("1972");
        Cevaplistesi.add("1978");
        Cevaplistesi.add("1974");

        DogruListesi.add("D");


        Sorulistesi.add("Cumhuriyetin ilan edildiği tarih nedir?");

        Cevaplistesi.add("29 Ekim 1920");
        Cevaplistesi.add("29 Ekim 1923");
        Cevaplistesi.add("30 Ağustos 1923");
        Cevaplistesi.add("23 Nisan 1920");

        DogruListesi.add("B");


        Sorulistesi.add("İstanbul'u toplam 4 kez kuşatmış olmasına rağmen fethedemeyen padişah hangisidir?");

        Cevaplistesi.add("II. Murat");
        Cevaplistesi.add("Yıldırım Beyazıt");
        Cevaplistesi.add("II. Mehmet");
        Cevaplistesi.add("Musa Çelebi");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı Devleti hangi antlaşma ile fiilen sona ermiştir?");

        Cevaplistesi.add("Sevr Antlaşması");
        Cevaplistesi.add("Mondros Ateşkes Antlaşması");
        Cevaplistesi.add("İstanbul Antlaşması");
        Cevaplistesi.add("Lozan Antlaşması");

        DogruListesi.add("B");


        Sorulistesi.add("Müslümanlarla Mekkeli Kureyşliler arasındaki ilk savaş hangisidir?");

        Cevaplistesi.add("Uhud Savaşı");
        Cevaplistesi.add("Bedr Savaşı");
        Cevaplistesi.add("Hendek Savaşı");
        Cevaplistesi.add("Ayn Calut Savaşı");

        DogruListesi.add("B");

        //worlwaLL

        Sorulistesi.add("Uhud savaşında hangisi şehit olmuştur?");

        Cevaplistesi.add("Hz.Hamza");
        Cevaplistesi.add("Hz.Ömer");
        Cevaplistesi.add("Hz.Ebu Bekir");
        Cevaplistesi.add("Hz.Ali");

        DogruListesi.add("A");


        Sorulistesi.add("Hangisi 4 halifeden biri değildir?");

        Cevaplistesi.add("Hz.Hamza");
        Cevaplistesi.add("Hz.Ömer");
        Cevaplistesi.add("Hz.Ebu Bekir");
        Cevaplistesi.add("Hz.Ali");

        DogruListesi.add("A");

        Sorulistesi.add("Bizans ile İslam Devleti arasındaki ilk savaş hangisidir?");

        Cevaplistesi.add("Mute Savaşı");
        Cevaplistesi.add("Firaz Savaşı");
        Cevaplistesi.add("Hendek Savaşı");
        Cevaplistesi.add("Konstantinopolis Kuşatması");

        DogruListesi.add("A");

        Sorulistesi.add("Kudüs hangi dönemde fethedilmiştir?");

        Cevaplistesi.add("Hz.Ebu Bekir");
        Cevaplistesi.add("Hz.Ali");
        Cevaplistesi.add("Hz.Ömer");
        Cevaplistesi.add("Hz.Muaviye");

        DogruListesi.add("C");


        Sorulistesi.add("'Yüz Yıl Savaşları' hangi iki büyük ülke arasında gerçekleşti?");

        Cevaplistesi.add("Fransa-Genoa");
        Cevaplistesi.add("Fransa-Bohemya");
        Cevaplistesi.add("İngiltere-Fransa");
        Cevaplistesi.add("İngiltere-Almanya");

        DogruListesi.add("C");


        Sorulistesi.add("Fransız hükümdarı olan, Kanuni Sultan Süleyman'la yaptığı ittifakla da bilinen kralın adı nedir?");

        Cevaplistesi.add("I. Fransuva");
        Cevaplistesi.add("II. Henry");
        Cevaplistesi.add("Şarlken");
        Cevaplistesi.add("I. Philip");

        DogruListesi.add("A");



        Sorulistesi.add("Kadeş Antlaşması hangi uygarlıklar arasında yapılmıştır?");

        Cevaplistesi.add("Hititler-Mısırlılar");
        Cevaplistesi.add("Hititler-Sümerler");
        Cevaplistesi.add("Hititler-Lidyalılar");
        Cevaplistesi.add("Sümerler-Mısırlılar");

        DogruListesi.add("A");



        Sorulistesi.add("Türkiye Cumhuriyeti'nin ilk başbakanı kimdir?");

        Cevaplistesi.add("Ali Fethi Okyar");
        Cevaplistesi.add("Celal Bayar");
        Cevaplistesi.add("İsmet İnönü");
        Cevaplistesi.add("Mustafa Kemal Atatürk");

        DogruListesi.add("C");


        Sorulistesi.add("Cumhuriyet tarihinin ilk kağıt parası ne zaman tedavüle girdi?");

        Cevaplistesi.add("1923");
        Cevaplistesi.add("1925");
        Cevaplistesi.add("1927");
        Cevaplistesi.add("1929");

        DogruListesi.add("C");

        Sorulistesi.add("Hatay Anavatan'a kaç yılında katılmıştır?");

        Cevaplistesi.add("1923");
        Cevaplistesi.add("1935");
        Cevaplistesi.add("1939");
        Cevaplistesi.add("1949");

        DogruListesi.add("C");

        Sorulistesi.add("Fatih Sultan Mehmet İstanbul'u fethettiğinde kaç yaşındaydı?");

        Cevaplistesi.add("23");
        Cevaplistesi.add("25");
        Cevaplistesi.add("20");
        Cevaplistesi.add("21");

        DogruListesi.add("D");


        Sorulistesi.add("Mustafa Kemal 'Geldikleri gibi giderler' sözünü ne zaman söylemiştir?");

        Cevaplistesi.add("TBMM açılış konuşmasında");
        Cevaplistesi.add("İstanbul işgal edilince");
        Cevaplistesi.add("Çanakkale Savaşı'nda");
        Cevaplistesi.add("I.İnönü Savaşı'nda");

        DogruListesi.add("B");

        Sorulistesi.add("Hangi ülke I.Dünya Savaşı'ndan sonra Türkiye'nin bir bölümünü işgal etmiştir?");

        Cevaplistesi.add("İsveç");
        Cevaplistesi.add("Fransa");
        Cevaplistesi.add("İspanya");
        Cevaplistesi.add("İsviçre");

        DogruListesi.add("B");


        Sorulistesi.add("Kurtuluş Savaşı'nda Doğu Cephesi komutanı kimdi?");

        Cevaplistesi.add("İsmet İnönü");
        Cevaplistesi.add("Enver Paşa");
        Cevaplistesi.add("Kazım Karabekir");
        Cevaplistesi.add("Talat Paşa");

        DogruListesi.add("C");


        Sorulistesi.add("Çift başlı kartal hangi devletin sembolüdür?");

        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Altın Orda Devleti");
        Cevaplistesi.add("Çağatay Hanlığı");
        Cevaplistesi.add("Osmanlı Devleti");

        DogruListesi.add("A");


        Sorulistesi.add("En kısa meydan muharebesi hangi savaştır?");

        Cevaplistesi.add("Mohaç Savaşı");
        Cevaplistesi.add("Waterloo Savaşı");
        Cevaplistesi.add("Sebeş Savaşı");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("A");


        Sorulistesi.add("En kısa meydan muharebesi kaç saat sürmüştür?");

        Cevaplistesi.add("2");
        Cevaplistesi.add("4");
        Cevaplistesi.add("7");
        Cevaplistesi.add("1");

        DogruListesi.add("A");
















    }


}
