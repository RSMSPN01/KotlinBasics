package com.example.setupapplication.textcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardsExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Card One
        Card(
            modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Profile Icon
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .background(shape = CircleShape, color = Color.LightGray)
                        .padding(16.dp),
                    contentAlignment = Alignment.Center


                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(40.dp),
                        tint = Color.DarkGray
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                // profile Details
                Column() {
                    Text(
                        text = "Praveen Kumar", fontWeight = FontWeight.Bold, fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Native Android Developer using Kotlin & KMP",
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                }

            }
        }

        // Card two
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Profile Icon
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .background(shape = CircleShape, color = Color.LightGray)
                        .padding(16.dp),
                    contentAlignment = Alignment.Center


                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(40.dp),
                        tint = Color.DarkGray
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                // profile Details
                Column() {
                    Text(
                        text = "Praveen Kumar", fontWeight = FontWeight.Bold, fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Native Android Developer using Kotlin & KMP",
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                }

            }
        }

        // card Three
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                containerColor = Color.White
            ), shape = RoundedCornerShape(16.dp), elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Profile Icon
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .background(shape = CircleShape, color = Color.LightGray)
                        .padding(16.dp),
                    contentAlignment = Alignment.Center


                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(40.dp),
                        tint = Color.DarkGray
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                // profile Details
                Column() {
                    Text(
                        text = "Praveen Kumar", fontWeight = FontWeight.Bold, fontSize = 18.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Native Android Developer using Kotlin & KMP",
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                }

            }
        }
    }
}