package com.example.task7.ui.apps

import androidx.lifecycle.ViewModel
import com.example.task7.domain.AppInfo
import com.example.task7.domain.AppsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AppsViewModel @Inject constructor(
    // Подставляется AppsRepositoryImpl через DI
    private val repository: AppsRepository,
) : ViewModel() {

    private val _apps = MutableStateFlow<List<AppInfo>>(emptyList())
    val apps: StateFlow<List<AppInfo>> = _apps.asStateFlow()

    init {
        _apps.value = repository.getApps()
    }
}
