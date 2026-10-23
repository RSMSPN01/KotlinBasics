package com.example.setupapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.setupapplication.androidcore.intent.MainActivityUi
import com.example.setupapplication.androidcore.intent.MessageViewModel
import com.example.setupapplication.ui.theme.SetupApplicationTheme

class MainActivity : ComponentActivity() {
    //    private val viewModel: ScoreViewModel by viewModels()
    private val viewModel: MessageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        installSplashScreen()
//        handleIncomingIntent(intent)
        enableEdgeToEdge()
        setContent {
            SetupApplicationTheme {
                MainActivityUi(viewModel)
            }

        }
    }

//     In the main activity we handle the incoming intent here only
//    override fun onNewIntent(intent: Intent) {
//        super.onNewIntent(intent)
//        handleIncomingIntent(intent)
//    }
//
//    private fun handleIncomingIntent(incomingIntent: Intent?) {
//        if (incomingIntent != null &&
//            incomingIntent.action == Intent.ACTION_SEND &&
//            incomingIntent.type == "text/plain"
//        ) {
//            val sharedText = incomingIntent.getStringExtra(Intent.EXTRA_TEXT)
//            if (!sharedText.isNullOrEmpty()) {
//                viewModel.updateMessage(sharedText)
//            }
//        }
//    }
}
