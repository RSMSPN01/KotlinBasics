package com.example.setupapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.setupapplication.textcompose.Scaffold.ScaffoldExample
import com.example.setupapplication.textcompose.navigationbar.NavBarGraph
import com.example.setupapplication.ui.theme.SetupApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SetupApplicationTheme {
//                NavGraph()
//                ScaffoldExample()
                NavBarGraph()
            }
        }
    }
}
