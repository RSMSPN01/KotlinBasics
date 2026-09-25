package com.example.setupapplication.textcompose.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable
fun LoginScreenUi(navController: NavHostController) {
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        OutlinedTextField(
            onValueChange = { userName = it },
            value = userName,
            label = {
                Text(text = "User Name")
            }
        )
        Spacer(
            Modifier.height(16.dp)
        )
        OutlinedTextField(
            onValueChange = { password = it },
            value = password,
            label = {
                Text(text = "Password")
            }
        )
        Spacer(
            Modifier.height(16.dp)
        )
        Button(
            onClick = {
                navController.navigate(MyNavRoutes.welcomeScreen(userName = userName))
            },
            enabled = userName.isNotEmpty() && password.isNotEmpty()
        ) {
            Text(
                text = "LOGIN"
            )
        }

    }
}