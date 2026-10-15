package com.example.setupapplication.androidcore.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel(){
    var score by mutableStateOf(0)
        private set // This tell that it is read only
    fun incrementScore() {
        score++
    }
    fun decrementScore(){
        score--
    }
}