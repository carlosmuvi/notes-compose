package com.carlosmuvi.notes

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import com.carlosmuvi.notes.home.HomeScreen

@Composable
fun NotesApp() {
    MaterialTheme {
        when(NotesState.currentScreen) {
            Screen.Home -> HomeScreen()
        }
    }
}