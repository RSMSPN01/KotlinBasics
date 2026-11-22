package com.example.setupapplication.authentication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun AuthScreen(viewModel: AuthViewModel) {
    val authState by viewModel.authState.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.weight(1f))

        OutlinedTextField(
            value = authState.phoneNumber,
            onValueChange = { newValue -> viewModel.updatePhoneNumber(newValue) },
            label = { Text("Phone Number") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.weight(0.10f))

        Button(
            onClick = {},
            enabled = authState.phoneNumber.isNotBlank(),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Get OTP")
        }
        Spacer(modifier = Modifier.weight(0.10f))

        if(authState.isOtpSent){
            OutlinedTextField(
                value = authState.otp,
                onValueChange = { newValue -> viewModel.updateOTP(newValue) },
                label = { Text("OTP") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.weight(0.10f))
            Button(
                onClick = { },
                enabled = authState.otp.isNotBlank(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Verify OTP")
            }
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}
