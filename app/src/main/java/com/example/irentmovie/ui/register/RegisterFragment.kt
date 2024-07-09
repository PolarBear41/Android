package com.example.irentmovie.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.irentmovie.R
import com.example.irentmovie.databinding.FragmentRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    private val viewModel: RegisterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //_binding = FragmentRegisterBinding.inflate(inflater, container, false)
        _binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_register, container, false)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.viewModel.userModel.observe(viewLifecycleOwner) {
            goToProducts()
        }
    }

    private fun goToProducts() =
        findNavController().navigate(RegisterFragmentDirections.actionRegisterFragmentToMainActivity())


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
