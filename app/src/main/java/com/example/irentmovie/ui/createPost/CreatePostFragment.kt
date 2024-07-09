package com.example.irentmovie.ui.createPost
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.irentmovie.R
import com.example.irentmovie.databinding.FragmentCreatePostBinding
import com.example.irentmovie.ui.login.LoginViewModel
import com.example.irentmovie.ui.register.RegisterFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreatePostFragment: Fragment() {
    private var _binding: FragmentCreatePostBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CreatePostViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreatePostBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.viewModel.postModel.observe(viewLifecycleOwner) {
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}