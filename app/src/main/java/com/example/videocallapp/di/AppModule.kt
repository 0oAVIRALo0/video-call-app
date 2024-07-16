package com.example.videocallapp.di

import com.example.videocallapp.VideoCallApp
import com.example.videocallapp.connect.ConnectViewModel
import com.example.videocallapp.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    factory {
        val app = androidContext().applicationContext as VideoCallApp
        app.client
    }

    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}