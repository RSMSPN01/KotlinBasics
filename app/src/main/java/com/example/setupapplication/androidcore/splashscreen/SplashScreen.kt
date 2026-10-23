package com.example.setupapplication.androidcore.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.example.setupapplication.MainActivity
import com.example.setupapplication.R
import com.example.setupapplication.androidcore.splashscreen.ui.theme.SetupApplicationTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // using coroutines here
        lifecycleScope.launch {
            delay(3000)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
        enableEdgeToEdge()
        setContent {
            SetupApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Image(
                            painter = painterResource(R.drawable.splash_icon),
                            contentDescription = "Splash Icon",
                            modifier = Modifier.size(height = 240.dp, width = 280.dp)
                        )
                        Spacer(modifier = Modifier.weight(2f))
                        Image(
                            painter = painterResource(R.drawable.splash_text),
                            contentDescription = "Splash Icon",
                            modifier = Modifier.size(height = 150.dp, width = 380.dp)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

