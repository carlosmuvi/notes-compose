package com.carlosmuvi.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carlosmuvi.notes.data.NotesRepository
import com.carlosmuvi.notes.detail.DetailState
import com.carlosmuvi.notes.data.NoteDomainModel
import com.carlosmuvi.notes.home.HomeState
import com.carlosmuvi.notes.home.toStateWithNotes
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: NotesRepository = NotesRepository()
) : ViewModel() {

    fun onHomeRendered() {
        viewModelScope.launch {
            if (HomeState.initialized.not()) {
                HomeState.loading = true
                HomeState.toStateWithNotes(repository.getNotes())
            }
        }
    }

    fun onNoteClick(note: NoteDomainModel) {
        DetailState.detail = note
        AppState.currentScreen = Screen.Detail
    }

    fun onBackPressed() {
        when (AppState.currentScreen) {
            Screen.Home -> Unit
            Screen.Detail -> AppState.currentScreen = Screen.Home
        }
    }
}