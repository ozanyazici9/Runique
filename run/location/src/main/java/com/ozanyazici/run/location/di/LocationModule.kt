package com.ozanyazici.run.location.di

import com.ozanyazici.run.domain.LocationObserver
import com.ozanyazici.run.location.AndroidLocationObserver
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val locationModule = module {
    singleOf(::AndroidLocationObserver).bind<LocationObserver>()
}