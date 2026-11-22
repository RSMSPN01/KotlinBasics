package com.example.setupapplication.authentication

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AuthViewModel : ViewModel() {
    private val _authState = MutableStateFlow(AuthenticationState())
    val authState: StateFlow<AuthenticationState> = _authState.asStateFlow()
    fun updatePhoneNumber(newPhoneNumber: String) {
        // we will use copy instead of creating the whole new object that will help to retain the data.
        _authState.value = _authState.value.copy(
            phoneNumber = newPhoneNumber
        )
    }

    fun updateOTP(newOTP: String) {

        _authState.value = _authState.value.copy(
            otp = newOTP
        )
    }

}