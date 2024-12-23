package com.ozanyazici.auth.domain

interface PatternValidator {

    fun matches(value: String): Boolean
}