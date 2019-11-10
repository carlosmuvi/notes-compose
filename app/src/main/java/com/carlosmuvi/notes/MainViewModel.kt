package com.carlosmuvi.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carlosmuvi.notes.data.NotesRepository
import com.carlosmuvi.notes.detail.DetailState
import com.carlosmuvi.notes.home.NoteDomainModel
import com.carlosmuvi.notes.home.presentation.HomeState
import com.carlosmuvi.notes.home.presentation.toStateWithNotes
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
        State.currentScreen = Screen.Detail
    }

    fun onBackPressed() {
        when (State.currentScreen) {
            Screen.Home -> Unit
            Screen.Detail -> State.currentScreen = Screen.Home
        }
    }
}