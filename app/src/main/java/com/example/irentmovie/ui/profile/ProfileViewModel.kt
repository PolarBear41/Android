package com.example.irentmovie.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.irentmovie.data.repositories.PostRepository
import com.example.irentmovie.data.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val postRepository: PostRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    private val _username = MutableLiveData<String>()
    val username: LiveData<String>
        get() = _username

    private val _email = MutableLiveData<String>()
    val email: LiveData<String>
        get() = _email

    fun updateProfile() {
        // Implementarea actualizării profilului
    }

    fun deleteProfile() {
        viewModelScope.launch {
            _username.value?.let { userRepository.deleteUserByUsername(it) }
            // Acțiuni suplimentare cum ar fi navigarea sau afișarea unui mesaj
        }
    }

    fun setInitialValues(username: String, email: String) {
        _username.value = username
        _email.value = email
    }
}
