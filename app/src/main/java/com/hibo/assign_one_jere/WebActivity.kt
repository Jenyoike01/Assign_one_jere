package com.hibo.assign_one_jere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {
    var webViewSite: WebView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        webViewSite = findViewById(R.id.mWebSite)
        var websettings = webViewSite!!.settings
        websettings.javaScriptEnabled = true
        webViewSite!!.loadUrl("https://www.emobilis.ac.ke/")

    }
}