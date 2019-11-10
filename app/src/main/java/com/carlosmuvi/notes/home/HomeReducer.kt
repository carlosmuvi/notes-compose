package com.carlosmuvi.notes.home

import com.carlosmuvi.notes.data.NoteDomainModel

fun HomeState.toStateWithNotes(notes: List<NoteDomainModel>) {
    initialized = true
    loading = false
    HomeState.notes = notes
}
