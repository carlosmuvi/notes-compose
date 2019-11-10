package com.carlosmuvi.notes.detail

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.material.themeTextStyle
import com.carlosmuvi.notes.views.ToolbarScreen

@Composable
fun DetailScreen(
    actionHandler: DetailActionHandler
) {
    ToolbarScreen(
        title = DetailState.detail.title,
        onBackClick = { actionHandler.onBackPressed() }
    ) {
        Text(
            text = DetailState.detail.content,
            style = +themeTextStyle { body1 }
        )
    }
}
