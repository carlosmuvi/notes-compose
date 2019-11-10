package com.carlosmuvi.notes

class RootActionHandler {

    fun onBackPressed() = when (AppState.currentScreen) {
        Screen.Home -> Unit
        Screen.Detail -> AppState.currentScreen = Screen.Home
    }
}
