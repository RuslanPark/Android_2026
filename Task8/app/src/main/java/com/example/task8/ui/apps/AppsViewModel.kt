package com.example.task8.ui.apps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task8.domain.AppsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppsViewModel @Inject constructor(
    // Подставляется AppsRepositoryImpl через DI
    private val repository: AppsRepository,
) : ViewModel() {

    private val _state = MutableStateFlow<AppsUiState>(AppsUiState.Loading)
    val state: StateFlow<AppsUiState> = _state.asStateFlow()

    init {
        loadApps()
    }

    fun loadApps() {
        _state.value = AppsUiState.Loading
        viewModelScope.launch {
            _state.value = try {
                AppsUiState.Content(repository.getApps())
            } catch (e: CancellationException) {
                throw e
            } catch (e: Exception) {
                AppsUiState.Error(e.message ?: "Неизвестная ошибка")
            }
        }
    }
}
