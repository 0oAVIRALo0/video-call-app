package com.example.videocallapp.connect

sealed interface ConnectAction {
    data class OnNameChange(val name: String) : ConnectAction
    object OnConnectClick : ConnectAction
}