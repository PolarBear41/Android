package com.example.irentmovie.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import com.example.irentmovie.SharedPreferenceManager
import com.example.irentmovie.data.models.User
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    val isUsernameError: LiveData<Boolean> = username.switchMap { username ->
        val isUsernameValid = username.length <= 3
        MutableLiveData(isUsernameValid)
    }
    val userModel = MutableLiveData<User>()

    fun register() {
        viewModelScope.launch {
            val user = User(username = username.value ?: "", password = password.value ?: "")
            viewModelScope.launch(Dispatchers.IO) {
                userRepository.insertUser(user)
                SharedPreferenceManager.writeToken(username.value?: "")
                viewModelScope.launch(Dispatchers.Main) {
                    this@RegisterViewModel.userModel.value = user
                }
            }
        }
    }
}