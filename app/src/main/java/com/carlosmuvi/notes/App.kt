package com.carlosmuvi.notes

import androidx.compose.Composable
import androidx.ui.material.MaterialTheme
import com.carlosmuvi.notes.detail.DetailScreen
import com.carlosmuvi.notes.home.HomeScreen

@Composable
fun App(viewModel: MainViewModel) {
    MaterialTheme {
        when(AppState.currentScreen) {
            Screen.Home -> HomeScreen(viewModel)
            Screen.Detail -> DetailScreen(viewModel)
        }
    }
}