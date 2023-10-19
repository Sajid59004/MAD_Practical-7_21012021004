package com.example.mad_practical_7_21012021004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeID = "fJn9B64Znnrk"

    private fun initYoutubePlayer() {
        val webView = findViewById<WebView>(R.id.myweb1)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        // Replace this with the standard YouTube URL
        val youtubeUrl = "https://www.youtube.com/embed/$youtubeId"

        // Load the YouTube URL into the WebView
        webView.loadUrl(youtubeUrl)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        // Initialize the WebView to display the YouTube video
        initYoutubePlayer()

        val ytWebView: FloatingActionButton = findViewById(R.id.youtubebtn)

        ytWebView.setOnClickListener() {
            Intent(this@YoutubeActivity, MainActivity::class.java).also { startActivity(it) }
        }
    }
}
