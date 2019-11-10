package com.carlosmuvi.notes.data

import kotlinx.coroutines.delay
import java.util.*

class NotesRepository {

    suspend fun getNotes(): List<NoteDomainModel> {
        delay(3000)
        return listOf(
            NoteDomainModel(
                1,
                "My first note",
                "content",
                Date()
            ),
            NoteDomainModel(
                2,
                "My second note",
                "content",
                Date()
            ),
            NoteDomainModel(
                3,
                "My third note",
                "content",
                Date()
            ),
            NoteDomainModel(
                4,
                "My fourth note",
                "content",
                Date()
            )
        )
    }
}