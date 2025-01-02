package com.ozanyazici.auth.data

import com.ozanyazici.auth.domain.AuthRepository
import com.ozanyazici.core.data.networking.post
import com.ozanyazici.core.domain.util.DataError
import com.ozanyazici.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {
    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}