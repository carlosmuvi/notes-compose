package com.carlosmuvi.notes.home.presentation

import com.carlosmuvi.notes.home.NoteDomainModel

fun HomeState.toStateWithNotes(notes: List<NoteDomainModel>) {
    this.initialized = true
    this.loading = false
    this.notes = notes
}
