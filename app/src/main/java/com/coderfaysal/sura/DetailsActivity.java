package com.coderfaysal.sura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class DetailsActivity extends AppCompatActivity {

    TextView main_text, arabic_text, bangla_text;
    LinearLayout details_layout;
    ImageView back_to_activity, it_copy, it_share, it_love;
    public static String MAIN_TEXT = "";
    public static String ARABIC_TEXT = "";
    public static String BANGLA_TEXT = "";

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        main_text = findViewById(R.id.mainText);
        arabic_text = findViewById(R.id.arabicText);
        bangla_text = findViewById(R.id.banglaText);
        details_layout = findViewById(R.id.detailsLayout);
        back_to_activity = findViewById(R.id.back_to_activity);
        it_copy = findViewById(R.id.it_copy);
        it_share = findViewById(R.id.it_share);
        it_love = findViewById(R.id.it_love);



        main_text.setText(MAIN_TEXT);
        arabic_text.setText(ARABIC_TEXT);
        bangla_text.setText(BANGLA_TEXT);

        String total_text = MAIN_TEXT + "\n\n" + ARABIC_TEXT + "\n" + BANGLA_TEXT + "\n Source: Sura Apps" ;

        it_copy.setOnClickListener(view -> {

            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

            ClipData clipData = ClipData.newPlainText("TextView", total_text.trim());
            assert clipboardManager!= null;
            clipboardManager.setPrimaryClip(clipData);
            Toast.makeText(this, "Copy Successful", Toast.LENGTH_SHORT).show();

        });


        it_share.setOnClickListener(view -> {

            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "share app");
                String shareMassage = total_text.trim();
                intent.putExtra(Intent.EXTRA_TEXT, shareMassage);
                startActivity(Intent.createChooser(intent, "Share by"));
            } catch (Exception e) {
                Toast.makeText(this, "Error occurred", Toast.LENGTH_SHORT).show();
            }

        });

        it_love.setOnClickListener(view -> {

            if (count == 0){
                it_love.setImageResource(R.drawable.red_love);
                count++;
            } else if(count==1){
                it_love.setImageResource(R.drawable.love_black);
                count = 0;
            }


        });






        back_to_activity.setOnClickListener(view -> {
            startActivity(new Intent(DetailsActivity.this, MainActivity.class));
        });

    }




}