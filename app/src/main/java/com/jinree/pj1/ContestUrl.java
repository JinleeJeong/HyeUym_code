package com.jinree.pj1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ContestUrl extends AppCompatActivity {



    private ImageButton thinkgood;
    private ImageButton outcampus;
    private ImageButton specup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_url);

        thinkgood = (ImageButton) findViewById(R.id.thinkgood);

        thinkgood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thinkcontest.com/"));
                startActivity(intent);
            }
        });
        outcampus = (ImageButton) findViewById(R.id.outcampus);

        outcampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/outcampus/"));
                startActivity(intent);
            }
        });
        specup = (ImageButton) findViewById(R.id.specup);

        specup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cafe.naver.com/specup"));
                startActivity(intent);
            }
        });
    }
}
