package com.example.setupapplication.corotuines

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BusRoutesViewModel: ViewModel() {
    var busNames by mutableStateOf("")
    fun getBusNames() {
        viewModelScope.launch {
            busNames = fetchBusName().toString()
        }
    }
}