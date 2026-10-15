package com.example.setupapplication.androidcore.viewmodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun ViewModelExample(viewModel: ScoreViewModel) {
    // This only refers to the current composable
    var score by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Score : ${viewModel.score}",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = { viewModel.incrementScore()}
        ) {
            Text(
                text = "Increase"
            )
        }
        Button(
            onClick = { viewModel.decrementScore() }
        ) {
            Text(
                text = "Decrease"
            )
        }
    }
}