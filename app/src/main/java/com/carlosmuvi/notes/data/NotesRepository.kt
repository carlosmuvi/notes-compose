package com.carlosmuvi.notes.data

import com.carlosmuvi.notes.home.NoteDomainModel
import kotlinx.coroutines.delay
import java.util.*

class NotesRepository {

    suspend fun getNotes(): List<NoteDomainModel> {
        delay(3000)
        return listOf(
            NoteDomainModel("My first note", "content", Date()),
            NoteDomainModel("My second note", "content", Date()),
            NoteDomainModel("My third note", "content", Date()),
            NoteDomainModel("My fourth note", "content", Date())
        )
    }
}