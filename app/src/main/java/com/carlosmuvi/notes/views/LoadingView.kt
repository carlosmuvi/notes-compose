package com.carlosmuvi.notes.views

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.Center

@Composable
fun LoadingView() {
    Center {
        Text(text = "Loading, please wait...")
    }
}