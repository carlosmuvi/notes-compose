package com.carlosmuvi.notes.home

import androidx.compose.Composable
import com.carlosmuvi.notes.MainViewModel
import com.carlosmuvi.notes.home.ui.NoteRow
import com.carlosmuvi.notes.views.LoadingView
import com.carlosmuvi.notes.views.ToolbarScreen

@Composable
fun HomeScreen(viewModel: MainViewModel) {
    // TODO figure out when to call init.
    viewModel.onHomeRendered()
    ToolbarScreen(title = "Notes") {
        if (HomeState.loading) {
            LoadingView()
        } else {
            HomeState.notes.forEach { note ->
                NoteRow(
                    name = note.title,
                    date = note.date.toString(),
                    onClick = { viewModel.onNoteClick(note) })
            }
        }
    }
}