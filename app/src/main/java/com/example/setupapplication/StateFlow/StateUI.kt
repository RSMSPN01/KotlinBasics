package com.example.setupapplication.StateFlow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.setupapplication.corotuines.BusRoutesViewModel


@Composable
fun DisplayStateUi(viewModel: BusRoutesViewModel) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                viewModel.getBusNames()
            }
        ) {
            Text(text = "Show bus names")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Display the loading indicator
        if (uiState.isLoading) {
            CircularProgressIndicator()
        }

        // Display an error if fetching fails
        uiState.error?.let { errorMessage ->
            Text(text = errorMessage)
        }

        // Display the fetched bus names
        uiState.buses.forEach { busName ->
            Text(text = busName)
        }
    }
}