package com.carlosmuvi.notes.home

import androidx.compose.Composable
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutSize
import com.carlosmuvi.notes.views.NoteRow

@Composable
fun HomeScreen() {
    Column(crossAxisSize = LayoutSize.Expand) {
        HomeState.notes.forEach {
            NoteRow(name = it.title, date = it.date.toString())
        }
    }
}