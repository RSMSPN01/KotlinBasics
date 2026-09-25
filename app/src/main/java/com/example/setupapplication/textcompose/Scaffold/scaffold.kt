package com.example.setupapplication.textcompose.Scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = { TopBarUi() },
        bottomBar = { BottomBarUi() },
        floatingActionButton = { FloatingButtonUi() }
    ) { innerpadding ->
        // Show main Content here
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(innerpadding)
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(10) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(
                            color = Color.DarkGray,
                            RoundedCornerShape(8.dp)
                        )
                ) {
                    Text(
                        text = "Items : "
                    )
                }

            }
        }
    }
}