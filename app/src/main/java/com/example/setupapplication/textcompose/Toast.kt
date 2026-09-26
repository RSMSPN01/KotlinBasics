package com.example.setupapplication.textcompose

import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.ui.platform.LocalContext

@Preview (showBackground = true, showSystemUi = true
)
@Composable
 fun ToastExample() {
     val context = LocalContext.current
    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
                Toast.makeText(context,
                        "This is a Toast",
                    LENGTH_SHORT
                ).show()
        }) {
            Text(
                text = "Show Toast"
            )
        }
    }
}