package com.coderfaysal.sura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        AllItemList();


        FaysalAdapter faysalAdapter = new FaysalAdapter();
        listView.setAdapter(faysalAdapter);

    }




    private class FaysalAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint({"ViewHolder", "InflateParams"})
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = getLayoutInflater();
            convertView = layoutInflater.inflate(R.layout.main_item, null);

            TextView text_view = convertView.findViewById(R.id.mainText);
            LinearLayout main_lay = convertView.findViewById(R.id.main_lay);


            HashMap<String, String> hashMap = arrayList.get(position);
            String it_text = hashMap.get("title");
            String it_arabic_text = hashMap.get("arabic");
            String it_bangla_text = hashMap.get("bangla");


            text_view.setText(it_text);

            main_lay.setOnClickListener( view -> {

                DetailsActivity.MAIN_TEXT = it_text;
                DetailsActivity.ARABIC_TEXT = it_arabic_text;
                DetailsActivity.BANGLA_TEXT = it_bangla_text;


                startActivity(new Intent(MainActivity.this, DetailsActivity.class));
            });


            return convertView;
        }
    }



    public void AllItemList(){

        // New Content

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা ফাতিহা");
        hashMap.put("arabic", "الحمد لله رب العلمين . الرحمن الرحيم . ملك يوم الدين . إياك نعبد واياك تشتي - إهدنا الصراط المستقيم. صراط الذين أنعمت عليهم . ير المغضوب عليهم ولا الضالين ۔ آمین۔");
        hashMap.put("bangla", "উচ্চারণ : আলহামদু লিল্লাহি রাব্বিল আলামীন । আর-রাহমানির রাহীম। মালিকি ইয়াওমিদ্দীন । ইয়্যাকা না'বুদু ওয়া ইয়্যাকা নাসতাঈন। ইহুদিনা স সিরাত্বাল মুসতাক্বীম সিরাত্বাল্লাযীনা আআ’মতা আলাইহিম; গাইরিল মাগবি আলাইহিম ওয়ালা দ্বায়া-লীন। আমীন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা ফালাক");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم قل أعود برب الفلق . من شرما ځلق . ومن شر غاسق اذا ب . ومن شرالفشت في العقد ومن شر حاسد اذا حسد");
        hashMap.put("bangla", "উচ্চারণ: কুল আউযু বিরাব্বিল ফালাক্ব । মিন শাররি মা খালাক্ব। ওয়া মিন্ শাররি গাসির্কিন ইযা ওয়াক্কাব। ওয়া মিন শাররি ন্নাফফাসাতি ফিল উ'কা্দ। ওয়া মিন শাররি হাসিদিন ইযা হাসা্দ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা কুরাইশ");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم الإيلف قريش - الفهم رحلة البناء والتنيف . فليعبدوا رب هذا البيت . البنى اطعمهم من جوع وأمنهم مث خوف ");
        hashMap.put("bangla", "উচ্চারণ; লিঈলাফি কুরাইশিন, ঈলাফিহিম রিহলাতাশ শিতা-য়ি ওয়াছ ছাইফ। ফালইয়া’বুদ্ রাব্বা হাযাল বাইতিল্লাযী আত্বআ’মাহুম মিন জু-য়ি’ওঁ ওয়া আমানাহুম মিন্ খাউফ। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা মাউন");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم أرءيت الذي يكذب بالدين . ذلك الذي يد اليتيم. ولايك على طعام المشکی - فويل للمصلين الذين هم عن صلاتهم ساهون - الذين هم يا عون ويمنعون الماعون۔");
        hashMap.put("bangla", "উচ্চারণ : আরাআইতাল্লাযী ইউকাযযিবু বিদ্দীন, ফাযালিখাল্লাযী ইয়াদুউউ ইয়াতীম, ওয়ালা ইয়াহুদু আ’লা ত্বোআ'মি মিল্কীন, ফাওয়াইলুল্লিল মুসাল্লীন। আল্লাযীনা হুম আনসালাতিহিম সাহন। আল্লাযীনা হুম ইউরা উনা ওয়াইয়ামনাউ'নাল মাউন। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা কাওসার");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم إن أعطينى الكوثر . فصل لربك وانحر . اين شانك هوالابتر.");
        hashMap.put("bangla", "উচ্চারণ: ইন্না আ’ত্বাইনা কালকাওসার । ফাসাল্লি লিরাব্বিকা ওয়ানহার। ইন্না শানিয়াকা হুওয়াল আবৃতার।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা কাফিরুন");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم قل يايها الكفرون - عبد بنات بوت . و انتم عون ما أعبد . و أنا عابد اعبده . و أنت عبدون ما آغد . دینکم ولی دین");
        hashMap.put("bangla", "উচ্চারণ: কুলু ইয়া-আইত্মহল কাফিরূন, লা- আ'বুদু মা তা'বুদূন। ওয়ালা আনতুম আৰিদূনা মা- আ'বুদ। ওয়া লা- আনা আবিদু মা- আ’বার্তুম । ওয়া লাআনতুম আবিদূনা মা- আ'বুদ। লাকুম দ্বীনুকুম ওয়া লিয়া দ্বীন। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা ইখলাস");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم قل هو الله أك . الله المد لم يلد ولم يولد - وکمیگن که کفوا اح");
        hashMap.put("bangla", "উচ্চারণ: কুল হুওয়াল্লাহু আহাদ। আল্লাহুছ ছামাদ। লাম ইয়ালিদ ওয়া লাম ইউলাদ, ওয়া লাম ইয়াকুল্লাহ কুফুওয়ান আহাদ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা নাস");
        hashMap.put("arabic", "قُلْ أَعُوْذُ بِرَبِّ النَّاسِ (১) مَلِكِ النَّاسِ (২) إِلهِ النَّاسِ (৩) مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ (৪) اَلَّذِيْ يُوَسْوِسُ فِي صُدُوْرِ النَّاسِ (৫) مِنَ الْجِنَّةِ وَالنَّاس");
        hashMap.put("bangla", "উচ্চারণ:- ক্বুল আঊযু বিরব্বিন্ না-স। মালিকিন্ না-স। ইলা-হিন্ না-স। মিন্ শার্রিল অসওয়া-সিল খান্না-স। আল্লাযী ইউওয়াসবিসু ফী সুদূরিন্ না-স। মিনাল জিন্নাতি অন্ না-স।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা দোহা");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم والحي - ليل اذا سجى. ادع وما قلى. وكلا خير من الأولى ولسوف يعطيك ربك فترضى . اكم يجدك يتيما قاوی . ووجدك ضا هدى . ووجدك عائلا فائی ، فاما اليتيم فلانقر . واما الان فتنهار . واا بنعمة ربك فحدث ");
        hashMap.put("bangla", "উচ্চারণ: ওয়াদদোহা, ওয়াল্লাইলি ইযা সাজা । মা ওয়াদ্দাআকা রাব্বকা ওয়া মা ক্বালা । ওয়া লাআখিরাতু খাইরুল্লাকা মিনাল উলা । ওয়া লাসাওফা ইউ’ত্বীকা রাকা ফাতারদা। আলাম ইয়াজিদা ইয়াতীমান ফাআওয়া। ওয়া ওয়া জাদাকা দোআ-ল্লান ফাহাদা। ওয়া ওয়াজাদাকা আ-ইলান ফাআনা। ফাআম্মাল ইয়াতীমা ফালা তাহার । ওয়া আম্মাস সায়িলা ফালা তানহার, ওয়া আম্মা বিনি’মাতি রাব্বিকা ফাহাদ্দিস ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা ইনশিরাহ");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم الم نشرح لك صدرك . ووضعنا عنك وزرك - الذي انقض ظهرك . ورفعنا لك ذكرك . فان مع العسر يسرا ان مع العريشرا . اذا فرغت فانصب . والى ربك فاب.");
        hashMap.put("bangla", "উচ্চারণঃ আলাম নাশরাহ লাকা সােয়াদুকা, ওয়া ওয়াদা’না আনকা বিহ্রাক। আল্লাযী আনক্কাদা যাহরা । ওয় রাফানা লাকা যিক । ফাইন্না মাআল উসরি ইউসরা । ইন্না মাআল উসরি ইউসরা। ফাইযা ফারগতা ফানসাব। ওয়া ইলা রাব্বিকা কারগা। ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা তীন");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم والتين والتوني وطور سينين . وهذا البلد الأمين - لقد خلقنا الإنسان في أحسن تقويم . ث ردده فك سفلين . الا الذين امنوا وعموا الطلخت فلهم أجر غير متون . فما يكذب بعد بالین . أليس الله بكم الحكمين.");
        hashMap.put("bangla", "উচ্চারণ: ওয়াত্তীনি ওয়াইতুন, ওয়া তুরি সিনীনা ওয়া হাযা বালাদিল আমীন। লাকা খালানাল ইনসানা ফী আহসানি তাকবীম। সুম্মা রাদাদনাহু আসফালা সাফিলীন। ইল্লাল্লাযীনা আমানু ওয়া আমিলু সসােয়ালিহাতি ফালাহুম আজরুন গাইরু মামনুন। ফামা ইউকাযযিবুকা বাদুবিদ্দীন। আলাইসাল্লাহু বিআহকামিল হাকিমীন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সুরা আল কারিআহ্");
        hashMap.put("arabic", "بشم الله الرحمن الرحيم القارة القارعة . وما ادراك مالقارعة . يوم يكون الاش كالفراش المبثوث . وتنموين الجبال كالعهن المنفوش - فاما من ثقلت موازية . فهو في عيشة الراضية . واما من خفث موازية . فأمها وية . وما ادرك ماهية . نار حامية.");
        hashMap.put("bangla", "উচ্চারণ: আল-কারিআতু, মাল-কারিআহ্। ওয়ামা আরাকা মাল- কৃারিআহ্। ইয়াওমা-ইয়াকূনুন্নাসু কালফারাশি মাসূস। ওয়া-তাকূনুল জিবালু কালইহনি মানফ্শ। ফাআম্মা মান সাকুলাত্ মাওয়াযীনুহু ফাহুয়া ফী ঈশাতির রাদ্বিয়াহ্। ওয়া আম্মা মান্ খাফাত্ মাওয়াযীনুহু, ফাউন্মুহু হাবিয়াহ্। ওয়ামা আরাকা মাহিয়াহ। নারুন হামিয়াহ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সূরা আসর");
        hashMap.put("arabic", "بسم الله الرحمن الرحيم والعصر . ان الانسان في شر۔ الا الين امنوا وعملوا المملحت وتواوا پالحق . وتواصوا بالصبر");
        hashMap.put("bangla", "উচ্চারণ: ওয়াল ‘আছরি। ইন্নাল ইনছা-না লাফী খুছর। ইল্লাল্লাযীনা আ-মানূওয়া ‘আমিলুসসা-লিহা-তি ওয়া তাওয়া-সাওবিল হাক্কি ওয়া তাওয়া-সাও বিসসাবরি।");
        arrayList.add(hashMap);







    }






}