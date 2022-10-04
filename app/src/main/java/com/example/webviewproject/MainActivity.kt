package com.example.webviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        webView.webViewClient = WebViewClient()

        webView.loadUrl(" https://adp.fm/episodes/rundown-18-best-of-afrobeats-2019/")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }
}