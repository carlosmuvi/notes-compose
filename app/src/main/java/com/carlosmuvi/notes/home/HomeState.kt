package com.carlosmuvi.notes.home

import androidx.compose.Model
import com.carlosmuvi.notes.data.NoteDomainModel

@Model
object HomeState {
    var initialized = false
    var loading = false
    var notes: List<NoteDomainModel> = emptyList()
}
