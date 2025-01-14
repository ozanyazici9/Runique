package com.ozanyazici.run.presentation.active_run

import com.ozanyazici.core.presentation.ui.UiText

interface ActiveRunEvent {
    data class Error(val error: UiText) : ActiveRunEvent
    data object RunSaved: ActiveRunEvent
}