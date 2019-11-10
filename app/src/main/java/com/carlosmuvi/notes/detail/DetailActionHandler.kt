package com.carlosmuvi.notes.detail

import com.carlosmuvi.notes.RootActionHandler

class DetailActionHandler(
    private val actionHandler: RootActionHandler
) {
    fun onBackPressed() = actionHandler.onBackPressed()
}
