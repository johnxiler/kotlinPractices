package org.example.differentclasses

// Sealed class representing different UI states
sealed class UiState {
    object Loading : UiState()  // Represents a loading state
    data class Success(val data: String) : UiState()  // Represents a success state with associated data
    data class Error(val message: String) : UiState()  // Represents an error state with an error message
}

fun handleUiState(state: UiState) {
    when (state) {
        is UiState.Loading -> println("UI is loading...")
        is UiState.Success -> println("UI success! Data: ${state.data}")
        is UiState.Error -> println("UI error: ${state.message}")
    }
}

fun main() {
    // Simulating different UI states
    println("Simulating UI states...\n")

    handleUiState(UiState.Loading)  // Simulating loading state
    handleUiState(UiState.Success("Data loaded successfully!"))  // Simulating success state with data
    handleUiState(UiState.Error("Failed to load data."))  // Simulating error state
}
