package com.carlosmuvi.notes

import androidx.compose.Model

@Model
object AppState {
    var currentScreen: Screen = Screen.Home
}

sealed class Screen {
    object Home : Screen()
    object Detail : Screen()
}