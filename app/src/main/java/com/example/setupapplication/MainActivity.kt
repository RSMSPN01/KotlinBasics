package com.example.setupapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.setupapplication.androidcore.viewmodel.ScoreViewModel
import com.example.setupapplication.androidcore.viewmodel.ViewModelExample
import com.example.setupapplication.textcompose.Scaffold.ScaffoldExample
import com.example.setupapplication.textcompose.ToastExample
import com.example.setupapplication.textcompose.navigationbar.NavBarGraph
import com.example.setupapplication.ui.theme.SetupApplicationTheme

class MainActivity : ComponentActivity() {
    private val viewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SetupApplicationTheme {
                ViewModelExample(viewModel)
//                NavGraph()
//                ScaffoldExample()
//                NavBarGraph()
            }
//            ToastExample()
        }
    }
}
