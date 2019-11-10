package com.carlosmuvi.notes.home.presentation

import androidx.compose.Composable
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutSize
import com.carlosmuvi.notes.MainViewModel
import com.carlosmuvi.notes.views.LoadingView
import com.carlosmuvi.notes.views.NoteRow

@Composable
fun HomeScreen(viewModel: MainViewModel) {
    viewModel.onHomeRendered()
    if (HomeState.loading) {
        LoadingView()
    } else {
        LoadedView()
    }
}

@Composable
private fun LoadedView() {
    Column(crossAxisSize = LayoutSize.Expand) {
        HomeState.notes.forEach {
            NoteRow(name = it.title, date = it.date.toString())
        }
    }
}