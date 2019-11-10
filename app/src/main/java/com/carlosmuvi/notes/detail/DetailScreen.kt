package com.carlosmuvi.notes.detail

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.material.themeTextStyle
import com.carlosmuvi.notes.MainViewModel
import com.carlosmuvi.notes.views.ToolbarScreen

@Composable
fun DetailScreen(viewModel: MainViewModel) {
    ToolbarScreen(title = DetailState.detail.title) {
        Text(
            text = DetailState.detail.content,
            style = +themeTextStyle { body1 }
        )
    }
}
