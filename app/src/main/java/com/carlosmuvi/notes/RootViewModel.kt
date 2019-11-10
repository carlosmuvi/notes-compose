package com.carlosmuvi.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carlosmuvi.notes.detail.DetailActionHandler
import com.carlosmuvi.notes.home.HomeActionHandler

class RootViewModel : ViewModel() {

    val rootActionHandler = RootActionHandler()
    val homeActionHandler = HomeActionHandler(viewModelScope)
    val detailActionHandler = DetailActionHandler(rootActionHandler)

}
