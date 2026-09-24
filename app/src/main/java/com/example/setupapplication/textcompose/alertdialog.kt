package com.example.setupapplication.textcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AlertDialogExample() {
    var flag by remember { mutableStateOf(false) }
    // To show Toast
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Profile One", fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                )
                IconButton(
                    onClick = { flag = true }) {
                    Icon(
                        imageVector = Icons.Default.Delete,

                        contentDescription = "Delete Icon"
                    )
                }
            }

        }
    }
    if (flag) {
        AlertDialog(
            onDismissRequest = { flag = false },
            title = {
                Text(
                    text = "Delete Item",
                    fontWeight = FontWeight.SemiBold
                )
            },
            text = {
                Text(
                    text = "Are you sure you want to delete this item?",
                    fontWeight = FontWeight.SemiBold
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        //Toast message
                        Toast.makeText(
                            context, "Item has been Deleted successfully!",
                            Toast.LENGTH_SHORT
                        ).show()
                        flag = false
                    }, modifier = Modifier, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red, contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Delete"
                    )
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        flag = false
                    }, modifier = Modifier, colors = ButtonDefaults.buttonColors(
                        containerColor = Color.DarkGray,
                        contentColor = Color.LightGray
                    )
                ) {
                    Text(
                        text = "Cancel"
                    )
                }
            },
            containerColor = Color.White,
            titleContentColor = Color.Black,
            textContentColor = Color.Black // I don't have any text yet
        )
    }
}