package com.example.setupapplication.androidcore.sharedpref

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.content.edit


@Composable
fun SharedPreferences(context: Context) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var savedData by remember { mutableStateOf("") }
        TextField(
            value = username,
            onValueChange = {
                username = it
            },
            placeholder = {
                Text(
                    text = "Enter UserName"
                )
            }
        )
        Spacer(Modifier.height(16.dp))
        TextField(
            value = password,
            onValueChange = {
                password = it
            },
            placeholder = {
                Text(
                    text = "Enter PassWord"
                )
            }
        )
        Button(
            // Data is stored in here.
            onClick = {
                val sharedPref = context.getSharedPreferences("Mypref", Context.MODE_PRIVATE)
                sharedPref.edit {
                    putString("username", username)
                    putString("password", password)
                }
            }
        ) {
            Text(
                text = "Save Data"
            )
        }
        Button(
            onClick = {
                val sharedPref = context.getSharedPreferences("Mypref", Context.MODE_PRIVATE)
                var savedUserName = sharedPref.getString("username", "No Username Found")
                var savedPassword = sharedPref.getString("password", "No Password Found")
                savedData = "username : $savedUserName\npassword: $savedPassword"
            }
        ) {
            Text(
                text = "Show Data"
            )
        }
        Button(
            onClick = {
                val sharedPref = context.getSharedPreferences("Mypref", Context.MODE_PRIVATE)
                sharedPref.edit {
                    clear()
                }
                savedData = ""
            }
        ) {
            Text(
                text = "Clear Saved Data"
            )
        }
        if (savedData.isNotEmpty()) {
            Text(
                text = savedData
            )
        }

    }
}