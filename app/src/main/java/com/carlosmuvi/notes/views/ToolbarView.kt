package com.carlosmuvi.notes.views

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.FlexScope
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview

@Composable
fun ToolbarScreen(title: String, block: @Composable() FlexScope.() -> Unit) {
    Column(crossAxisSize = LayoutSize.Expand) {
        TopAppBar(title = { Text(text = title) })
        Padding(padding = 16.dp) {
            Column(block = block)
        }
    }
}

@Preview
@Composable
fun ToolbarScreen() {
    MaterialTheme {
        ToolbarScreen(title = "My title") {
            Text(text = "Sample Text in content")
            Text(text = "Sample Text in content")
            Text(text = "Sample Text in content")
            Text(text = "Sample Text in content")
        }
    }
}