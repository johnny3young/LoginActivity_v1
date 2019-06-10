package com.ejemplo.app.loginactivity_v1.ui.login

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.ejemplo.app.loginactivity_v1.data.LoginDataSource
import com.ejemplo.app.loginactivity_v1.data.LoginRepository

/**
 * ViewModel provider factory to instantiate LoginViewModel.
 * Required given LoginViewModel has a non-empty constructor
 */
class LoginViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(
                loginRepository = LoginRepository(
                    dataSource = LoginDataSource()
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
