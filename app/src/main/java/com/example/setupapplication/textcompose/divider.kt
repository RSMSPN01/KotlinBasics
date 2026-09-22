package com.example.setupapplication.textcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DividerExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // horizontal Divider
        Text(
            text = "Profile 1"
        )
        HorizontalDivider(
            modifier = Modifier
                .width(100.dp)
                .padding(13.dp), color = Color.Red, thickness = 5.dp
        )
        Text(
            text = "Profile 2"
        )

        // vertical Divider
        Spacer(modifier = Modifier.padding(50.dp))

        Row(
            modifier = Modifier
        ) {
            Text(
                text = "Profile 1"
            )
            VerticalDivider(
                modifier = Modifier.height(20.dp).padding(horizontal = 5.dp),
                color = Color.Red, thickness = 5.dp
            )
            Text(
                text = "Profile 2"
            )
        }
    }
}

