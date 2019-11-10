package com.carlosmuvi.notes.detail

import androidx.compose.Model
import com.carlosmuvi.notes.home.NoteDomainModel
import java.util.*

@Model
object DetailState {
    var detail: NoteDomainModel = NoteDomainModel(1, "", "", Date())
}
