package com.example.setupapplication.authentication

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AuthViewModel : ViewModel() {
    private val _authState = MutableStateFlow(AuthenticationState())
    val authState: StateFlow<AuthenticationState> = _authState.asStateFlow()

    // This is how it is connected with the manager now.
    private val phoneAuthManager = PhoneAuthManager(
        FirebaseAuth.getInstance()
    )
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
    fun sendOtp(activity: Activity) {
        val phoneNumber = _authState.value.phoneNumber.trim()

        if (phoneNumber.isBlank()) {
            _authState.value = _authState.value.copy(
                error = "Please enter your phone number"
            )
            return
        }

        _authState.value = _authState.value.copy(
            isLoading = true,
            error = null
        )

        phoneAuthManager.sendVerificationCode(
            activity = activity,
            phoneNumber = phoneNumber,
            callbacks = createPhoneAuthCallbacks()
        )
    }

    fun verifyOtp() {
        val currentState = _authState.value

        val verificationId = currentState.verificationId
        val otp = currentState.otp.trim()

        if (verificationId.isNullOrBlank()) {
            _authState.value = currentState.copy(
                error = "Please request an OTP first"
            )
            return
        }

        if (otp.isBlank()) {
            _authState.value = currentState.copy(
                error = "Please enter the OTP"
            )
            return
        }

        val credential = PhoneAuthProvider.getCredential(
            verificationId,
            otp
        )

        signInWithCredential(credential)
    }


    fun createPhoneAuthCallbacks(): PhoneAuthProvider.OnVerificationStateChangedCallbacks {

        return object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            override fun onVerificationCompleted(
                credential: PhoneAuthCredential
            ) {
                signInWithCredential(credential)
            }

            override fun onVerificationFailed(
                e: FirebaseException
            ) {
                _authState.value = _authState.value.copy(
                    isLoading = false,
                    error = e.message ?: "Phone verification failed"
                )
            }

            override fun onCodeSent(
                verificationId: String,
                token: PhoneAuthProvider.ForceResendingToken
            ) {
                _authState.value = _authState.value.copy(
                    isLoading = false,
                    isOtpSent = true,
                    verificationId = verificationId,
                    error = null
                )
            }

            override fun onCodeAutoRetrievalTimeOut(
                verificationId: String
            ) {
                // Automatic SMS retrieval timed out.
                // The user can still enter the OTP manually.
            }
        }
    }

    private fun signInWithCredential(credential: PhoneAuthCredential) {
        _authState.value = _authState.value.copy(
            isLoading = true,
            error = null
        )

        phoneAuthManager.signInWithCredential(credential) { success, error ->

            _authState.value = _authState.value.copy(
                isLoading = false,
                isAuthenticated = success,
                error = error
            )
        }
    }



}