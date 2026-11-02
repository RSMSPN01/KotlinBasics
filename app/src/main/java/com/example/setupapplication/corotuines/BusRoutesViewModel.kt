package com.example.setupapplication.corotuines

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.setupapplication.StateFlow.BusUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

class BusRoutesViewModel : ViewModel() {
    var busNames by mutableStateOf("")
    // now instead of just fetching the bus names directly we handle this through the state
//    val loadingState = BusUiState(
//        isLoading = true
//    )
//    val successState = BusUiState(
//        isLoading = false,
//        buses = viewModelScope.launch {
//            fetchBusName().toString()
//        },
//        error = null
//    )
//    val errorState = BusUiState(
//        error = "Error while Loading Data"
//    )

    //instead of handling them like above we handled them in this manner
    private val _uiState = MutableStateFlow(BusUiState())
    val uiState: StateFlow<BusUiState> = _uiState.asStateFlow()
    fun getBusNames() {
            viewModelScope.launch {
                // 4. Show the loading state
                _uiState.value = BusUiState(
                    isLoading = true
                )
                try {
                    // Fetch the bus names
                    val busNames = fetchBusName()
                    //  Update the state with the successful result
                    _uiState.value = BusUiState(
                        isLoading = false,
                        buses = busNames,
                        error = null
                    )
                    // This catch block if user shift to other page during mid-loading
                } catch (e: CancellationException) {

                    // Allow coroutine cancellation to propagate
                    throw e

                } catch (e: Exception) {

                    // Update the state if fetching fails
                    _uiState.value = BusUiState(
                        isLoading = false,
                        error = e.message ?: "Unable to load buses"
                    )
                }
            }
        }
    }