package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";

    //widgets
    private Button mAbout;
    private Button mProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Custom font
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"newfont.ttf",true);

        Log.d(TAG, "onCreate : started");
        mAbout = findViewById(R.id.aboutButton);
        mProfile = findViewById(R.id.profileButton);

        mAbout.setOnClickListener(this);
        mProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.aboutButton) {
            Log.d(TAG,"onClick: opening alc about page");
            Intent intent = new Intent(MainActivity.this, About.class);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            startActivity(intent);
        }
        else if(view.getId() == R.id.profileButton) {
            Log.d(TAG,"onClick: opening profile page");
            Intent intent = new Intent(MainActivity.this, Profile.class);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            startActivity(intent);
        }
    }
}
