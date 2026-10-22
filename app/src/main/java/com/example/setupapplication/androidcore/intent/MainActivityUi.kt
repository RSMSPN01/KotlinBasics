package com.example.setupapplication.androidcore.intent

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp


@Composable
fun MainActivityUi(viewModel: MessageViewModel) {
    val context = LocalContext.current
    var value by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Main Activity",
            fontSize = 32.sp
        )
        // Example Of Explicit Intent
        Button(
            onClick = {
                val intent = Intent(context, SecondActivity::class.java)
                context.startActivity(intent)
            }
        ) {
            Text(
                text = "Second Activity"
            )
        }
        // Example Of Implicit Intent

        OutlinedTextField(
            value = value,
            onValueChange = {
                value = it
            },
            placeholder = {
                Text(
                    text = "Enter Some Data to share"
                )
            },
            maxLines = 1
        )
        Button(
            enabled = value.isNotEmpty(),
            onClick = {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, value)
                }
                val chooser = Intent.createChooser(
                    intent,
                    "Share message Using"
                )
                context.startActivity(chooser)
            }
        ) {
            Text(
                text = "Share Data"
            )
        }
            Text(
                text = "Shared Data: ${viewModel.message}"
            )

    }
}