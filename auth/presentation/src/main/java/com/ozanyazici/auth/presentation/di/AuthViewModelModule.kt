package com.ozanyazici.auth.presentation.di

import com.ozanyazici.auth.presentation.login.LoginViewModel
import com.ozanyazici.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}