package com.example.setupapplication.textcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun rememberExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var num by rememberSaveable { mutableStateOf(0) }
        Text(
            text = "Current Number : ${num}", fontWeight = FontWeight.Bold, fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { num++ }, modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }
            Spacer(modifier = Modifier.width(5.dp))
            Button(
                onClick = { num-- }, modifier = Modifier.weight(1f), enabled = num > 0
            ) {
                Text(text = "Decrease")
            }
        }
    }
}
// State Hoisting

@Preview(showBackground = true)
@Composable
fun parentFunction() {
    var num by rememberSaveable { mutableStateOf(0) }
//    var increase = { num++ }
//    var decrease = { num-- }
    childFunction(num, increase = {num++}, decrease = {--num})
}

@Composable
fun childFunction(num: Int, increase: () -> Int, decrease: () -> Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        var num by rememberSaveable { mutableStateOf(0) }
        Text(
            text = "Current Number : ${num}", fontWeight = FontWeight.Bold, fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { increase }, modifier = Modifier.weight(1f)
            ) {
                Text(text = "Increase")
            }
            Spacer(modifier = Modifier.width(5.dp))
            Button(
                onClick = { decrease }, modifier = Modifier.weight(1f), enabled = num > 0
            ) {
                Text(text = "Decrease")
            }
        }
    }
}