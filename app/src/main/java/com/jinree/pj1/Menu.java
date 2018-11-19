package com.jinree.pj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Menu extends AppCompatActivity {


    private ImageButton anonymous;
    private ImageButton contest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        anonymous = (ImageButton) findViewById(R.id.anonymous);


        anonymous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, ChatActivity.class);
                startActivity(intent);
            }
        });

        contest = (ImageButton) findViewById(R.id.menu_contest);
        contest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ContestUrl.class);
                startActivity(intent);
            }
        });

    }
}
