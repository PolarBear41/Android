package com.example.irentmovie.ui.register

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.irentmovie.R

public class RegisterFragmentDirections private constructor() {
  public companion object {
    public fun actionRegisterFragmentToMainActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_registerFragment_to_mainActivity)
  }
}
