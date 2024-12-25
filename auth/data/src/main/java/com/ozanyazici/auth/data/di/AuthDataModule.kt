package com.ozanyazici.auth.data.di

import com.ozanyazici.auth.data.EmailPatternValidator
import com.ozanyazici.auth.domain.PatternValidator
import com.ozanyazici.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}