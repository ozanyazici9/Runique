package com.ozanyazici.auth.presentation.register

import com.ozanyazici.core.presentation.ui.UiText

sealed interface RegisterEvent {

    data object RegistrationSuccess: RegisterEvent

    data class Error(val error: UiText): RegisterEvent

}