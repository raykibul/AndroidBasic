package com.raykibul.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity4 extends AppCompatActivity {

    WebView myWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        myWebView=findViewById(R.id.myWebView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://google.com");


    }

    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
          myWebView.goBack();

        }else{
            super.onBackPressed();
        }


    }
}