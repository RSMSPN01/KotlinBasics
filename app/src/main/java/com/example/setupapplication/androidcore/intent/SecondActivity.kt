package com.example.setupapplication.androidcore.intent

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.setupapplication.ui.theme.SetupApplicationTheme


class SecondActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetupApplicationTheme {
                IntentExample()
            }
        }
    }
}

