package com.example.android.part4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Bundle bundle=getIntent().getExtras();
        String user=bundle.getString("Country");

        String url="https://www.cricketworldcup.com/teams/india";

    }
}
