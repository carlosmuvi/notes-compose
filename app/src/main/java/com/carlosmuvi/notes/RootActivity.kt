package com.carlosmuvi.notes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.ui.core.setContent

class RootActivity : AppCompatActivity() {

    private val viewModel: RootViewModel by lazy {
        ViewModelProviders.of(this)
                .get(RootViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App(viewModel)
        }
    }

    override fun onBackPressed() = viewModel.rootActionHandler.onBackPressed()
}
