package com.nmssalman.heaptest

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nmssalman.heaptest.ui.theme.HeapTestTheme
import io.heap.autocapture.ViewAutocaptureSDK
import io.heap.core.Heap

class MainActivity : ComponentActivity() {
    lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Heap.startRecording(applicationContext, "873304672")
        ViewAutocaptureSDK.register()
        setContentView(R.layout.activity_main)
        web = findViewById(R.id.web)
        web.settings.javaScriptEnabled = true
        web.loadUrl("https://kfc.lk")
    }
}
