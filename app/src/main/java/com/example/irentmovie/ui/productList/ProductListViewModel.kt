package com.example.irentmovie.ui.productList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.volley.BuildConfig
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.example.irentmovie.data.api.PostAPIModel
import com.example.irentmovie.data.dao.UserDao
import com.example.irentmovie.data.models.Post
import com.example.irentmovie.data.repositories.ModelRepository
import com.example.irentmovie.data.repositories.PostRepository
import com.example.irentmovie.helpers.VolleyRequestQueue
import com.example.irentmovie.helpers.logErrorMessage
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val postRepository: PostRepository,
    private val modelRepository: ModelRepository
) : ViewModel() {
    private val _posts = MutableLiveData<List<Post>>()
    val posts: LiveData<List<Post>> = _posts

    init {
        viewModelScope.launch {
            _posts.value = postRepository.getAllPosts()
            getMovieTypes()
        }
    }

    fun getMovieTypes() {
        val url = "https://movieapi.app/api/makes"

        val stringRequest = object: StringRequest(
            Request.Method.GET,
            url,
            { response ->
                "Success".logErrorMessage()
                handleProductsResponse(response)
            },
            {
                "Error".logErrorMessage()
            }
        ) {
        }

        VolleyRequestQueue.addToRequestQueue(stringRequest)
    }

    private fun handleProductsResponse(response: String) {
        val responseJsonObject = Gson().fromJson(response, JsonObject::class.java)
        val dataArray = responseJsonObject.getAsJsonArray("data")
        val collectionType = object : TypeToken<List<PostAPIModel>>() {}.type
        val responseJsonArray = Gson().fromJson<List<PostAPIModel>>(dataArray, collectionType)

        viewModelScope.launch(Dispatchers.IO) {
            modelRepository.insertAllModels(responseJsonArray)
        }
    }
}