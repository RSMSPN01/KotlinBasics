package com.example.setupapplication.StateFlow

data class BusUiState(
    val isLoading : Boolean = false,
    val buses : List<String> = emptyList(),
    val error : String? = null
)