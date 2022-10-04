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
        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }

    override fun onBackPressed() {
            if (webView.canGoBack())
                webView.goBack()
                // if your webview cannot go back
                // it will exit the application
                else
            super.onBackPressed()

    }

}

