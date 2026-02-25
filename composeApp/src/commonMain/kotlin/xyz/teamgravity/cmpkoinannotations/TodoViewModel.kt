package xyz.teamgravity.cmpkoinannotations

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TodoViewModel(
    private val repository: MainRepository
) : ViewModel() {

    private val _todos = MutableStateFlow<List<String>>(emptyList())
    val todos: StateFlow<List<String>> = _todos.asStateFlow()

    init {
        getTodos()
    }

    private fun getTodos() {
        viewModelScope.launch {
            _todos.emit(repository.getTodos())
        }
    }
}