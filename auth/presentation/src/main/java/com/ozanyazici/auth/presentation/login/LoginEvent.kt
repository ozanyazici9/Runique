package com.ozanyazici.auth.presentation.login

import com.ozanyazici.core.presentation.ui.UiText

sealed interface LoginEvent {
    data class Error(val error: UiText): LoginEvent
    data object LoginSuccess: LoginEvent
}