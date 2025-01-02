package com.ozanyazici.auth.domain

import com.ozanyazici.core.domain.util.DataError
import com.ozanyazici.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}