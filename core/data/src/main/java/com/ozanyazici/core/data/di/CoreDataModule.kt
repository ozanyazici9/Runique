package com.ozanyazici.core.data.di

import com.ozanyazici.core.data.auth.EncryptedSessionStorage
import com.ozanyazici.core.data.networking.HttpClientFactory
import com.ozanyazici.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}