package com.jnyakush.compose.data

import com.jnyakush.compose.data.note.NoteRepository
import com.jnyakush.compose.data.note.impl.FakeNoteRepository


interface AppContainer {
    val notesRepository: NoteRepository
}


class AppContainerImpl() : AppContainer {
    override val notesRepository: NoteRepository by lazy {
        FakeNoteRepository(

        )
    }

}