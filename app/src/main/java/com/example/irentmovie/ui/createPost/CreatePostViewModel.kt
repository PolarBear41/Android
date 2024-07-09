package com.example.irentmovie.ui.createPost

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.irentmovie.SharedPreferenceManager
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.models.Post
import com.example.irentmovie.data.models.User
import com.example.irentmovie.data.repositories.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreatePostViewModel @Inject constructor(
    private val postRepository: PostRepository
) : ViewModel() {

    val description = MutableLiveData<String>()
    val price = MutableLiveData<String>()
    val period = MutableLiveData<String>()
    val type = MutableLiveData<String>()

    val postModel = MutableLiveData<Post>()

    fun create() {
        viewModelScope.launch {
            val post = Post(
                content = description.value ?: "",
                price = price.value ?: "",
                period = period.value ?: "",
                type = type.value ?: "",
            )
            viewModelScope.launch(Dispatchers.IO) {
                postRepository.insertPost(post)
                viewModelScope.launch(Dispatchers.Main) {
                    this@CreatePostViewModel.postModel.value = post
                }
            }
        }
    }
}