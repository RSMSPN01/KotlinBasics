package com.example.setupapplication.authentication

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

//so we need an activity not a context and this function helps to find the current activity.
fun Context.findActivity(): Activity? {
    var context = this

    while (context is ContextWrapper) {
        if (context is Activity) return context
        context = context.baseContext
    }

    return context as? Activity
}

@Composable
fun AuthScreen(viewModel: AuthViewModel) {
    val authState by viewModel.authState.collectAsStateWithLifecycle()
    val context = LocalContext.current
    val activity = context.findActivity()

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
            onClick = {
                activity?.let { viewModel.sendOtp(it) }
            },
            enabled = authState.phoneNumber.isNotBlank() && !authState.isLoading,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Get OTP")
        }
        Spacer(modifier = Modifier.weight(0.10f))

        if (authState.isOtpSent) {
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
                onClick = {
                    viewModel.verifyOtp()
                }, enabled = authState.otp.isNotBlank() && !authState.isLoading
            ) {
                Text("Verify OTP")
            }
        }
        if (authState.isLoading) {
            CircularProgressIndicator()
        }

        authState.error?.let { error ->
            Text(
                text = error,
                color = MaterialTheme.colorScheme.error
            )
        }

        if (authState.isAuthenticated) {
            Text("Phone number verified successfully!")
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}
