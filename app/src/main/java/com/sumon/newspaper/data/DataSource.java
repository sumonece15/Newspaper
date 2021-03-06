package com.sumon.newspaper.data;

import com.sumon.newspaper.R;
import com.sumon.newspaper.models.Newspaper;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Newspaper> getBanglaNewsPaper() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("দৈনিক প্রথম আলো", R.drawable.prothom_alo, "https://www.prothomalo.com/"));
        dataList.add(new Newspaper("দৈনিক বাংলাদেশ প্রতিদিন", R.drawable.bd_pratidin, "https://www.bd-pratidin.com/"));
        dataList.add(new Newspaper("আমাদের সময়", R.drawable.amader_somoy, "https://www.amadershomoy.com/"));
        dataList.add(new Newspaper("দৈনিক ইনকিলাব", R.drawable.inqilab, "https://www.dailyinqilab.com/"));
        dataList.add(new Newspaper("দৈনিক ইত্তেফাক", R.drawable.ittefaq, "https://www.ittefaq.com.bd/"));
        dataList.add(new Newspaper("দৈনিক জনকণ্ঠ", R.drawable.janakantha, "https://www.dailyjanakantha.com/"));
        dataList.add(new Newspaper("দৈনিক যায়যায়দিন", R.drawable.jay_jay_din, "https://www.jaijaidinbd.com/"));
        dataList.add(new Newspaper("দৈনিক যুগান্তর", R.drawable.jugantor, "https://www.jugantor.com/"));
        dataList.add(new Newspaper("দৈনিক কালের কণ্ঠ", R.drawable.kaler_kantha, "https://www.kalerkantho.com/"));
        dataList.add(new Newspaper("দৈনিক মানবজমিন", R.drawable.manabzamin, "https://mzamin.com/"));
        dataList.add(new Newspaper("দৈনিক মানবকণ্ঠ", R.drawable.manob_kantha, "https://www.manobkantha.com.bd/"));
        dataList.add(new Newspaper("দৈনিক নয়া দিগন্ত", R.drawable.naya_diganta, "https://www.dailynayadiganta.com/"));
        dataList.add(new Newspaper("দৈনিক সমকাল", R.drawable.samakal, "https://samakal.com/"));
        dataList.add(new Newspaper("দৈনিক ভোরের কাগজ", R.drawable.vorer_kagoj, "https://www.bhorerkagoj.com/"));

        return dataList;
    }

    public static ArrayList<Newspaper> getEnglishNewsPaper() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("The Daily Star", R.drawable.the_daily_star, "https://www.thedailystar.net/"));
        dataList.add(new Newspaper("The Daily Observer", R.drawable.the_daily_observer, "https://www.observerbd.com/"));
        dataList.add(new Newspaper("The Independent", R.drawable.the_independent, "https://m.theindependentbd.com/"));
        dataList.add(new Newspaper("The Financial Express", R.drawable.financial_express, "https://thefinancialexpress.com.bd/"));
        dataList.add(new Newspaper("New Age", R.drawable.new_age, "https://www.newagebd.net/"));
        dataList.add(new Newspaper("Business Insider", R.drawable.business_insider, "https://www.businessinsiderbd.com/"));
        dataList.add(new Newspaper("BBC News", R.drawable.bbc, "https://www.bbc.com/news/topics/cm8m1391ddrt/news-daily"));
        dataList.add(new Newspaper("China Daily", R.drawable.china_daily, "http://www.chinadaily.com.cn/"));
        dataList.add(new Newspaper("CNBC", R.drawable.cnbc, "https://www.cnbc.com/world/?region=world"));
        dataList.add(new Newspaper("CNN", R.drawable.cnn, "https://edition.cnn.com/"));
        dataList.add(new Newspaper("Daily Mirror", R.drawable.daily_mirror, "https://www.mirror.co.uk/"));
        dataList.add(new Newspaper("Dawn", R.drawable.dawn, "https://www.dawn.com/"));
        dataList.add(new Newspaper("ESPNcricinfo", R.drawable.espn_cricinfo, "https://www.espncricinfo.com/"));
        dataList.add(new Newspaper("Fox News", R.drawable.fox_news, "https://www.foxnews.com/"));
        dataList.add(new Newspaper("Fox Sports Networks", R.drawable.fox_sports, "https://www.foxsports.com/"));
        dataList.add(new Newspaper("GSMArena", R.drawable.gsmarena, "https://www.gsmarena.com/"));
        dataList.add(new Newspaper("The Guardian", R.drawable.the_guardian, "https://www.theguardian.com/international"));
        dataList.add(new Newspaper("The New York Times", R.drawable.new_york_times, "https://www.nytimes.com/"));
        dataList.add(new Newspaper("Sky News", R.drawable.sky_news, "https://news.sky.com/"));
        dataList.add(new Newspaper("Sky Sports", R.drawable.sky_sports, "https://www.skysports.com/"));
        dataList.add(new Newspaper("The Sydney Morning Herald", R.drawable.sydney_morning_herald, "https://www.smh.com.au/"));
        dataList.add(new Newspaper("The Asahi Shimbun", R.drawable.the_asahi_simbun, "http://www.asahi.com/ajw/"));
        dataList.add(new Newspaper("(The Wall Street Journal", R.drawable.the_wall_street_journal, "https://www.wsj.com/"));
        dataList.add(new Newspaper("The Washington Post", R.drawable.the_washington_post, "https://www.washingtonpost.com/"));
        dataList.add(new Newspaper("The Times of India", R.drawable.times_of_india, "https://timesofindia.indiatimes.com/"));
        dataList.add(new Newspaper("USA Today", R.drawable.usa_today, "https://www.usatoday.com/"));
        dataList.add(new Newspaper("Voice of America", R.drawable.voice_of_america, "https://www.voanews.com/"));
        dataList.add(new Newspaper("Zaman", R.drawable.zaman, "https://www.hurriyetdailynews.com/index/zaman-newspaper"));


        return dataList;
    }

    public static ArrayList<Newspaper> getTvNews() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("Boishakhi TV", R.drawable.boishakhi_tv, "http://boishakhionline.com/"));
        dataList.add(new Newspaper("BANGLAVISION TV", R.drawable.banglavision_tv, "https://www.bvnews24.com/"));
        dataList.add(new Newspaper("Channel 24", R.drawable.channel24_tv, "https://www.channel24bd.tv/"));
        dataList.add(new Newspaper("Channel 9", R.drawable.channel_9_tv, "http://www.channelninebd.tv/channel9/home.php"));
        dataList.add(new Newspaper("Channel i", R.drawable.channel_i_tv, "https://www.channelionline.com/"));
        dataList.add(new Newspaper("Desh TV", R.drawable.desh_tv, "https://www.desh.tv/"));
        dataList.add(new Newspaper("Ekattor TV", R.drawable.ekattor_tv, "https://ekattor.tv/"));
        dataList.add(new Newspaper("Ekushey TV", R.drawable.ekushey_tv, "https://www.ekushey-tv.com/"));
        dataList.add(new Newspaper("Independent Television", R.drawable.independent_tv, "https://www.independent24.com/"));
        dataList.add(new Newspaper("Jamuna TV", R.drawable.jamuna_tv, "https://www.jamuna.tv/"));
        dataList.add(new Newspaper("News24 TV", R.drawable.news24_tv, "https://www.news24bd.tv/"));
        dataList.add(new Newspaper("NTV", R.drawable.n_tv, "https://www.ntvbd.com/"));
        dataList.add(new Newspaper("RTV", R.drawable.r_tv, "https://www.rtvonline.com/"));
        dataList.add(new Newspaper("Somoy News", R.drawable.somoy_tv, "http://somoynews.tv/"));

        return dataList;
    }

    public  static ArrayList<Newspaper> getJobNews(){
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("Bd Jobs 1", R.drawable.bd_jobs1, "https://www.bdjobs.com/"));
        dataList.add(new Newspaper("Bikroy Jobs", R.drawable.bikroy_jobs, "https://bikroy.com/bn/jobs"));
        dataList.add(new Newspaper("Skill Dot Jobs", R.drawable.skill_dot_jobs, "https://skill.jobs/"));
        dataList.add(new Newspaper("Bd Jobs 2", R.drawable.bd_jobs2, "http://bdjobs.com.bd/"));
        dataList.add(new Newspaper("NRB Jobs", R.drawable.nrb_jobs, "https://www.nrbjobs.com/"));
        dataList.add(new Newspaper("Bd Career", R.drawable.bd_career, "https://bd-career.com/"));
        dataList.add(new Newspaper("Bd Jobs Mela", R.drawable.bd_jobs_mela, "https://bdjobsmela.com/"));
        dataList.add(new Newspaper("Chakrir Khobor 2", R.drawable.chakrir_khobor2, "https://chakrirkhobor.net/"));
        dataList.add(new Newspaper("Career Jet", R.drawable.career_jet, "https://www.careerjet.com.bd/"));
        dataList.add(new Newspaper("Chakrir Khobor 1", R.drawable.chakrir_khobor1, "https://chakrikhobor.com/"));
        dataList.add(new Newspaper("Jobs Dot Com Dot Bd", R.drawable.jobs_dot_com_dot_bd, "http://www.job.com.bd/"));
        dataList.add(new Newspaper("Bd Jobs Today", R.drawable.bd_jobs_today, "http://www.bdjobstoday.com/"));




        return dataList;
    }



    public static ArrayList<Newspaper> getDhaka() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("দৈনিক গাজীপুর ", R.drawable.dainik_gazipur, "http://dainikgazipur.com/"));
        dataList.add(new Newspaper("দৈনিক দেশের আলো", R.drawable.desher_alo, "http://dainikdesheralo.com/"));
        dataList.add(new Newspaper("লাইভ নারায়ণগঞ্জ", R.drawable.live_narayanganj, "http://www.livenarayanganj.com/"));
        dataList.add(new Newspaper("নিউজ টাঙ্গাইল", R.drawable.news_tangail, "https://www.newstangail.com/"));
        dataList.add(new Newspaper("আওয়ার নারায়ণগঞ্জ ", R.drawable.our_narayanganj, "https://www.ournarayanganj24.com/"));
        dataList.add(new Newspaper("রাজবাড়ী নিউজ ২৪ ", R.drawable.rajbari_news24, "https://rajbarinews24.com/"));
        dataList.add(new Newspaper("আমার বিক্রমপুর", R.drawable.amar_bikrampur, "http://amarbikrampur.com/"));
        dataList.add(new Newspaper(" শরীয়তপুর বার্তা ", R.drawable.shariatpur_barta, "https://www.shariatpurbarta.com/"));
        dataList.add(new Newspaper("নরসিংদী টাইম্ ", R.drawable.the_narsingdi_times, "http://narsingditimes.com/"));
        dataList.add(new Newspaper("মুন্সিগঞ্জের কাগজ ", R.drawable.munshigonjer_kagoj, "https://www.munshigonjerkagoj.com/"));

        return dataList;
    }


    public static ArrayList<Newspaper> getChittagong() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("আমাদের রামু", R.drawable.amader_ramu, "http://amaderramu.com/"));
        dataList.add(new Newspaper("ব্রাহ্মণবাড়িয়া ২৪", R.drawable.brahmanbaria24, "http://brahmanbaria24.com/"));
        dataList.add(new Newspaper("চাঁদপুর টাইম্‌স", R.drawable.chandpur_times, "https://chandpurtimes.com/"));
        dataList.add(new Newspaper("কুমিল্লার কাগজ", R.drawable.comillar_kagoj, "https://comillarkagoj.com/"));
        dataList.add(new Newspaper("দৈনিক আজাদি", R.drawable.dainik_azadi, "https://dainikazadi.net/"));
        dataList.add(new Newspaper("দৈনিক কক্সবাজার", R.drawable.dainik_coxs_bazar, "https://www.dainikcoxsbazar.com/"));
        dataList.add(new Newspaper(" লক্ষ্মীপুর ২৪", R.drawable.lakshmipur24, "https://www.lakshmipur24.com/"));
        dataList.add(new Newspaper("নোয়াখালী প্রতিদিন", R.drawable.noakhali_protidin, "http://noakhalipratidin.com.bd/"));
        dataList.add(new Newspaper("নতুন ফেনী", R.drawable.notun_feni, "https://www.natunfeni.com/"));
        dataList.add(new Newspaper("টেকনাফ টুডে", R.drawable.teknaf_today, "https://teknaftoday.com/"));

        return dataList;

    }


    public static ArrayList<Newspaper> getBarishal() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("দৈনিক আজকের ভোলা", R.drawable.dainik_ajker_vola, "http://www.ajkerbhola.com/"));
        dataList.add(new Newspaper("দৈনিক পিরোজপুর কন্ঠ", R.drawable.pirojpur_kantha, "https://pirojpurkantho.com/"));
        dataList.add(new Newspaper("বরিশাল বানী", R.drawable.barishal_bani, "https://barisalbani.com/"));
        dataList.add(new Newspaper("বরিশাল টাইমস", R.drawable.barishal_times, "https://www.barishaltimes.com/"));
        dataList.add(new Newspaper("ভোরের আলো", R.drawable.vorer_alo, "http://daynikvoreralo.com/"));
        dataList.add(new Newspaper("আজকের বার্তা", R.drawable.ajker_barta, "https://ajkerbarta.com/"));
        dataList.add(new Newspaper("আজকের পরিবর্তন", R.drawable.ajker_paribartan, "https://ajkerparibartan.com/"));
        dataList.add(new Newspaper("পত্রিকা একাত্তর", R.drawable.patrika_ekattor, "https://www.patrika71.com/"));
        dataList.add(new Newspaper("দৈনিক স্বতঃকন্ঠ", R.drawable.shata_kantha, "https://dainikshatakantha.com/"));
        dataList.add(new Newspaper("দৈনিক মতবাদ", R.drawable.motobad, "http://dailymatobad.com/"));

        return dataList;

    }

    public static ArrayList<Newspaper> getSylhet() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("দৈনিক কাজির বাজার", R.drawable.daily_kazirbazar, "https://kazirbazar.com/"));
        dataList.add(new Newspaper("দৈনিক সিলেটের দিনকাল", R.drawable.daily_sylheter_dinkal, "https://www.dailysylheterdinkal.com/"));
        dataList.add(new Newspaper("দৈনিক মৌলভীবাজার", R.drawable.dainik_moulvibazar, "http://dainikmoulvibazar.com/"));
        dataList.add(new Newspaper("একাত্তরের কথা", R.drawable.ekattorer_kotha, "https://ekattorer-kotha.com/"));
        dataList.add(new Newspaper("দৈনিক হাওরাঞ্চলের কথা", R.drawable.haoranchaler_kotha, "https://haoranchalerkotha.com/"));
        dataList.add(new Newspaper("দৈনিক সবুজ সিলেট", R.drawable.sabuj_sylhet, "https://sabujsylhet.com/"));
        dataList.add(new Newspaper("সুনামগঞ্জের খবর", R.drawable.sunamgonjer_khobor, "http://sunamganjerkhobor.com/"));
        dataList.add(new Newspaper("সিলেট এক্সপ্রেস", R.drawable.sylhet_express, "http://www.sylhetexpress.com/"));
        dataList.add(new Newspaper("সিলেট সুরমা", R.drawable.sylhet_surma, "http://www.sylhetsurma.com/"));
        dataList.add(new Newspaper("সিলেটের সকাল", R.drawable.sylheter_sokal, "http://sylhetersokal.com/"));


        return dataList;

    }


    public static ArrayList<Newspaper> getRangpur() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("কুড়িগ্রাম লাইভ", R.drawable.kurigram_live, "https://www.kurigramlive.com/"));
        dataList.add(new Newspaper("দৈনিক আজকের জনগণ", R.drawable.ajker_janagan, "https://ajkerjanagan.net/"));
        dataList.add(new Newspaper("আজকের কুড়িগ্রাম", R.drawable.kurigram_live, "https://www.ajkerkurigram.news/"));
        dataList.add(new Newspaper("নীলফামারি বার্তা", R.drawable.nilphamari_barta, "https://www.nilphamaribarta.com/"));
        dataList.add(new Newspaper("লালমনিরহাট বার্তা", R.drawable.lalmonirhat_barta, "https://www.lalmonirhatbarta.com/"));
        dataList.add(new Newspaper("দিনাজপুর নিউজ", R.drawable.dinajpur_news, "https://dinajpurnews.com/"));
        dataList.add(new Newspaper("দৈনিক পঞ্চগড়", R.drawable.dainik_panchagarh, "https://www.dainikpanchagarh.com/"));
        dataList.add(new Newspaper("রংপুর টাইমস", R.drawable.rangpur_times, "https://rangpurtimes.com/"));
        dataList.add(new Newspaper("বীরগঞ্জ প্রতিদিন", R.drawable.birganj_pratidin, "https://birganjpratidin.com/"));
        dataList.add(new Newspaper("কুড়িগ্রাম বার্তা", R.drawable.kurigram_barta, "https://www.kurigrambarta.com/"));


        return dataList;

    }

    public static ArrayList<Newspaper> getMymensingh() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("দৈনিক ময়মনসিংহ প্রতিদিন", R.drawable.dainik_mymensingh_pratidin, "https://dainikmymensinghpratidin.com/"));
        dataList.add(new Newspaper("ময়মনসিংহ লাইভ", R.drawable.mymensingh_live, "http://mymensinghlive.com/"));
        dataList.add(new Newspaper("জনপ্রিয়", R.drawable.janaprio, "https://janaprio.com/"));
        dataList.add(new Newspaper("শেরপুর নিউজ ২৪", R.drawable.sherpur_news24, "https://sherpurnews24.com/"));
        dataList.add(new Newspaper("শ্যামল বাংলা", R.drawable.shamol_bangla, "https://shamolbangla24.com/"));
        dataList.add(new Newspaper("শেরপুর টাইমস", R.drawable.sherpur_times, "https://sherpurtimes.com/"));
        dataList.add(new Newspaper("দৈনিক তথ্যধারা", R.drawable.dainik_totthodhara, "http://dailytathyadhara.com/"));
        dataList.add(new Newspaper("দৈনিক মোমেনশাহী", R.drawable.momenshahi, "http://www.dailymomenshahi.com/"));
        dataList.add(new Newspaper("শেরপুর টুডে", R.drawable.sherpur_today, "https://dailybanglarchokh.com/"));
        dataList.add(new Newspaper("দৈনিক জামালপুর", R.drawable.dainik_jamalpur, "https://www.dainikjamalpur.com/"));


        return dataList;

    }

    public static ArrayList<Newspaper> getKhulna() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("খুলনা টাইমস", R.drawable.khulna_times, "https://khulnatimes.com/"));
        dataList.add(new Newspaper("সুন্দরবন টাইমস.কম", R.drawable.sundarbon_times, "https://www.sundarbontimes.com/"));
        dataList.add(new Newspaper("দৈনিক খুলনা অঞ্চল", R.drawable.khulnanchal, "https://khulnanchal.com/"));
        dataList.add(new Newspaper("সমাজের কথা", R.drawable.somajer_kotha, "https://samajerkatha.com/"));
        dataList.add(new Newspaper("মেহেরপুর প্রতিদিন", R.drawable.meherpur_paratidin, "https://www.meherpurpratidin.com/"));
        dataList.add(new Newspaper("দৈনিক আমাদের চুয়াডাঙ্গা", R.drawable.amader_chuadanga, "https://dailyamaderchuadanga.com/"));
        dataList.add(new Newspaper("নড়াইল কন্ঠ", R.drawable.narail_kantha, "http://narailkantho.com/"));
        dataList.add(new Newspaper("দৈনিক সুপ্রভাত সাতক্ষীরা", R.drawable.suprovat_satkhira, "https://suprovatsatkhira.com/"));
        dataList.add(new Newspaper("দৈনিক লোকসমাজ", R.drawable.lok_somaj, "http://loksamaj.com/"));
        dataList.add(new Newspaper("বাংলার চোখ", R.drawable.banglar_chokh, "https://dailybanglarchokh.com/"));

        return dataList;

    }


    public static ArrayList<Newspaper> getRajshahi() {
        ArrayList<Newspaper> dataList = new ArrayList<>();

        dataList.add(new Newspaper("চাঁপাইনবাবগঞ্জ নিউজ", R.drawable.chapainawabganj_news, "http://www.chapainawabganjnews.com/"));
        dataList.add(new Newspaper("দৈনিক ইছামতি", R.drawable.dainik_ichamoti, "http://ichhamoti.com/"));
        dataList.add(new Newspaper("দৈনিক করতোয়া", R.drawable.dainik_karatoa, "https://www.dailykaratoa.com/"));
        dataList.add(new Newspaper("দৈনিক প্রভাতের আলো", R.drawable.dainik_provater_alo, "https://doinikprovateralo.com/"));
        dataList.add(new Newspaper("দৈনিক সিরাজগঞ্জ", R.drawable.dainik_sirajgonj, "https://dainiksirajganj.com/"));
        dataList.add(new Newspaper("দৈনিক দেশ সংবাদ", R.drawable.desh_sangbad, "https://www.deshsangbad.com/"));
        dataList.add(new Newspaper("দৈনিক গণধ্বনি প্রতিদিন", R.drawable.gonodhoni_protidin, "https://gd-protidin.com/"));
        dataList.add(new Newspaper("নিউজ পাবনা", R.drawable.news_pabna, "https://newspabna.com/"));
        dataList.add(new Newspaper("সোনালী সংবাদ", R.drawable.sonali_sangbad, "https://sonalisangbad.com/"));
        dataList.add(new Newspaper("সোনার দেশ", R.drawable.sonar_desh, "https://dailysonardesh.com/"));

        return dataList;

    }


}
