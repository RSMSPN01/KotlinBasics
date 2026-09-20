package com.example.setupapplication.textcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.setupapplication.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.Color

@Composable
private fun imageExample() {
    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "testing image",
        modifier = Modifier
            .padding(20.dp)
            .size(100.dp)
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconExample() {

    Row() {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person Icon",
            modifier = Modifier.size(100.dp),
            tint = Color.Red
        )
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Person Icon",
            modifier = Modifier.size(100.dp),
            tint = Color.Green
        )

    }
}