package com.example.setupapplication.textcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// testing example by ChatGpt
@Preview(showBackground = true)
@Composable
fun modifiersExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 15.dp, vertical = 25.dp)
    ) {
        Text(
            text = "Hello, Praveen!",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp
        )
        Text(
            text = "Let's make today productive.",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Column(
            modifier = Modifier
                .background(color = Color.Cyan)
                .padding(start = 10.dp)
                .height(100.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Small Steps",
                fontSize = 25.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = "Lead to Big Results",
                fontSize = 20.sp,

                )
        }
        Text(
            text = "What's on your mind?",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 10.dp),
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = { Text(text = "Write Something here...") },
            // change the border to white
            modifier = Modifier.padding(vertical = 10.dp)
        )
        Text(
            text = "Today",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 10.dp)

        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Red)
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Study",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp

            )
            Text(
                text = "2 hours",
                fontSize = 20.sp

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Workout",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "30 minutes",
                fontSize = 20.sp

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .background(color = Color.Magenta),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Read",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp

            )
            Text(
                text = "15 minutes",
                fontSize = 20.sp

            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Yellow)
                .height(100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "A better you is a brigher tomorrow.",
                fontSize = 25.sp
            )

        }
    }
}