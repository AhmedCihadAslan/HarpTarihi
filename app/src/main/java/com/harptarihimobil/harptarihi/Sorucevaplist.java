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

        Cevaplistesi.add("Osmanlı Devleti");
        Cevaplistesi.add("Altın Orda Devleti");
        Cevaplistesi.add("Çağatay Hanlığı");
        Cevaplistesi.add("Selçuklular");

        DogruListesi.add("D");


        Sorulistesi.add("En kısa meydan muharebesi hangi savaştır?");

        Cevaplistesi.add("Waterloo Savaşı");
        Cevaplistesi.add("Mohaç Savaşı");
        Cevaplistesi.add("Sebeş Savaşı");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("B");


        Sorulistesi.add("Napolyonu Mısır'da mağlup eden Osmanlı paşası kimdir?");

        Cevaplistesi.add("Tiryaki Hasan Paşa");
        Cevaplistesi.add("Köprülü Mehmed Paşa");
        Cevaplistesi.add("Cezayirli Mahmut Paşa");
        Cevaplistesi.add("Cezzar Ahmed Paşa");

        DogruListesi.add("D");

        Sorulistesi.add("Plevne savaşı kahramanı kimdir?");

        Cevaplistesi.add("Tarık Paşa");
        Cevaplistesi.add("İbrahim Hakkı Paşa");
        Cevaplistesi.add("Sait Halim Paşa");
        Cevaplistesi.add("Gazi Osman Paşa");

        DogruListesi.add("D");

        Sorulistesi.add("Türkler hangi savaştan sonra topluca İslamiyet'e geçmiştir?");

        Cevaplistesi.add("Mohaç Savaşı");
        Cevaplistesi.add("Dandanakan Savaşı");
        Cevaplistesi.add("Talas Savaşı");
        Cevaplistesi.add("Peloponez Savaşı");

        DogruListesi.add("C");


        Sorulistesi.add("Anadolu'da kurulan ilk Türk beyliğinin adı nedir?");

        Cevaplistesi.add("Karesioğulları");
        Cevaplistesi.add("Danişmentliler");
        Cevaplistesi.add("Saltuklular");
        Cevaplistesi.add("Osmanlılar");

        DogruListesi.add("C");


        Sorulistesi.add("Bizanslılar tarafından icat edilmiş olan Roma ateşi ilk kez hangi savaşta kullanılmıştır?");

        Cevaplistesi.add("Louisville Savaşı");
        Cevaplistesi.add("Constantinapole Savunması");
        Cevaplistesi.add("Peloponez Savaşı");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlı Devletinde isyan eden ilk azınlık hangi millettir?");

        Cevaplistesi.add("Sırplar");
        Cevaplistesi.add("Araplar");
        Cevaplistesi.add("Arnavutlar");
        Cevaplistesi.add("Gürcüler");

        DogruListesi.add("A");


        Sorulistesi.add("Anadolu Selçuklu Devleti kaç yılında kuruldu?");

        Cevaplistesi.add("1071");
        Cevaplistesi.add("1075");
        Cevaplistesi.add("1068");
        Cevaplistesi.add("1079");

        DogruListesi.add("B");

        Sorulistesi.add("II.Dünya Savaşı hangi yıl başladı ve kaç yıl sürdü?");

        Cevaplistesi.add("1939- 5 yıl");
        Cevaplistesi.add("1939- 6 yıl");
        Cevaplistesi.add("1940- 5 yıl");
        Cevaplistesi.add("1945- 4 yıl");

        DogruListesi.add("B");

        Sorulistesi.add("Cengiz Han'ın ilk eşinin adı nedir?");

        Cevaplistesi.add("Ayasun");
        Cevaplistesi.add("Tomris");
        Cevaplistesi.add("Börte");
        Cevaplistesi.add("Tekçe");

        DogruListesi.add("C");


        Sorulistesi.add("Yeniçeri ocağını kapatan ve Fes takmayı zorunlu kılan padişah kimdir?");

        Cevaplistesi.add("IV.Murad");
        Cevaplistesi.add("II.Mustafa");
        Cevaplistesi.add("II.Mahmud");
        Cevaplistesi.add("II.Mehmed");

        DogruListesi.add("C");


        Sorulistesi.add("Taht kavgalarını önlemek amacıyla kardeş katline fetva çıkartan padişah kimdir?");

        Cevaplistesi.add("II.Mehmed");
        Cevaplistesi.add("I.Ahmed");
        Cevaplistesi.add("III.Selim");
        Cevaplistesi.add("Kanuni Sultan Süleyman");

        DogruListesi.add("A");


        Sorulistesi.add("Kanije müdafaasını yapan Kahraman Paşa kimdir?");

        Cevaplistesi.add("Yedi sekiz Hasan Paşa");
        Cevaplistesi.add("İskender Bey");
        Cevaplistesi.add("Tiryaki Hasan Paşa");
        Cevaplistesi.add("Cezzar Ahmed Paşa");

        DogruListesi.add("C");


        Sorulistesi.add("Kastrioti Skënderbeu adıyla bilinen ve sonradan isyan eden Osmanlı valisi kimdir?");

        Cevaplistesi.add("Kazıklı Voyvoda");
        Cevaplistesi.add("İskender Bey");
        Cevaplistesi.add("Yirmisekiz Mehmed Çelebi");
        Cevaplistesi.add("Cezzar Ahmed Paşa");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı'da Veraset Sistemi'nde ilk defa değişikliği yapan padişah kimdir?");

        Cevaplistesi.add("I.Murad");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("I.Mehmed");
        Cevaplistesi.add("II.Murad");

        DogruListesi.add("A");


        Sorulistesi.add("Sultanü’l Guzat ünvanını kullanan Osmanlı padişahı kimdir?");

        Cevaplistesi.add("I.Murad");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("III.Mehmed");
        Cevaplistesi.add("Orhan Gazi");

        DogruListesi.add("D");


        Sorulistesi.add("Hükümdarın herhangi bir konuda verdiği emre ne denir?");

        Cevaplistesi.add("Yasakname");
        Cevaplistesi.add("Ferman");
        Cevaplistesi.add("Kulluk Hakkı");
        Cevaplistesi.add("Fetva");

        DogruListesi.add("B");


        Sorulistesi.add("Hükümdarın herhangi bir konudaki fikir beyan etmesine ne denir?");

        Cevaplistesi.add("Hatt-ı Hümayun");
        Cevaplistesi.add("Adaletname");
        Cevaplistesi.add("Yasakname");
        Cevaplistesi.add("Fetva");

        DogruListesi.add("A");


        Sorulistesi.add("Hükümdarın herhangi bir devlet adamının malına el koymasına ne denir?");

        Cevaplistesi.add("İltizam");
        Cevaplistesi.add("Müsadere");
        Cevaplistesi.add("Yasakname");
        Cevaplistesi.add("Mühimme");

        DogruListesi.add("B");

        Sorulistesi.add("Hükümdarın herhangi bir devşirmeyi öldürebilmesine, cezalandırabilmesine ne denir?");

        Cevaplistesi.add("Fetva");
        Cevaplistesi.add("Müsadere");
        Cevaplistesi.add("Kulluk Hakkı");
        Cevaplistesi.add("Mühimme");

        DogruListesi.add("C");


        Sorulistesi.add("Ülke padişahın malıdır anlayışını getiren padişah?");

        Cevaplistesi.add("Fatih Sultan Mehmed");
        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("II.Abdulhamit");

        DogruListesi.add("A");

        Sorulistesi.add("Ekber ve Erşed sistemini getiren padişah?");

        Cevaplistesi.add("I.Ahmed");
        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("I.Abdulmecid");

        DogruListesi.add("A");

        Sorulistesi.add("Sancak Sistemi’ni ilk kez başlatan padişah");

        Cevaplistesi.add("Osman Bey");
        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("Orhan Bey");

        DogruListesi.add("D");


        Sorulistesi.add("Sancak sistemi ile ilk kez tahta çıkan padişah?");

        Cevaplistesi.add("Osman Bey");
        Cevaplistesi.add("Yıldırım Beyazid");
        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("Orhan Bey");

        DogruListesi.add("C");


        Sorulistesi.add("En uzun süre yönetim merkezi olan saray?");

        Cevaplistesi.add("Topkapı Sarayı");
        Cevaplistesi.add("Çırağan Sarayı");
        Cevaplistesi.add("Dolmabahçe Sarayı");
        Cevaplistesi.add("Yıldız Sarayı");

        DogruListesi.add("A");


        Sorulistesi.add("Divan-ı Hümayun'u kuran padişah?");

        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("Orhan Bey");
        Cevaplistesi.add("II. Murat");
        Cevaplistesi.add("II. Mahmud");

        DogruListesi.add("B");


        Sorulistesi.add("Padişah mührünü taşıyan ve padişahtan sonra en yetkili isim olan devlet adamı");

        Cevaplistesi.add("Kazasker");
        Cevaplistesi.add("Defterdar");
        Cevaplistesi.add("Vezir-i Azam");
        Cevaplistesi.add("Nişancı");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlı devletinde ilk vezir?");

        Cevaplistesi.add("Süleyman Paşa");
        Cevaplistesi.add("Alaaddin Paşa");
        Cevaplistesi.add("Çandarlı Halil Paşa");
        Cevaplistesi.add("İbrahim Paşa");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı Devletinin Bizans ile yaptığı ilk savaş?");

        Cevaplistesi.add("Maltepe Savaşı");
        Cevaplistesi.add("Sırpsındığı Savaşı");
        Cevaplistesi.add("Koyunhisar Savaşı");
        Cevaplistesi.add("Malazgirt Savaşı");

        DogruListesi.add("C");


        Sorulistesi.add("İlk kadı tayinini yapan padişah?");

        Cevaplistesi.add("Orhan Bey");
        Cevaplistesi.add("Osman Bey");
        Cevaplistesi.add("I.Murad");
        Cevaplistesi.add("Çelebi Mehmed");

        DogruListesi.add("B");


        Sorulistesi.add("İlk düzenli orduyu kuran Osmanlı hükümdarı?");

        Cevaplistesi.add("Orhan Bey");
        Cevaplistesi.add("II.Mehmed");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("Çelebi Mehmed");

        DogruListesi.add("A");


        Sorulistesi.add("Tımar sistemini ilk defa düzenli ve yaygın bir şekilde uygulayan Osmanlı hükümdarı?");

        Cevaplistesi.add("Orhan Bey");
        Cevaplistesi.add("II.Mehmed");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("I.Murad");

        DogruListesi.add("D");


        Sorulistesi.add("Osmanlı'da ilk defa para basan hükümdar?");

        Cevaplistesi.add("Yıldırım Beyazid");
        Cevaplistesi.add("II.Mehmed");
        Cevaplistesi.add("Osman Gazi");
        Cevaplistesi.add("Orhan Bey");

        DogruListesi.add("C");



        Sorulistesi.add("Osmanlı Devleti hangi beyliğe son vererek denizcilik faaliyetlerine başlamıştır?");

        Cevaplistesi.add("Hamitoğulları");
        Cevaplistesi.add("Germiyanoğulları");
        Cevaplistesi.add("Karesioğulları");
        Cevaplistesi.add("Karamanoğulları");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlı'nın Anadolu Türk Birliğini kurmak adına ilk hakimiyeti altına aldığı beylik?");

        Cevaplistesi.add("Hamitoğulları");
        Cevaplistesi.add("Karesioğulları");
        Cevaplistesi.add("Candaroğulları");
        Cevaplistesi.add("Karamanoğulları");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı'nın çeyiz yolu ile topraklarına kattığı beylik?");

        Cevaplistesi.add("Hamitoğulları");
        Cevaplistesi.add("Karesioğulları");
        Cevaplistesi.add("Candaroğulları");
        Cevaplistesi.add("Germiyanoğulları");

        DogruListesi.add("D");



        Sorulistesi.add("Osmanlı'nın para yolu ile topraklarına kattığı beylik?");

        Cevaplistesi.add("Hamitoğulları");
        Cevaplistesi.add("Karesioğulları");
        Cevaplistesi.add("Candaroğulları");
        Cevaplistesi.add("Germiyanoğulları");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı'nın Haçlılarla yaptığı ilk savaş?");

        Cevaplistesi.add("Maltepe Savaşı");
        Cevaplistesi.add("Palekanon Savaşı");
        Cevaplistesi.add("Sebeş Savaşı");
        Cevaplistesi.add("Sırpsındığı Savaşı");

        DogruListesi.add("D");



        Sorulistesi.add("Osmanlı'da savaş meydanında şehit olan tek padişah?");

        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("Orhan Bey");
        Cevaplistesi.add("Osman Bey");
        Cevaplistesi.add("I.Abldulaziz");

        DogruListesi.add("A");


        Sorulistesi.add("İlk defa İstanbul'u kuşatan Osmanlı padişahı?");

        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("Orhan Bey");
        Cevaplistesi.add("Osman Bey");
        Cevaplistesi.add("Yıldırım Beyazid");

        DogruListesi.add("D");



        Sorulistesi.add("Osmanlı Devleti'nin Fetret Dönemi'ni yaşamasına sebep olan olay?");

        Cevaplistesi.add("I. Murat'ın şehit olması");
        Cevaplistesi.add("Çelebi Mehmet'in tahta çıkması");
        Cevaplistesi.add("Ankara Savaşı");
        Cevaplistesi.add("Pelanikos Savaşı");

        DogruListesi.add("C");



        Sorulistesi.add("Osmanlı'nın ikinci kurucusu ünvanına sahip olan hükümdar?");

        Cevaplistesi.add("Yıldırım Beyazid");
        Cevaplistesi.add("Çelebi Mehmet");
        Cevaplistesi.add("II. Mehmet");
        Cevaplistesi.add("II.Süleyman");

        DogruListesi.add("B");



        Sorulistesi.add("Balkanlar hangi savaş sonrası kesin Türk yurdu haline geldi?");

        Cevaplistesi.add("I. Kosova Savaşı");
        Cevaplistesi.add("II. Kosova Savaşı");
        Cevaplistesi.add("Varna Savaşı");
        Cevaplistesi.add("Viyana Kuşatması");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı Devleti ilk defa kime ticari imtiyaz vermiştir?");

        Cevaplistesi.add("Cenevizliler");
        Cevaplistesi.add("Venedikliler");
        Cevaplistesi.add("Ermeniler");
        Cevaplistesi.add("Fransızlar");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı Devleti ilk defa kime ticari imtiyaz vermiştir?");

        Cevaplistesi.add("Cenevizliler");
        Cevaplistesi.add("Venedikliler");
        Cevaplistesi.add("Ermeniler");
        Cevaplistesi.add("Fransızlar");

        DogruListesi.add("A");


        Sorulistesi.add("Kavimler Göçü sonucunda Balamir önderliğinde Avrupa'da kurulan ilk Türk devleti?");

        Cevaplistesi.add("Avrupa Hun Devleti");
        Cevaplistesi.add("Asya Hun Devleti");
        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Avarlar");

        DogruListesi.add("A");


        Sorulistesi.add("Avrupa Hun Devleti, en parlak dönemini hangi hükümdar döneminde yaşamıştır?");

        Cevaplistesi.add("Mete Han");
        Cevaplistesi.add("Attila");
        Cevaplistesi.add("Timuçin");
        Cevaplistesi.add("Timur");

        DogruListesi.add("B");


        Sorulistesi.add("İlk Türk Hükümdar kimdir?");

        Cevaplistesi.add("Mete Han");
        Cevaplistesi.add("Teoman");
        Cevaplistesi.add("Timuçin");
        Cevaplistesi.add("Timur");

        DogruListesi.add("B");



        Sorulistesi.add("İlk defa din değiştiren Türk devleti?");

        Cevaplistesi.add("İskitler");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Avarlar");
        Cevaplistesi.add("Hunlar");

        DogruListesi.add("B");

        Sorulistesi.add("Parayı ilk kullanan ilk Türk topluluğu?");

        Cevaplistesi.add("İskitler");
        Cevaplistesi.add("Sibirler");
        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Hunlar");

        DogruListesi.add("B");

        Sorulistesi.add("İstanbul’u ilk kuşatan ilk Türk devleti?");

        Cevaplistesi.add("Osmanlılar");
        Cevaplistesi.add("Avarlar");
        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Hunlar");

        DogruListesi.add("B");

        Sorulistesi.add("Töreyi yazı hale getiren ilk Türkler?");

        Cevaplistesi.add("Osmanlılar");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Hunlar");

        DogruListesi.add("B");


        Sorulistesi.add("Türklerin ilk başkenti?");

        Cevaplistesi.add("Keşmir");
        Cevaplistesi.add("Ulanbatur");
        Cevaplistesi.add("Ötüken");
        Cevaplistesi.add("Ray");

        DogruListesi.add("C");

        Sorulistesi.add("Musevi olan tek Türk boyu?");

        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Hazarlar");

        DogruListesi.add("D");



        Sorulistesi.add("Musevi olan tek Türk boyu?");

        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Hazarlar");

        DogruListesi.add("D");


        Sorulistesi.add("Türk adı hangi devletin kaynaklarında güç, kuvvet anlamında kullanılmıştır?");

        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Hazarlar");

        DogruListesi.add("B");

        Sorulistesi.add("Türk adı Çin kaynaklarında hangi anlamda kullanılmıştır?");

        Cevaplistesi.add("Kurt");
        Cevaplistesi.add("Yay");
        Cevaplistesi.add("Miğfer");
        Cevaplistesi.add("Kılıç");

        DogruListesi.add("C");



        Sorulistesi.add("Türk adı kimin eserlerinde Töreli anlamında kullanılmıştır?");

        Cevaplistesi.add("Ziya Gökalp");
        Cevaplistesi.add("Mehmet Akif Ersoy");
        Cevaplistesi.add("Tevfik Fikret");
        Cevaplistesi.add("Namık Kemal");

        DogruListesi.add("A");

        Sorulistesi.add("İlk defa orduda ücretli asker kullanan Türk devleti?");

        Cevaplistesi.add("Kırgızlar");
        Cevaplistesi.add("Osmanlılar");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Hazarlar");

        DogruListesi.add("D");


        Sorulistesi.add("Göktürk ve Sasani Devletlerinin işbirliği sonucu yıkılan Türk devleti?");

        Cevaplistesi.add("Kırgızlar");
        Cevaplistesi.add("Avarlar");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Akhunlar");

        DogruListesi.add("D");



        Sorulistesi.add("Çinliler hangi Türk devletinin akınlarını durdurmak için Çin seddini yapmışlardır?");

        Cevaplistesi.add("Kök Türk");
        Cevaplistesi.add("Asya Hun");
        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Akhunlar");

        DogruListesi.add("B");

        Sorulistesi.add("Türk boylarını tarihte ilk defa tek bir bayrak altında toplayan hükümdar?");

        Cevaplistesi.add("Timuçin");
        Cevaplistesi.add("Attila");
        Cevaplistesi.add("Teoman");
        Cevaplistesi.add("Metehan");

        DogruListesi.add("D");


        Sorulistesi.add("Roma İmparatorluğunun iki ayrılmasına ve İlkçağın bitip Ortaçağın başlamasına sebep olan olay?");

        Cevaplistesi.add("Roma isyanları");
        Cevaplistesi.add("Kuzey Şansi Antlaşması");
        Cevaplistesi.add("Asya Hun Devleti kurulması");
        Cevaplistesi.add("Kavimler Göçü");

        DogruListesi.add("D");


        Sorulistesi.add("Manihaizmi benimsedikleri için tarımla uğraşmak zorunda kalan ve savaşçılık özelliğini kaybeden Türk topluluğu?");

        Cevaplistesi.add("Hazarlar");
        Cevaplistesi.add("Hunlar");
        Cevaplistesi.add("Akatlar");
        Cevaplistesi.add("Uygurlar");

        DogruListesi.add("D");


        Sorulistesi.add("Türklerde hükümdar, kurultay ve halkın geleneklerinden oluşan yazısız hukuk kurallarına verilen ad?");

        Cevaplistesi.add("Töre");
        Cevaplistesi.add("Tüz");
        Cevaplistesi.add("Uzluk");
        Cevaplistesi.add("Kanun");

        DogruListesi.add("A");

        Sorulistesi.add("Eski Türklerde, dini ve millî bakımdan önemli olan günlerin milletçe kutlanması törenlerine ne ad verilirdi?");

        Cevaplistesi.add("Töre");
        Cevaplistesi.add("Tüz");
        Cevaplistesi.add("Şölen");
        Cevaplistesi.add("Toy");

        DogruListesi.add("C");


        Sorulistesi.add("Aşağıdakilerden hangisi İslam öncesi Türk topluluklarında ahiret inancının varlığını göstermez?");

        Cevaplistesi.add("Uçmağ");
        Cevaplistesi.add("Tamu");
        Cevaplistesi.add("Yuğ");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("C");


        Sorulistesi.add("İslam öncesi Türk toplumunda Tanrı tarafından hükümdara verildiğine inanılan ekonomik güce ne denir?");

        Cevaplistesi.add("Küç");
        Cevaplistesi.add("Ülüş");
        Cevaplistesi.add("Yuğ");
        Cevaplistesi.add("Kut");

        DogruListesi.add("D");


        Sorulistesi.add("Aşağıdakilerden hangisi Türklerin göç etme nedenlerinden biri değildir?");

        Cevaplistesi.add("Çin'in baskıları");
        Cevaplistesi.add("İklim değişiklikleri");
        Cevaplistesi.add("Dinlerini yayma düşünceleri");
        Cevaplistesi.add("Yaşayış biçimleri");

        DogruListesi.add("C");


        Sorulistesi.add("Avrupalıların üzerine bahis oynadığı, iki Türk'ün savaşı dedikleri savaş?");

        Cevaplistesi.add("Ridaniye Savaşı");
        Cevaplistesi.add("Otlukbeli Savaşı");
        Cevaplistesi.add("Ankara Savaşı");
        Cevaplistesi.add("Dandanakan Savaşı");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı hangi savaşla Dulkadiroğulları'nın egemenlğine son vermiştir?");

        Cevaplistesi.add("Ridaniye Savaşı");
        Cevaplistesi.add("Otlukbeli Savaşı");
        Cevaplistesi.add("Ankara Savaşı");
        Cevaplistesi.add("Turnadağ Savaşı");

        DogruListesi.add("D");



        Sorulistesi.add("Hangi savaş sonrası halifelik Osmanlı'nın eline geçmiştir?");

        Cevaplistesi.add("Ridaniye Savaşı");
        Cevaplistesi.add("Otlukbeli Savaşı");
        Cevaplistesi.add("Ankara Savaşı");
        Cevaplistesi.add("Turnadağ Savaşı");

        DogruListesi.add("A");

        Sorulistesi.add("Hangi antlaşma ile Osmanlı Avrupa'ya siyasi üstünlük sağladı?");

        Cevaplistesi.add("Belgrat Anlaşması");
        Cevaplistesi.add("Uşi Antlaşması");
        Cevaplistesi.add("Ankara Antlaşması");
        Cevaplistesi.add("İstanbul Antlaşması");

        DogruListesi.add("D");


        Sorulistesi.add("Hangi deniz savaşı ile Akdeniz'de Osmanlı hakimiyeti sağlanmıştır?");

        Cevaplistesi.add("Preveze Deniz Savaşı");
        Cevaplistesi.add("Malta Kuşatması");
        Cevaplistesi.add("Cebre Deniz Savaşı");
        Cevaplistesi.add("Akyaka Deniz Savaşı");

        DogruListesi.add("A");

        Sorulistesi.add("Osmanlı Avrupa'daki Hristiyan Birliği'ni parçalamak amacıyla hangi devlete kapitülasyon vermiştir?");

        Cevaplistesi.add("İngiltere");
        Cevaplistesi.add("Avusturya");
        Cevaplistesi.add("Fransa");
        Cevaplistesi.add("İspanya");

        DogruListesi.add("C");


        Sorulistesi.add("Belgrad hangi padişah zamanında feth edildi?");

        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("Sultan Süleyman");
        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("Beyazid");

        DogruListesi.add("B");



        Sorulistesi.add("Osmanlı'yı en fazla uğraştıran Türk beyliği?");

        Cevaplistesi.add("Karamanoğulları");
        Cevaplistesi.add("Hamitoğulları");
        Cevaplistesi.add("Dulkadiroğulları");
        Cevaplistesi.add("Candaroğulları");

        DogruListesi.add("A");

        Sorulistesi.add("Kanuni döneminde Mısır'ı zapt etmek için ayaklanma başlatan kişi?");

        Cevaplistesi.add("Canberdi Gazali");
        Cevaplistesi.add("Baba Zünnun");
        Cevaplistesi.add("Ahmet Paşa");
        Cevaplistesi.add("Ali Paşa");

        DogruListesi.add("A");


        Sorulistesi.add("Kıbrıs'ın Fethi nedeniyle Osmanlı donanması hangi limanda Haçlılar tarafından yakılmıştır?");

        Cevaplistesi.add("İnebahtı");
        Cevaplistesi.add("Sinop");
        Cevaplistesi.add("Navarin");
        Cevaplistesi.add("Mersin");

        DogruListesi.add("A");


        Sorulistesi.add("Kayser-i Rum olarak bilinen padişah?");

        Cevaplistesi.add("II.Abdulhamit");
        Cevaplistesi.add("Kanuni Sultan Süleyman");
        Cevaplistesi.add("Yavuz Sultan Selim");
        Cevaplistesi.add("Fatih Sultan Mehmet");

        DogruListesi.add("D");


        Sorulistesi.add("Milli mücadele hazırlık döneminde düzenli ordu kuruluna kadar bağımsızlık mücadelesi veren birliklerin ismi?");

        Cevaplistesi.add("Kuva-i Milliye");
        Cevaplistesi.add("Temsil Heyeti");
        Cevaplistesi.add("İrade-i Milliye");
        Cevaplistesi.add("İttihat ve Terakki");

        DogruListesi.add("A");



        Sorulistesi.add("Milli mücadelenin gerekçesi, amacı ve yöntemi nerede belirlenmiştir?");

        Cevaplistesi.add("Erzurum Kongresi");
        Cevaplistesi.add("Sivas Kongresi");
        Cevaplistesi.add("Amasya Genelgesi");
        Cevaplistesi.add("Havza Genelgesi");

        DogruListesi.add("C");



        Sorulistesi.add("Türk İslam devletlerinde hükümdarın yiyeceklerini tadan görevli?");

        Cevaplistesi.add("Emir-i Ahur");
        Cevaplistesi.add("Emir-i Çeşnigir");
        Cevaplistesi.add("Emir-i Şikar");
        Cevaplistesi.add("Emir-i Tad");

        DogruListesi.add("B");


        Sorulistesi.add("Türk İslam devletlerinde Müslümanlardan alınan ürün vergisi?");

        Cevaplistesi.add("Cizye");
        Cevaplistesi.add("Haraç");
        Cevaplistesi.add("Öşür");
        Cevaplistesi.add("Müsve");

        DogruListesi.add("C");


        Sorulistesi.add("Türk İslam devletlerinde Gayrimüslimlerden alınan ürün vergisi?");

        Cevaplistesi.add("Cizye");
        Cevaplistesi.add("Haraç");
        Cevaplistesi.add("Öşür");
        Cevaplistesi.add("Müsve");

        DogruListesi.add("B");



        Sorulistesi.add("Türk İslam devletlerinde Gayrimüslim erkeklerden alınan askerlik vergisi?");

        Cevaplistesi.add("Cizye");
        Cevaplistesi.add("Haraç");
        Cevaplistesi.add("Öşür");
        Cevaplistesi.add("Müsve");

        DogruListesi.add("A");


        Sorulistesi.add("Selçuklu Devleti’nin yönetim şeklini anlatan Siyasetnamenin yazarı?");

        Cevaplistesi.add("Tonyukuk");
        Cevaplistesi.add("Ali Şir Nevai");
        Cevaplistesi.add("Edip Ahmet");
        Cevaplistesi.add("Nizamülmülk");

        DogruListesi.add("D");


        Sorulistesi.add("Yurt Açan adıyla bilinen savaş hangisidir?");

        Cevaplistesi.add("Dandanakan Savaşı");
        Cevaplistesi.add("Kösedağ Savaşı");
        Cevaplistesi.add("Talas Savaşı");
        Cevaplistesi.add("Malazgirt Savaşı");

        DogruListesi.add("D");



        Sorulistesi.add("1071 Malazgirt Savaşı'ndan sonra Pasinler, Erzurum ve Bayburt çevresinde kurulan Türk beyliği?");

        Cevaplistesi.add("Çaka Beyliği");
        Cevaplistesi.add("Saltuklular");
        Cevaplistesi.add("Menteşeoğulları");
        Cevaplistesi.add("Germiyanoğulları");

        DogruListesi.add("B");

        Sorulistesi.add("1071 Malazgirt Savaşı'ndan sonra Pasinler, Erzurum ve Bayburt çevresinde kurulan Türk beyliği?");

        Cevaplistesi.add("Çaka Beyliği");
        Cevaplistesi.add("Saltuklular");
        Cevaplistesi.add("Menteşeoğulları");
        Cevaplistesi.add("Germiyanoğulları");

        DogruListesi.add("B");



        Sorulistesi.add("Miryokefelon Savaşı'nda Türk ordusunun başındaki  komutan kimdir?");

        Cevaplistesi.add("Sultan Alparslan");
        Cevaplistesi.add("II. Kılıç Arslan");
        Cevaplistesi.add("IV. Murat");
        Cevaplistesi.add("II. Abdülhamid");

        DogruListesi.add("B");


        Sorulistesi.add("Divan-ı Lügatit Türk'' hangi devlet döneminde yazılmıştır?");

        Cevaplistesi.add("Karahanlılar");
        Cevaplistesi.add("Gazneliler");
        Cevaplistesi.add("Osmanlı");
        Cevaplistesi.add("Selçuklular");

        DogruListesi.add("A");


        Sorulistesi.add("Fatih Sultan Mehmet, şiirlerini kaleme alırken hangi mahlası kullanmıştır?");

        Cevaplistesi.add("Muhibbi");
        Cevaplistesi.add("Şairi");
        Cevaplistesi.add("Avni");
        Cevaplistesi.add("Hatai");

        DogruListesi.add("C");



        Sorulistesi.add("Hangisi islamiyet öncesi Türk devletlerinde kurultay üyelerinden değildir?");

        Cevaplistesi.add("Hakan");
        Cevaplistesi.add("Hatun");
        Cevaplistesi.add("Yabgu");
        Cevaplistesi.add("Baksı");

        DogruListesi.add("D");


        Sorulistesi.add("Aşağıdakilerden hangisi Türklerin milli alfabelerindendir?");

        Cevaplistesi.add("Göktürk-Uygur");
        Cevaplistesi.add("Arap-Latin");
        Cevaplistesi.add("Kril-Soğd");
        Cevaplistesi.add("Soğd-Uygur");

        DogruListesi.add("A");

        Sorulistesi.add("Osmanlı Devleti’nin ilk başkenti neresidir?");

        Cevaplistesi.add("Bursa");
        Cevaplistesi.add("Edirne");
        Cevaplistesi.add("İstanbul");
        Cevaplistesi.add("Söğüt");

        DogruListesi.add("D");




        Sorulistesi.add("Osmanlı Devleti’nin en geniş sınırlara sahip olduğu dönem hangisidir?");

        Cevaplistesi.add("Gerileme");
        Cevaplistesi.add("Duraklama");
        Cevaplistesi.add("Yükselme");
        Cevaplistesi.add("Dağılma");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı döneminde Mısır’a vali olarak atanan Arnavut kökenli kişi kimdir?");

        Cevaplistesi.add("Mehmet Ali Paşa");
        Cevaplistesi.add("İbrahim Paşa");
        Cevaplistesi.add("Abdulvahap Paşa");
        Cevaplistesi.add("Ahmet Çelebi");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı Devleti'nde para cezaları ve resmi işlemler için alınan vergi aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Haraç");
        Cevaplistesi.add("Rusüm");
        Cevaplistesi.add("Cizye");
        Cevaplistesi.add("Avarız");

        DogruListesi.add("B");

        Sorulistesi.add("Osmanlı Devleti'nde Duyun-u Umumiye hangi padişah zamanında kurulmuştur?");

        Cevaplistesi.add("II. Abdulhamid");
        Cevaplistesi.add("I. Abdulhamid");
        Cevaplistesi.add("II. Mahmut");
        Cevaplistesi.add("Abdülmecid");

        DogruListesi.add("A");



        Sorulistesi.add("Osmanlı Devleti’nde esnafların oluşturduğu birlik aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Lonca Teşkilatı");
        Cevaplistesi.add("İmarethaneler");
        Cevaplistesi.add("Darülaceze");
        Cevaplistesi.add("Derbent");

        DogruListesi.add("A");



        Sorulistesi.add("Aşağıdakilerden hangisi Divan-ı Hümayundaki görevlilerden biri değildir?");

        Cevaplistesi.add("Defterdar");
        Cevaplistesi.add("Nişancı");
        Cevaplistesi.add("Kazasker");
        Cevaplistesi.add("Subaşı");

        DogruListesi.add("D");


        Sorulistesi.add("Karadeniz’in Türk gölü haline gelmesi aşağıdakilerden hangisinin fethiyle gerçekleşmiştir?");

        Cevaplistesi.add("Amasra");
        Cevaplistesi.add("Kırım");
        Cevaplistesi.add("İstanbul");
        Cevaplistesi.add("Azak");

        DogruListesi.add("B");


        Sorulistesi.add("Tuğrul Bey’in ölümünden sonra tahta kim geçmiştir?");

        Cevaplistesi.add("Alp Arslan");
        Cevaplistesi.add("Kutalmış");
        Cevaplistesi.add("Resul Tegin");
        Cevaplistesi.add("Arslan Yabgu");

        DogruListesi.add("A");


        Sorulistesi.add("Doğunun ve Batının hükümdarı unvanını alan Selçuklu Sultanı kimdir?");

        Cevaplistesi.add("Çağrı Bey");
        Cevaplistesi.add("Selçuk Bey");
        Cevaplistesi.add("Tuğrul Bey");
        Cevaplistesi.add("Melikşah");

        DogruListesi.add("C");



        Sorulistesi.add("Selçukluların 1038 yılında Gazneliler’e karşı ezici üstünlük sağladığı savaş aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Malazgirt");
        Cevaplistesi.add("Dandanakan");
        Cevaplistesi.add("Pasinler");
        Cevaplistesi.add("Serahs");

        DogruListesi.add("D");


        Sorulistesi.add("Alp Arslan'nın Ebûlfeth unvanını almasını sağlayan olay aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Ani'nin fethi");
        Cevaplistesi.add("Merv'in fethi");
        Cevaplistesi.add("Büst'ün fethi");
        Cevaplistesi.add("Herat'ın fethi");

        DogruListesi.add("A");



        Sorulistesi.add("Türklerin kullandığı ilk takvim hangisidir?");

        Cevaplistesi.add("12 Hayvanlı Türk Takvimi");
        Cevaplistesi.add("Hicri Takvim");
        Cevaplistesi.add("Miladı Takvim");
        Cevaplistesi.add("Rumi Takvim");

        DogruListesi.add("A");



        Sorulistesi.add("İslam öncesi Arap Yarım Adasında haram aylarda yapılan savaşlara ne denir?");

        Cevaplistesi.add("Mute");
        Cevaplistesi.add("Hendek");
        Cevaplistesi.add("Ficar");
        Cevaplistesi.add("Uhud");

        DogruListesi.add("C");



        Sorulistesi.add("İslamiyet'in Hindistan'da yayılmasını sağlayan Türk devleti hangisidir?");

        Cevaplistesi.add("Gazneliler");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Karahanlılar");
        Cevaplistesi.add("Tolunoğulları");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı Devleti’nin mali ve idari işlerinin yürütülmesinden sorumlu olan sınıf hangisidir?");

        Cevaplistesi.add("Devşirme");
        Cevaplistesi.add("İlmiye");
        Cevaplistesi.add("Kalemiye");
        Cevaplistesi.add("Seyfiye");

        DogruListesi.add("C");


        Sorulistesi.add("Kanuni döneminde hizmet eden, asıl adı “Hızır Reis” olan, ünlü denizci kimdir?");

        Cevaplistesi.add("Oruç Reis");
        Cevaplistesi.add("Kemal Reis");
        Cevaplistesi.add("Piyale Reis");
        Cevaplistesi.add("Barbaros Hayrettin Paşa");

        DogruListesi.add("D");



        Sorulistesi.add("Osmanlı Devleti’nin ilk beyler beyliği, aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Rumeli");
        Cevaplistesi.add("Bağdat");
        Cevaplistesi.add("Mısır");
        Cevaplistesi.add("Anadolu");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı Devleti’nde hangi sanatla uğraşanlara “nakkaş” adı verilirdi?");

        Cevaplistesi.add("Ebru");
        Cevaplistesi.add("Hat");
        Cevaplistesi.add("Tezhip");
        Cevaplistesi.add("Minyatür");

        DogruListesi.add("D");



        Sorulistesi.add("Osmanlı Devleti’nin, doğuda en geniş sınırlara ulaştığı anlaşma hangisidir?");

        Cevaplistesi.add("Ferhat Paşa");
        Cevaplistesi.add("Kasr-ı Şirin");
        Cevaplistesi.add("Serav");
        Cevaplistesi.add("Nasuh Paşa");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı Devleti’nde yeniçerilerin üç ayda bir aldıkları maaşa ne denirdi?");

        Cevaplistesi.add("Ulufe");
        Cevaplistesi.add("Reaya");
        Cevaplistesi.add("Müsellem");
        Cevaplistesi.add("Cebelü");

        DogruListesi.add("A");


        Sorulistesi.add("Edirne, hangi padişah döneminde başkent yapılmıştır?");

        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("I. Murad");
        Cevaplistesi.add("Yıldırım Beyazıt");
        Cevaplistesi.add("II. Murad");

        DogruListesi.add("B");



        Sorulistesi.add("Osmanlı Devleti’nde medreselerde ders veren öğretmenlere ne ad verilirdi?");

        Cevaplistesi.add("Kadı");
        Cevaplistesi.add("Müderris");
        Cevaplistesi.add("Kazasker");
        Cevaplistesi.add("Müftü");

        DogruListesi.add("B");




        Sorulistesi.add("Aşağıdaki Osmanlı padişahlarından hangisi yeniçeriler tarafından katledilmiştir?");

        Cevaplistesi.add("Genç Osman");
        Cevaplistesi.add("I. Murat");
        Cevaplistesi.add("Fatih Sultan Mehmet");
        Cevaplistesi.add("III. Mehmet");

        DogruListesi.add("A");


        Sorulistesi.add("Aşağıdakilerden hangisi Bizans valilerine verilen isimdir?");

        Cevaplistesi.add("Derebey");
        Cevaplistesi.add("Subaşı");
        Cevaplistesi.add("Tekfur");
        Cevaplistesi.add("Padişah");

        DogruListesi.add("C");



        Sorulistesi.add("Osmanlı Devleti, ilk dış borcunu aşağıdaki devletlerin hangisinden almıştır?");

        Cevaplistesi.add("Rusya");
        Cevaplistesi.add("İtalya");
        Cevaplistesi.add("İngiltere");
        Cevaplistesi.add("Fransa");

        DogruListesi.add("C");


        Sorulistesi.add("Aşağıdakilerden hangisi dirlik topraklarından değildir?");

        Cevaplistesi.add("Has");
        Cevaplistesi.add("Mukataa");
        Cevaplistesi.add("Tımar");
        Cevaplistesi.add("Zeamet");

        DogruListesi.add("B");


        Sorulistesi.add("Aşağıdakilerden hangisi Eflak ve Boğdan beylerine verilen unvandır?");

        Cevaplistesi.add("Padişah");
        Cevaplistesi.add("Tekfur");
        Cevaplistesi.add("Voyvodo");
        Cevaplistesi.add("Melik");

        DogruListesi.add("C");


        Sorulistesi.add("Doğu Roma İmparatorluğu’na son veren devlet, aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Osmanlı");
        Cevaplistesi.add("Selçuklu");
        Cevaplistesi.add("İlhanlı");
        Cevaplistesi.add("Safevi");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlı Devleti’nde ilk defa imtiyaz elde eden ulus?");

        Cevaplistesi.add("Rumlar");
        Cevaplistesi.add("Sırplar");
        Cevaplistesi.add("Bulgarlar");
        Cevaplistesi.add("Ermeniler");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı'da ilk bağımsız olan ulus hangisidir?");

        Cevaplistesi.add("Bulgarlar");
        Cevaplistesi.add("Sırplar");
        Cevaplistesi.add("Rumlar");
        Cevaplistesi.add("Ermeniler");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlı Devleti ilk dış borcunu kimin döneminde almıştır?");

        Cevaplistesi.add("Sultan Abdulaziz");
        Cevaplistesi.add("Sultan Abdulmecit");
        Cevaplistesi.add("II.Abdulhamit");
        Cevaplistesi.add("I.Abdulhamit");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlı Devleti, Paris Barış Konferansında(1856) etkili olmak için hangisini yayınlamıştır?");

        Cevaplistesi.add("Kanun-u Cedid");
        Cevaplistesi.add("Mecelle Kanunu");
        Cevaplistesi.add("Tanzimat Fermanı");
        Cevaplistesi.add("Islahat Fermanı");

        DogruListesi.add("D");


        Sorulistesi.add("Osmanlı Devleti hangi antlaşma ile Avrupa devleti sayılmıştır?");

        Cevaplistesi.add("Kütahya Antlaşması");
        Cevaplistesi.add("Paris Antlaşması");
        Cevaplistesi.add("Londra Antlaşması");
        Cevaplistesi.add("Sevr Antlaşması");

        DogruListesi.add("B");


        Sorulistesi.add("I. Dünya Savaşı'nın çıkmasının en büyük nedeni aşağıdakilerden hangisidir?");

        Cevaplistesi.add("Dini Sebepler");
        Cevaplistesi.add("Milliyetçilik");
        Cevaplistesi.add("Faşizm");
        Cevaplistesi.add("Sömürgecilik");

        DogruListesi.add("D");



        Sorulistesi.add("SSCB'nin ilk devlet başkanı kimdir?");

        Cevaplistesi.add("Josef Stalin");
        Cevaplistesi.add("Vladimir Lenin");
        Cevaplistesi.add("Mihail Gorbaçov");
        Cevaplistesi.add("Karl Max");

        DogruListesi.add("B");



        Sorulistesi.add("Rusların, Türk halklarına yönelik asimile politikasına verilen isim");

        Cevaplistesi.add("Kollektifleştirme");
        Cevaplistesi.add("Müridizm");
        Cevaplistesi.add("Asabiyet");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("C");


        Sorulistesi.add("İki devlet-tek millet sözüyle andığımız, kardeş ülke olarak bilinen devletimiz hangisidir?");

        Cevaplistesi.add("Azerbaycan");
        Cevaplistesi.add("Özbekistan");
        Cevaplistesi.add("Türkmenistan");
        Cevaplistesi.add("Kırgızistan");

        DogruListesi.add("A");



        Sorulistesi.add("İslamiyetten önce Türklerde cenaze törenlerine ne ad verilirdi?");

        Cevaplistesi.add("Kam");
        Cevaplistesi.add("Ölgü");
        Cevaplistesi.add("Kült");
        Cevaplistesi.add("Yuğ");

        DogruListesi.add("D");


        Sorulistesi.add("İslamiyetten önce Türklerde cenaze törenlerine ne ad verilirdi?");

        Cevaplistesi.add("Kam");
        Cevaplistesi.add("Ölgü");
        Cevaplistesi.add("Kült");
        Cevaplistesi.add("Yuğ");

        DogruListesi.add("D");


        Sorulistesi.add("Şuanda ordumuzun kullandığı onluk sistemi kim bulmuştur?");

        Cevaplistesi.add("İstemi Yabgu");
        Cevaplistesi.add("Teoman");
        Cevaplistesi.add("Attila");
        Cevaplistesi.add("Mete Han");

        DogruListesi.add("D");



        Sorulistesi.add("Türklerde ilk devlet teşkilatı hangisi zamanında kurulmuştur?");

        Cevaplistesi.add("Uygurlar");
        Cevaplistesi.add("Selçuklular");
        Cevaplistesi.add("Göktürkler");
        Cevaplistesi.add("Asya Hun Devleti");

        DogruListesi.add("D");

        Sorulistesi.add("Dünyanın en uzun destanı olan Manas Destanı hangi devlete aittir?");

        Cevaplistesi.add("Kırgızistan");
        Cevaplistesi.add("Özbekistan");
        Cevaplistesi.add("Türkmenistan");
        Cevaplistesi.add("Tacikistan");

        DogruListesi.add("A");

        Sorulistesi.add("Altın Orda devletini hangi hükümdar yıkmıştır?");

        Cevaplistesi.add("Timur");
        Cevaplistesi.add("Cengiz Han");
        Cevaplistesi.add("Gazneli Mahmud");
        Cevaplistesi.add("Berke Han");

        DogruListesi.add("A");



        Sorulistesi.add("Selçukluda meliklerin, devlet yönetimini hazırlanmasına kim yardım ederdi?");

        Cevaplistesi.add("Lala");
        Cevaplistesi.add("Atabey");
        Cevaplistesi.add("Defterdar");
        Cevaplistesi.add("Sipahi");

        DogruListesi.add("B");


        Sorulistesi.add("Osmanlıda şehzadelerin devlet yönetimini hazırlanmasına kim yardım ederdi?");

        Cevaplistesi.add("Lala");
        Cevaplistesi.add("Atabey");
        Cevaplistesi.add("Vezir");
        Cevaplistesi.add("Kalemdar");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlıda şehzadelerin devlet yönetimini hazırlanmasına kim yardım ederdi?");

        Cevaplistesi.add("Lala");
        Cevaplistesi.add("Atabey");
        Cevaplistesi.add("Vezir");
        Cevaplistesi.add("Kalemdar");

        DogruListesi.add("A");

        Sorulistesi.add("Ünlü Taç Mahal'i hangi devlet inşaa etmiştir?");

        Cevaplistesi.add("Delhi Sultanlığı");
        Cevaplistesi.add("Kıpçaklar");
        Cevaplistesi.add("Babürler");
        Cevaplistesi.add("Safeviler");

        DogruListesi.add("C");


        Sorulistesi.add("Ünlü Taç Mahal'i hangi devlet inşaa etmiştir?");

        Cevaplistesi.add("Delhi Sultanlığı");
        Cevaplistesi.add("Kıpçaklar");
        Cevaplistesi.add("Babürler");
        Cevaplistesi.add("Safeviler");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlıda ilk kağıt para hangi padişah döneminde basılmıştır?");

        Cevaplistesi.add("Fatih");
        Cevaplistesi.add("II.Abdulhamit");
        Cevaplistesi.add("Abdulmecit");
        Cevaplistesi.add("Kanuni");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlıda ilk şeyhülislam kimdir?");

        Cevaplistesi.add("Akşemseddin");
        Cevaplistesi.add("Şeyh Maşuki");
        Cevaplistesi.add("Molla Fenari");
        Cevaplistesi.add("Hoca Mehmed");

        DogruListesi.add("C");


        Sorulistesi.add("Osmanlıda kapıkulu askerlerinin üç ayda bir aldıkları maaş?");

        Cevaplistesi.add("Ulufe");
        Cevaplistesi.add("Cülus");
        Cevaplistesi.add("Öşr");
        Cevaplistesi.add("Cizye");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlıda loncaların önemini kaybetmesine yol açan gelişme nedir?");

        Cevaplistesi.add("Sanayi İnkilabı");
        Cevaplistesi.add("Artan vergiler");
        Cevaplistesi.add("Askeri Sistem");
        Cevaplistesi.add("Hiçbiri");

        DogruListesi.add("A");


        Sorulistesi.add("Osmanlıda ekonominin temelini oluşturan en önemli etken nedir?");

        Cevaplistesi.add("Tarım");
        Cevaplistesi.add("Sanayi");
        Cevaplistesi.add("Silah üretimi");
        Cevaplistesi.add("Gemicilik");

        DogruListesi.add("A");


        Sorulistesi.add("Türklerde yönetme yetkisinin tanrı tarafından verildiği inancı nedir?");

        Cevaplistesi.add("Ud");
        Cevaplistesi.add("Yuğ");
        Cevaplistesi.add("Kut");
        Cevaplistesi.add("Bed");

        DogruListesi.add("C");


        Sorulistesi.add("Eski Türklerin astronomiyle ilgilendiklerinin ispatı nedir?");

        Cevaplistesi.add("Rumi Takvim");
        Cevaplistesi.add("Celali Takvim");
        Cevaplistesi.add("12 Hayvanlı Takvim");
        Cevaplistesi.add("Miladi");

        DogruListesi.add("C");

        Sorulistesi.add("Türkler çadıra ne ad verir?");

        Cevaplistesi.add("Yurt");
        Cevaplistesi.add("Böz");
        Cevaplistesi.add("Ostak");
        Cevaplistesi.add("Kamdu");

        DogruListesi.add("A");


















    }


}
