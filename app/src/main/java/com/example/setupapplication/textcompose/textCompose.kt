package com.example.setupapplication.textcompose
//import android.graphics.Color
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.OutlinedTextFieldDefaults.colors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.round
import androidx.compose.ui.graphics.Color

@Composable
//@Preview(showBackground = true)
fun textExample() {
    Text(
        text = "Hello World"
    )
}

//@Preview(showBackground = true)
@Composable
private fun textField() {
    var name by remember() { mutableStateOf("") }
    TextField(
        value = name,
        onValueChange = {name = it},
        label = { Text(text = "Enter Your Name") },
        shape = CircleShape
    )
}

@Preview (showBackground = true)
@Composable
fun outlineTextField() {
    var name by remember() { mutableStateOf("") }
    OutlinedTextField(
        value = name,
        onValueChange = {name = it},
        label = { Text(text = "Enter Your Name") },
//        placeholder = {Text(text = "Enter your Name")},
        singleLine = true,
        maxLines = 1,
        shape = RoundedCornerShape(16.dp),
        colors = colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red,
            cursorColor = Color.Magenta,
            unfocusedPlaceholderColor = Color.Gray,
            focusedPlaceholderColor = Color.Cyan,
            unfocusedLeadingIconColor = Color.Red,
            focusedLeadingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedLabelColor = Color.Red,
            focusedLabelColor = Color.Green
    )
    )
}
