package com.example.setupapplication.textcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun rowLayout() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Apple",
            fontSize = 20.sp
        )
        Text(
            text = "Grapes",
            fontSize = 20.sp
        )
        Text(
            text = "Mango",
            fontSize = 20.sp
        )
    }

}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun columnLayouts() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Apple",
            fontSize = 20.sp
        )
        Text(
            text = "Grapes",
            fontSize = 20.sp
        )
        Text(
            text = "Mango",
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun boxLayouts(

) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Apple",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "Grapes",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.TopEnd)

        )
        Text(
            text = "Mango",
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.BottomCenter)

        )
    }

}

