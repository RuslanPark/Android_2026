package com.example.task8.ui.apps

import com.example.task8.domain.AppInfo

sealed interface AppsUiState {
    data object Loading : AppsUiState

    data class Content(val apps: List<AppInfo>) : AppsUiState

    data class Error(val message: String) : AppsUiState
}
