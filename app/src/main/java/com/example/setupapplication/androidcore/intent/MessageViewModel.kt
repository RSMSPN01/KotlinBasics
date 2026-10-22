package com.example.setupapplication.androidcore.intent

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MessageViewModel : ViewModel() {
    var message by mutableStateOf<String?>(null)
        private set

    fun updateMessage(newMessage: String?) {
        message = newMessage
    }
}