package com.carlosmuvi.notes

import androidx.compose.Model

@Model
object NotesState {
    var currentScreen: Screen = Screen.Home
}

sealed class Screen {
    object Home : Screen()
}