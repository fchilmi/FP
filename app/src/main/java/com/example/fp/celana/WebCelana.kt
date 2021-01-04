package com.example.fp.celana

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.fp.R
import kotlinx.android.synthetic.main.website_celana.*

class WebCelana: AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.website_celana)
        val webView = WebsiteCelana
        actionBar?.setDisplayHomeAsUpEnabled(false)
        var intentThatStartedThisActivity = intent

        if(intentThatStartedThisActivity.hasExtra(Intent.ACTION_VIEW)) {
            var celanaWebsite = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_VIEW)
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = object  : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    if (view != null) {
                        view.loadUrl("javascript:alert('')")
                    } } }
            webView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(
                        view: WebView?,
                        url: String?,
                        message: String?,
                        result: JsResult?
                ): Boolean {
                    if (result != null) {
                        result.confirm() }
                    return true
                } }
            webView.loadUrl(celanaWebsite.toString())
        } else {
        }
    }
}