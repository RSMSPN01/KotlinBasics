package com.example.setupapplication.authentication

data class AuthenticationState(
    val phoneNumber: String = "",
    val otp: String = "",
    val verificationId: String? = null,
    val isOtpSent: Boolean = false,
    val isLoading: Boolean = false,
    val error: String? = null,
    val isAuthenticated: Boolean = false
)