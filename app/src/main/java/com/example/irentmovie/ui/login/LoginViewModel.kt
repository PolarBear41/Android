package com.example.irentmovie.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.irentmovie.SharedPreferenceManager
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.models.User
import com.example.irentmovie.data.repositories.UserRepository
import com.example.irentmovie.ui.register.RegisterFragmentDirections
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    val username = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _loginSuccess = MutableLiveData<Boolean>()
    val loginSuccess: LiveData<Boolean> get() = _loginSuccess
    val userModel = MutableLiveData<User>()

    fun login() {
        viewModelScope.launch {
            viewModelScope.launch(Dispatchers.IO) {
                val user = userRepository.getUser(username.value ?: "", password.value ?: "")
                _loginSuccess.postValue(user != null)
                if(user != null) {
                    SharedPreferenceManager.writeToken(username.value?: "")
                    viewModelScope.launch(Dispatchers.Main) {
                        this@LoginViewModel.userModel.value = user
                    }
                }
            }
        }
    }

}
