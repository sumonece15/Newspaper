package com.sumon.newspaper.data;

import com.sumon.newspaper.R;
import com.sumon.newspaper.models.Newspaper;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Newspaper> getBanglaNewsPaper(){
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("দৈনিক প্রথম আলো", R.drawable.prothom_alo,"https://www.prothomalo.com/"));
        dataList.add(new Newspaper("দৈনিক বাংলাদেশ প্রতিদিন", R.drawable.bd_pratidin,"https://www.bd-pratidin.com/"));
        dataList.add(new Newspaper("আমাদের সময়", R.drawable.amader_somoy,"https://www.amadershomoy.com/"));
        dataList.add(new Newspaper("দৈনিক ইনকিলাব", R.drawable.inqilab,"https://www.dailyinqilab.com/"));
        dataList.add(new Newspaper("দৈনিক ইত্তেফাক", R.drawable.ittefaq,"https://www.ittefaq.com.bd/"));
        dataList.add(new Newspaper("দৈনিক জনকণ্ঠ", R.drawable.janakantha,"https://www.dailyjanakantha.com/"));
        dataList.add(new Newspaper("দৈনিক যায়যায়দিন", R.drawable.jay_jay_din,"https://www.jaijaidinbd.com/"));
        dataList.add(new Newspaper("দৈনিক যুগান্তর", R.drawable.jugantor,"https://www.jugantor.com/"));
        dataList.add(new Newspaper("দৈনিক কালের কণ্ঠ", R.drawable.kaler_kantha,"https://www.kalerkantho.com/"));
        dataList.add(new Newspaper("দৈনিক মানবজমিন", R.drawable.manabzamin,"https://mzamin.com/"));
        dataList.add(new Newspaper("দৈনিক মানবকণ্ঠ", R.drawable.manob_kantha,"https://www.manobkantha.com.bd/"));
        dataList.add(new Newspaper("দৈনিক নয়া দিগন্ত", R.drawable.naya_diganta,"https://www.dailynayadiganta.com/"));
        dataList.add(new Newspaper("দৈনিক সমকাল", R.drawable.samakal,"https://samakal.com/"));
        dataList.add(new Newspaper("দৈনিক ভোরের কাগজ", R.drawable.vorer_kagoj,"https://www.bhorerkagoj.com/"));

        return dataList;
    }

    public static ArrayList<Newspaper> getEnglishNewsPaper(){
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("The Daily Star", R.drawable.the_daily_star,"https://www.thedailystar.net/"));
        dataList.add(new Newspaper("The Daily Observer", R.drawable.the_daily_observer,"https://www.observerbd.com/"));
        dataList.add(new Newspaper("The Independent", R.drawable.the_independent,"https://m.theindependentbd.com/"));
        dataList.add(new Newspaper("The Financial Express", R.drawable.financial_express,"https://thefinancialexpress.com.bd/"));
        dataList.add(new Newspaper("New Age", R.drawable.new_age,"https://www.newagebd.net/"));
        dataList.add(new Newspaper("Business Insider", R.drawable.business_insider,"https://www.businessinsiderbd.com/"));
        dataList.add(new Newspaper("BBC News", R.drawable.bbc,"https://www.bbc.com/news/topics/cm8m1391ddrt/news-daily"));
        dataList.add(new Newspaper("China Daily", R.drawable.china_daily,"http://www.chinadaily.com.cn/"));
        dataList.add(new Newspaper("CNBC", R.drawable.cnbc,"https://www.cnbc.com/world/?region=world"));
        dataList.add(new Newspaper("CNN", R.drawable.cnn,"https://edition.cnn.com/"));
        dataList.add(new Newspaper("Daily Mirror", R.drawable.daily_mirror,"https://www.mirror.co.uk/"));
        dataList.add(new Newspaper("Dawn", R.drawable.dawn,"https://www.dawn.com/"));
        dataList.add(new Newspaper("ESPNcricinfo", R.drawable.espn_cricinfo,"https://www.espncricinfo.com/"));
        dataList.add(new Newspaper("Fox News", R.drawable.fox_news,"https://www.foxnews.com/"));
        dataList.add(new Newspaper("Fox Sports Networks", R.drawable.fox_sports,"https://www.foxsports.com/"));
        dataList.add(new Newspaper("GSMArena", R.drawable.gsmarena,"https://www.gsmarena.com/"));
        dataList.add(new Newspaper("The Guardian", R.drawable.the_guardian,"https://www.theguardian.com/international"));
        dataList.add(new Newspaper("The New York Times", R.drawable.new_york_times,"https://www.nytimes.com/"));
        dataList.add(new Newspaper("Sky News", R.drawable.sky_news,"https://news.sky.com/"));
        dataList.add(new Newspaper("Sky Sports", R.drawable.sky_sports,"https://www.skysports.com/"));
        dataList.add(new Newspaper("The Sydney Morning Herald", R.drawable.sydney_morning_herald,"https://www.smh.com.au/"));
        dataList.add(new Newspaper("The Asahi Shimbun", R.drawable.the_asahi_simbun,"http://www.asahi.com/ajw/"));
        dataList.add(new Newspaper("(The Wall Street Journal", R.drawable.the_wall_street_journal,"https://www.wsj.com/"));
        dataList.add(new Newspaper("The Washington Post", R.drawable.the_washington_post,"https://www.washingtonpost.com/"));
        dataList.add(new Newspaper("The Times of India", R.drawable.times_of_india,"https://timesofindia.indiatimes.com/"));
        dataList.add(new Newspaper("USA Today", R.drawable.usa_today,"https://www.usatoday.com/"));
        dataList.add(new Newspaper("Voice of America", R.drawable.voice_of_america,"https://www.voanews.com/"));
        dataList.add(new Newspaper("Zaman", R.drawable.zaman,"https://www.hurriyetdailynews.com/index/zaman-newspaper"));




        return dataList;
    }

    public static ArrayList<Newspaper> getTvNews(){
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("Boishakhi TV",R.drawable.boishakhi_tv,"http://boishakhionline.com/"));
        dataList.add(new Newspaper("BANGLAVISION TV",R.drawable.banglavision_tv,"https://www.bvnews24.com/"));
        dataList.add(new Newspaper("Channel 24",R.drawable.channel24_tv,"https://www.channel24bd.tv/"));
        dataList.add(new Newspaper("Channel 9",R.drawable.channel_9_tv,"http://www.channelninebd.tv/channel9/home.php"));
        dataList.add(new Newspaper("Channel i",R.drawable.channel_i_tv,"https://www.channelionline.com/"));
        dataList.add(new Newspaper("Desh TV",R.drawable.desh_tv,"https://www.desh.tv/"));
        dataList.add(new Newspaper("Ekattor TV",R.drawable.ekattor_tv,"https://ekattor.tv/"));
        dataList.add(new Newspaper("Ekushey TV",R.drawable.ekushey_tv,"https://www.ekushey-tv.com/"));
        dataList.add(new Newspaper("Independent Television",R.drawable.independent_tv,"https://www.independent24.com/"));
        dataList.add(new Newspaper("Jamuna TV",R.drawable.jamuna_tv,"https://www.jamuna.tv/"));
        dataList.add(new Newspaper("News24 TV",R.drawable.news24_tv,"https://www.news24bd.tv/"));
        dataList.add(new Newspaper("NTV",R.drawable.n_tv,"https://www.ntvbd.com/"));
        dataList.add(new Newspaper("RTV",R.drawable.r_tv,"https://www.rtvonline.com/"));
        dataList.add(new Newspaper("Somoy News",R.drawable.somoy_tv,"http://somoynews.tv/"));

        return dataList;
    }

}
