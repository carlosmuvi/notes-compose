package com.carlosmuvi.notes.home

import androidx.compose.Model
import java.util.*

@Model
object HomeState {
    var notes: List<NoteDomainModel> = listOf(
        NoteDomainModel(title = "Test", date = Date(), content = "content")
    )
}
