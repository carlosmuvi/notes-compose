package com.carlosmuvi.notes.home

import java.util.*

data class NoteDomainModel(
    val id: Long,
    val title: String,
    val content: String,
    val date: Date
)
