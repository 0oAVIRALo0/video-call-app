package com.example.videocallapp.connect

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.videocallapp.VideoCallApp

class ConnectViewModel(
    private val app: Application
): AndroidViewModel(app) {

    var state by mutableStateOf(ConnectState())
        private set

    fun onAction(action: ConnectAction) {
        when (action) {
            is ConnectAction.OnNameChange -> {
                state = state.copy(name = action.name)
            }

            ConnectAction.OnConnectClick -> {
                connectToRoom()
            }
        }
    }

    private fun connectToRoom() {
        state = state.copy(errorMessage = null)
        if (state.name.isEmpty()) {
            state = state.copy(errorMessage = "Name cannot be empty")
            return
        }

        (app as VideoCallApp).initVideoClient(state.name)

        state = state.copy(isConnected = true)
    }
}