package com.example.setupapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.setupapplication.corotuines.BusRoutesViewModel
import com.example.setupapplication.ui.theme.SetupApplicationTheme

class MainActivity : ComponentActivity() {
    //    private val viewModel: ScoreViewModel by viewModels()
//    private val viewModel: MessageViewModel by viewModels()
    private val viewModel: BusRoutesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        installSplashScreen()
//        handleIncomingIntent(intent)
        enableEdgeToEdge()
        setContent {
            SetupApplicationTheme {
//                MainActivityUi(viewModel)
//                SharedPreferences(this@MainActivity)
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { viewModel.getBusNames() }
                    ) {
                        Text(
                            text = "Show bus names"
                        )
                    }
                    Text(
                        text = viewModel.busNames
                    )
                }
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
