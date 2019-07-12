package com.example.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.anwarshahriar.calligrapher.Calligrapher;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Custom font
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"newfont.otf",true);
    }
}
