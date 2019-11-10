package com.carlosmuvi.notes.home.presentation

import androidx.compose.Model
import com.carlosmuvi.notes.home.NoteDomainModel

@Model
object HomeState {
    var initialized = false
    var loading = false
    var notes: List<NoteDomainModel> = emptyList()
}
