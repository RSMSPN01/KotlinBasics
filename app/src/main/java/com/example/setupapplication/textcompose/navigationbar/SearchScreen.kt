package com.example.setupapplication.textcompose.navigationbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchScreenUI(navController: NavHostController) {
    Scaffold(
        bottomBar = {NavBarUI(navController, "Search") }
    ) { innerpadding ->
        var name by rememberSaveable { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Search Screen",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }
    }
}