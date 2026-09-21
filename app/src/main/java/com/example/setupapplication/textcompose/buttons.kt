package com.example.setupapplication.textcompose

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ButtonExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Normal Button
        Button(
            onClick = {},
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            shape = RectangleShape,
            enabled = true,  // you can add your own condition
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black, contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 20.dp, focusedElevation = 15.dp
            ),
            border = BorderStroke(2.dp, Color.Red)
        ) {
            Text(
                text = "Normal Button", fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.size(20.dp))

        //outline Button // This is not used that much
        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.LightGray, contentColor = Color.Red
            )
        ) {
            Text(
                text = "Outline Button", fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.size(20.dp))

        // text Button
        TextButton(
            onClick = {},
        ) {
            Text(text = "Text Button!")
        }
        TextButton(
            onClick = {},
        ) {
            Text(text = "Text Button!")
        }

        // another way to create the same text button
        Text(
            text = "Normal Text as Button!",
            modifier = Modifier.clickable{ }
        )
        Text(
            text = "Normal Text as Button!",
            modifier = Modifier.clickable{ }
        )

        Spacer(modifier = Modifier.size(20.dp))

        // Icon Button
        IconButton(
            onClick = {}
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Go to Profile"
            )
        }
        IconButton(
            onClick = {},
            modifier = Modifier.clip(shape = RectangleShape),
            colors = IconButtonDefaults.iconButtonColors(contentColor = Color.Blue, containerColor = Color.Black),
            shape = IconButtonDefaults.filledShape
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Go to Profile"
            )
        }

        // normal way of creating Icon button
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Go to Profile",
            tint = Color.Red,
            modifier = Modifier.clickable{}
        )
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Go to Profile",
            tint = Color.Red,
            modifier = Modifier.clickable{}
        )
    }
}