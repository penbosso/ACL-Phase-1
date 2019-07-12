package com.example.alc4phase1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import me.anwarshahriar.calligrapher.Calligrapher;

public class About extends AppCompatActivity {

    private WebView webAboutAlc;
    private String url="https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webAboutAlc=(findViewById(R.id.alclWeb));

        //Custom font
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"newfont.ttf",true);

        WebSettings webSettings = webAboutAlc.getSettings();
        webAboutAlc.getSettings().setLoadWithOverviewMode(true);
        webAboutAlc.getSettings().setUseWideViewPort(true);
        webAboutAlc.getSettings().setBuiltInZoomControls(true);


        webAboutAlc.setWebViewClient(new myWebClient());

        webAboutAlc.loadUrl(url);
    }




    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            // ignore ssl error
            if (handler != null){
                handler.proceed();
            } else {
                super.onReceivedSslError(view, null, error);
            }
        }

    }
}