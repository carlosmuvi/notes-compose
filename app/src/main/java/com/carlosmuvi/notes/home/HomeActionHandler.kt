package com.carlosmuvi.notes.home

import com.carlosmuvi.notes.AppState
import com.carlosmuvi.notes.Screen
import com.carlosmuvi.notes.data.NoteDomainModel
import com.carlosmuvi.notes.data.NotesRepository
import com.carlosmuvi.notes.detail.DetailState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class HomeActionHandler(
    private val viewModelScope: CoroutineScope,
    private val repository: NotesRepository = NotesRepository()
) {
    fun init() {
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
}
