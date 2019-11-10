package com.carlosmuvi.notes.home.ui

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.tooling.preview.Preview

@Composable
fun NoteRow(
    name: String,
    date: String,
    onClick: () -> Unit
) = Clickable(onClick) {
    Card {
        Padding(padding = 16.dp) {
            Column(
                crossAxisSize = LayoutSize.Expand
            ) {
                Text(
                    text = name,
                    style = +themeTextStyle { h6 }
                )
                HeightSpacer(height = 4.dp)
                Text(
                    text = date,
                    style = +themeTextStyle { body1 }
                )
            }
        }
    }
}

@Composable
@Preview
fun Preview() {
    MaterialTheme {
        NoteRow(
            name = "Hello Test!",
            date = "10/10/1991",
            onClick = {}
        )
    }
}