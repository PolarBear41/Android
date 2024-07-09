package com.example.irentmovie.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.irentmovie.MainActivity
import com.example.irentmovie.R
import com.example.irentmovie.databinding.FragmentLoginBinding
import com.example.irentmovie.ui.register.RegisterFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment(), LoginFragmentListener {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //_binding = FragmentLoginBinding.inflate(inflater, container, false)
        _binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_login, container, false)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.listener = this

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.loginSuccess.observe(viewLifecycleOwner) { success ->
            if (success) {
                goToProducts()
            }
        }
    }

    override fun goToForgotPassword() {
        TODO("Not yet implemented")
    }

    private fun goToProducts() =
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToMainActivity())

    override fun goToRegister() =
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToRegisterFragment())

    override fun goToLogout() {
        (activity as? MainActivity)?.logout()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


interface LoginFragmentListener {
    fun goToForgotPassword()
    fun goToRegister()
    fun goToLogout()
}